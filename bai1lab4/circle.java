/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1lab4;

/**
 *
 * @author admin
 */
public class circle {
   private double radius =1.0;
    private String color ="red";
    public circle(){
        this.radius=1.0;
        this.color="red";
    }
    public double getradius(){
        return radius;
    }
    public String getcolor(){
        return color;
    }
    public void setradius(double radius){
        this.radius=radius;
    }
    public void setcolor(String color){
        this.color=color;
    }
    public double getarea(){
         return Math.PI * radius * radius;
    }
    @Override
    public String toString(){
    return "radius="+radius+"color ="+color;       
}
}
