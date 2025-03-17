/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2lab4;

/**
 *
 * @author admin
 */
public class staff extends person{
    private String school;
    private double pay;
    public staff(String name,String address,String school,double pay){
     super(school, address);
     this.school=school;
     this.pay=pay;
    }
    public String getschool(){
        return school;
    }
    public void setschool(String school){
    this.school=school;
    }
    public double getpay(){
        return pay;
    }
    public void setpay(double pay){
    this.pay = pay;
    }
    @Override
    public String toString(){
        return super.toString()+school+pay;
    }
}
