/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BangunRuang;

/**
 *
 * @author ANDI DWI SAPUTRO
 */
public class Balok extends BangunRuang{
    private int volumeb;
    public void hitungVolume(int panjang, int lebar, int tinggi){
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
        
        volumeb = panjang*lebar*tinggi;
        System.out.println("Volume balok: "+volumeb);
    }
}
