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
public class Kerucut extends BangunRuang{
    int jari;
    int pi;
    public void hitungVolume(int jari,int pi,int tinggi){
        
        this.jari=jari;
        this.pi=pi;
        this.tinggi=tinggi;
        
        volume=jari*pi*tinggi;
        System.out.println("Volume kerucut : "+volume);
    }
}
