/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3lab4;

/**
 *
 * @author admin
 */
public class shape {
    private String color = "red";
    private boolean filled = true;
    public shape() {
   this.color = "red";
   this.filled = true;
}
    public shape(String color, boolean filled) {
     this.color = color;
     this.filled = filled;
}
    public String getColor() {
return color;
}
public void setcolor(String color) {
this.color = color;
}
public boolean isFilled() {
return filled;
}
public void setFilled(boolean filled) {
this.filled = filled;
}
}
