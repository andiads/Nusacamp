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
public class Circle extends Shape {
    private float radius;
    public Circle(float radius){
        this.radius=radius;
    }
    
    float getArea() {
        return (float) (Math.PI*Math.sqrt(radius));
    }
}
