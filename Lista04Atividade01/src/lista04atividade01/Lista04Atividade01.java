//1. Faça uma classe executável que calcule e imprima o somatório de todos os números inteiros existentes entre 200 e 400.

package lista04atividade01;
public class Lista04Atividade01 {
    public static void main(String[] args) {

        int i;
        int soma = 0;
        
        for(i=200; i<400; i++)
        {
            soma = soma + i;
        }
        System.out.println("=====================================================");
        System.out.println("O RESULTADO É IGUAL A: " + soma);
        System.out.println("=====================================================");
    }
}
