/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai1;

/**
 *
 * @author PC
 */
class Number {
public int i;
}
public class Bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Number n1 = new Number();
 Number n2 = new Number();
 n1.i = 2;
 n2.i = 5;
 n1.i = n2.i;
 n2.i = 10;
        System.out.println("Gia tri cua n1.i la: " + n1.i);
    }
    
}
