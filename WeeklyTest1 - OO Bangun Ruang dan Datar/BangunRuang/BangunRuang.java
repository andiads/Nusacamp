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
public class BangunRuang {
    int panjang,lebar,tinggi,sisi;
    int volumeb,volumek,volume;
    void hitungVolume(){
        System.out.println("Hitung volume suatu bangun ruang");
    }
    public static void main(String[] args){
        Kubus kubus = new Kubus();
        Balok balok = new Balok();
        Kerucut kerucut = new Kerucut();
        
        
        kubus.hitungVolume(10, 11, 20);
        balok.hitungVolume(3, 4, 9);
        kerucut.hitungVolume(4, 8, 5);
        
    }
}
