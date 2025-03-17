/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1lab4;

/**
 *
 * @author admin
 */
public class cylinder extends circle {
    private double height=1.0;
    public cylinder(){
        super();
         this.height=1.0;
    }
    public cylinder(double radius){
    super();
    this.height=1.0;
    }
    public cylinder(double radius,double height){
        super();
        this.height=height;
    }
    public double getheight(){
    return height;
    }
    public double getvolume(){
      return getarea()*height;
    }
    @Override
    public String toString(){
        return super.toString()+"height="+height;
    }
}
