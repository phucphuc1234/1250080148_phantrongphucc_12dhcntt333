/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3lab4;

/**
 *
 * @author admin
 */
public class circle extends shape{
    private double radius=1.0;
    public circle(){
    super();
    }
    public circle(double radius, String color, boolean filled) {
        super(color,filled);
        this.radius=radius;
    }
    public double getradius() {
        return radius;
    }
    public void setradius(double radius) {
        this.radius=radius;
    }
    public double getarea() {
        return Math.PI * radius * radius;
    }
    public double getperimeter() {
        return 2 * Math.PI * radius;
    }
    @Override
     public String toString() {
         return super.toString()+radius;
     }
}
