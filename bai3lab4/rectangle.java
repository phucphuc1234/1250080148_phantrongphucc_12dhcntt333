/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3lab4;

/**
 *
 * @author admin
 */
public class rectangle extends shape{
  private double width = 1.0;
  private double length = 1.0;    
  public rectangle() {
      super();
  }
  public rectangle(double width, double length) {
      super();
      this.width=width;
      this.length=length;
  }
  public rectangle(double width, double length, String color, boolean filled) {
      super(color,filled);
      this.width=width;
      this.length=length;
  }
  public double getwidth() {
      return width;
  }
  public void setwidth(double width) {
      this.width=width;
  }
  public double getlength() {
      return length;
  }
  public void setlength(double length) {
      this.length=length;
  }
  public double getarea() {
      return width * length;
  }
  public double getperimeter() {
      return 2 * (width + length);
  }
  @Override
public String toString() {
    return super.toString()+width+length;
}
}
