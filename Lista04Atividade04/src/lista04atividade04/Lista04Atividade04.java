//Faça uma classe executável que calcule e imprima o somatório dos números pares existentes entre 100 e 500.

package lista04atividade04;
public class Lista04Atividade04 {
    public static void main(String[] args) {

        int n, i, soma = 0;
        
        for(i=100; i<500; i++)
        {
            if(i%2==0)
            {
                soma = soma +i;
            }
        }
        
        System.out.println("=====================================================");
        System.out.println("A SOMA DOS NUMEROS PARES ENTRE 100 E 500 É: "+ soma);
        System.out.println("=====================================================");
    }
}
