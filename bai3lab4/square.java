/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3lab4;

/**
 *
 * @author admin
 */
public class square extends rectangle{
    public square() {
    super();
}
    public square(double side) {
        super(side,side);
    }
    public square(double side, String color, boolean filled) {
        super(side,side,color,filled);
    }
    public double getside() {
       return getlength();
    }
    public void setside(double side) {
       setwidth(side);
       setlength(side);
    }
    @Override
public String toString() {
    return super.toString()+getside();
}
}
