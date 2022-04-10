//2. Faça uma classe executável que calcule e imprima a média do somatório dos números inteiros existentes entre 500 e 700.

package lista04atividade02;
public class Lista04Atividade02 {
    public static void main(String[] args) {

        int i = 500;
        int n=0;
        int soma = 0;
        int media;
        
        do
        {
            soma = soma + i;
            i++;
            n++;
        }while(i<700);
        
        media = (soma)/n;
        System.out.println("=====================================================");
        System.out.println("A SOMA DOS NÚMEROS É: "+ soma);        
        System.out.println("A MÉDIA DAS SOMAS É:  "+ media);
        System.out.println("=====================================================");
    }
}
