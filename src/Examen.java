import java.util.Scanner;

public class Examen {
   public static void main(String[] ar) {
      Scanner teclado = new Scanner(System.in);
      int num1 = 0, num2 = 0;
      int resta, div1, div2;
      System.out.println("Ingresa el primer numero a evaluar");
      num1 = teclado.nextInt();


      System.out.println("Ingresa el segundo numero a evaluar");
      num2 = teclado.nextInt();

      resta = (num1 - num2);
      div1 = (num1/resta);
      div2 = (num2 / resta);

      System.out.println("El resultado de la resta es igual" + resta);
      System.out.println("El resultado de la divición del primer numero es igual=" + div1);
      System.out.println("El resultado de la divición del segundo numero es igual=" + div2);

   }
}
