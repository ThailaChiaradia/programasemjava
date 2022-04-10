//Faça uma classe executável que dados os limites de um intervalo [a; b], informe a soma de todos os números naturais neste intervalo.
//Exemplo: [4, 7] => 4+5+6+7=22.

package lista04atividade05;
import java.util.Scanner;
public class Lista04Atividade05 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int n1, n2, i, soma=0;
        System.out.println("=====================================================");
        System.out.println("SOMA DOS NUMEROS DENTRO DE UM INTERVALO");
        System.out.print("\nDigite o primeiro número: ");
        n1 = teclado.nextInt();
        
        System.out.print("Digite o segundo número: ");
        n2 = teclado.nextInt();
        
        if(n1 < n2)
        {
            for(i = n1; i<=n2; i++)
            {
                soma = soma + i; 
            }
        }
        else if(n1 > n2)
        {
            for(i = n2; i<=n1; i++)
            {
                soma = soma + i; 
            }            
        }else if(n1 == n2)
        {
            soma = n1;
        }
                    
        System.out.println("A soma dos números dentro do intervalo digitado é: "+ soma);
        System.out.println("=====================================================");
    }
}
