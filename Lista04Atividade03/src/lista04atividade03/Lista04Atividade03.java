//3. Faça uma classe executável que dado um número inteiro, calcule e imprima o seu fatorial. 
//O fatorial de um número n é n * n-1 * n-2 ... até n = 1. Por exemplo, o fatorial de 4 é 24 ( 4 * 3 *2 * 1).

package lista04atividade03;
import java.util.Scanner;
public class Lista04Atividade03 {
    public static void main(String[] args) {
        
        int n, i;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("=====================================================");
        System.out.println("CALCULANDO FATORIAL DE UM NÚMERO");        
        System.out.print("Digite um número inteiro: ");
        n = teclado.nextInt();
        int resultado = n;
        for(i = n-1; i >= 1; i--)
        {
            resultado = resultado * i;
        }
        
        System.out.println("\nO FATORIAL DE "+ n + " É IGUAL A: "+ resultado);
        System.out.println("=====================================================");
    }
}
