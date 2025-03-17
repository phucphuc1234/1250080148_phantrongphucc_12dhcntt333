/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2lab4;

/**
 *
 * @author admin
 */
public class student extends person {
    private String program;
    private int year;
    private double fee;
    public student(String name,String address,String program,int year,double fee){
        super(name, address);
        this.program=program;
        this.year = year;
        this.fee = fee;
    }
    public String getprogram(){
    return program;
    }
    public void setgrogram(String program){
    this.program = program;
    }
    public int getyear(){
    return year;
    }
    public void setyear(int year){
    this.year= year;
    }
    public double getfee(){
    return fee;
    }
    public void setfee(double fee){
    this.fee=fee;
    }
    @Override
    public String toString(){
        return super.toString()+program+year+fee;
    }
}
