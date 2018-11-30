/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aditya;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hp
 */
public class TableTransaksi extends DefaultTableModel{
    private String[] kolom;
    
    public TableTransaksi(){
        this.kolom = new String[]{
            "Nama","Harga","Jumlah"
        };
    }
    
    public String[] getKolomNama(){
        return this.kolom;
    }
    
}
