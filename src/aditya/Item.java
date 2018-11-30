/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aditya;

/**
 *
 * @author hp
 */
//membuat class Item
public class Item {
    private String nama; //untuk membuat variabel nama item
    private double harga;//untuk membuat variabel harga item
    private int jumlah;//untuk membuat variabel jumlah item
    
    //membuat fungsi Item
    public Item() {
    }
    
    //membuat parameter Item
    public Item(String nama, double harga, int jumlah) {
        this.nama = nama;
        this.harga = harga;
        this.jumlah = jumlah;
    }

    //menambahkan set dan get variabel class Item
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double isHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
    

    @Override
    public String toString() {
        return "Item{" + "nama=" + nama + ", harga=" + harga + ", jumlah=" + jumlah + '}';
    }
    
    public double getTotal(){
        return this.harga * this.jumlah;
    }
    
}
