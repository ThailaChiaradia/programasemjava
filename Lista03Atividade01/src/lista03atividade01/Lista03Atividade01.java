//1. Crie um programa que leia dois números e imprima o menor.

package lista03atividade01;
import java.util.Scanner;

public class Lista03Atividade01 {
    public static void main(String[] args) {

        int n1;
        int n2;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("==================================");
        System.out.println("DIGITE DOIS NÚMEROS INTEIROS: ");
        
        System.out.println("\nDigite o primeiro número: ");
        n1 = teclado.nextInt();
        
        System.out.println("\nDigite o segundo número: ");
        n2 = teclado.nextInt();
        
        if (n1 < n2)
        {
            System.out.println("\nO menor número digitado é: " + n1);
        }
        else if (n2 < n1)
        {
            System.out.println("\nO menor número digitado é: " + n2);
        }
        else
        {
            System.out.println("\nOs números digitados são iguais.");
        }
        System.out.println("==================================");
    }
}
