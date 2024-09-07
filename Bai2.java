class Number2 {
   public int i ;
}

public class Bai2 {
   public static void main(String[] args) {
   Number n1 = new Number();
   Number n2 = new Number();
   n1.i = 2;
   n2.i = 5;
   n1 = n2;
   n2.i = 10;
   n1.i = 20;
   System.out.println("Gia tri cua n1 la : " + n1.i); 
   System.out.println("Gia tri cua n2 la : " + n2.i); 
   }
  }
  