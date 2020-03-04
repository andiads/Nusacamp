/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractShape;

/**
 *
 * @author ANDI DWI SAPUTRO
 */
public class Triangle extends Shape {
    private float alas;
    private float tinggi;
    
    public Triangle(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }
    
    float getArea() {
        return 0.5f*alas*tinggi;
    }
}
