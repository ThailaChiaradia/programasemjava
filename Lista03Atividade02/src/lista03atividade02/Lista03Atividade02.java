//2. Implemente um programa que recebe um número de 1 a 7 e imprime o dia da semana correspondente

package lista03atividade02;
import java.util.Scanner;
public class Lista03Atividade02 {
    public static void main(String[] args) {

       Scanner teclado = new Scanner(System.in);
       
       int n;
       System.out.println("==========================================================");
       System.out.println("DIGITE UM NÚMERO DE 1 A 7");
       n = teclado.nextInt();
       
       switch(n)
       {
           case 1: System.out.println("\nO dia da semana correspondente é Domingo");
           break;
           
           case 2: System.out.println("\nO dia da semana correspondente é Segunda");
           break;
           
           case 3: System.out.println("\nO dia da semana correspondente é Terça");
           break;
           
           case 4: System.out.println("\nO dia da semana correspondente é Quarta");
           break;
           
           case 5: System.out.println("\nO dia da semana correspondente é Quinta");
           break;
           
           case 6: System.out.println("\nO dia da semana correspondente é Sexta");
           break;
           
           case 7: System.out.println("\nO dia da semana correspondente é Sábado");
           break;
       }

       System.out.println("==========================================================");
    }
}
