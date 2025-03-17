/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2lab4;

/**
 *
 * @author admin
 */
public class person {
    private final  String name;
    private String address;
    public person(String name, String address){
        this.name = name;
        this.address=address;
    }
    public String getname(){
     return name;
    }
    public String getaddress(){
     return address;
    }
    public void setaddress(String address){
    this.address=address;
    }
    @Override
    public String toString(){
    return name+address;
}
}
