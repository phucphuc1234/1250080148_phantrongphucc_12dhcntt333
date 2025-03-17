/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2lab4;

/**
 *
 * @author admin
 */
public class main {
    public static void main(String[] args) {
        person per = new person("nguyen van phep","123 le van sy");
        System.out.print(per.toString());
        student stu = new student("nguyen thi no","456 cong hoa","computer science",2, 5000.0);
          System.out.print(stu.toString());
          staff st = new staff("anh huynh","789 cao thang","tech university",60000.0);
            System.out.print(st.toString());
    }
}
