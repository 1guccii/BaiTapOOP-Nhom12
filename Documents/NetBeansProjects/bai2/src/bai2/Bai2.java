/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai2;

/**
 *
 * @author PC
 */
class Number {
public int i;
}
public class Bai2 {

    public static void main(String[] args) {
        // TODO code application logic here
        Number n1 = new Number();
        Number n2 = new Number();
 n1.i = 2;
 n2.i = 5;
 n1 = n2;
 n2.i = 10;
 n1.i = 20;
        System.out.println("Gia tri cua n1.i la: " + n1.i);
        System.out.println("Gia tri cua n2.i la: " + n2.i );
    }
    
}
