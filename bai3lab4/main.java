/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3lab4;

/**
 *
 * @author admin
 */
public class main {
    public static void main(String[] args) {
        shape sh = new shape("blue",false);
        System.out.println(sh.toString());
        circle cir = new circle(2.0, "green", true);
        System.out.println(cir.toString());

    }
    
}
