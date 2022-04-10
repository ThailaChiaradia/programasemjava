//3. Crie um programa que receba dois números e execute as operações listadas abaixo de acordo com a escolha do usuário.
//1 -> Média entre os números digitados
//2 ->Diferença do maior pelo menor
//3 -> Produto entre os números digitados

package lista03atividade03;
import java.util.Scanner;
public class Lista03Atividade03 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int n1, n2;
        int opcao;
        int resultado;
        
        System.out.println("DIGITE DOIS NÚMERO INTEIROS");
        
        System.out.println("\nDigite o primeiro número: ");
        n1 = teclado.nextInt();
        
        System.out.println("\nDigite o segundo número: ");
        n2 = teclado.nextInt();
        
        System.out.println("-------------------------------------------");
        System.out.println("DIGITE O NÚMERO CONFORME A AÇÃO DESEJADA\n");
        System.out.println("1 - Média entre os números digitados");
        System.out.println("2 - Diferença do maior pelo menor");
        System.out.println("3 - Produto entre os números digitados");
        opcao = teclado.nextInt();
        System.out.println("-------------------------------------------");
        
        if(opcao == 1)
        {//1 - Média entre os números digitados
            resultado = (n1 + n2)/2;
            System.out.println("OPÇÃO ESCOLHIDA: 1 - CALCULAR A MEDIA DOS NÚMEROS DIGITADOS");
            System.out.println("\nO resultado é: " + resultado);
        }
        else if (opcao == 2)
        {//2 - Diferença do maior pelo menor
            resultado = (n1>n2)?n1-n2:n2-n1;
            System.out.println("OPÇÃO ESCOLHIDA: 2 - CALCULAR DIFERENÇA DO MAIOR PELO MENOR");
            System.out.println("\nO resultado é: " + resultado);
        }
        else if (opcao == 3)
        {//3 - Produto entre os números digitados
            resultado = (n1*n2);
            System.out.println("OPÇÃO ESCOLHIDA: 3 - CALCULAR O PRODUTO DOS NÚMEROS DIGITADOS");
            System.out.println("\nO resultado é: " + resultado);
        }
        else
        {
            System.out.println("\nNÚMERO DIGITADO INVÁLIDO");
        }
    }
}
