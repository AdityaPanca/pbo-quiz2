/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aditya;

import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class Transaksi {
    private String kode;
    private ArrayList<Item> items = new ArrayList();
    private float total;

    public Transaksi() {
    }

    public Transaksi(String kode, float total, ArrayList<Item> items) {
        this.kode = kode;
        this.total = total;
        this.items = items;
    }

    Transaksi(String code, ArrayList<Item> beli) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void setTotal(){
        float total = 0;
        for(Item item : this.items){
            total += item.getTotal();
        }
        this.total = total;
        
    }
    public String Pembayaran(){
            setTotal();
            String obt ="";
            obt += "Kode\t\t : " + this.kode + "\n";
            obt += "Daftar Belanja : \n ";
            for (Item item : this.items){
                obt += "\t" + item.getNama() + "(" + item.getJumlah() + ") :" +item.getTotal() + "\n";
            }
            obt += "Total\t\t : " + this.total;
            return obt;
    }

    
    
    
    
}
