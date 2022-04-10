//4. Uma empresa decide dar um aumento de 30% aos funcionários com salários inferiores a R$ 500,00. Crie um programa que receba o 
//salário do funcionário e mostre o valor do salário reajustado ou uma mensagem caso o funcionário não tenha direito ao aumento.

package lista03atividade04;
import java.util.Scanner;
public class Lista03Atividade04 {
    public static void main(String[] args) {
 
    Scanner teclado = new Scanner(System.in);
    float salario;
    
    System.out.println("=====================================================");
    System.out.println("DIGITE O VALOR DO SALÁRIO");
    System.out.print("R$ ");
    salario = teclado.nextFloat();
    
    System.out.println("-----------------------------------------------------");
    if(salario < 500)
    {
      System.out.println("Este salário tem direito ao aumento de 30%! \nO novo salário é: R$" + salario * 1.3f);
    }
    else
    {
        System.out.println("Este salário não tem direito ao aumento de 30% \nO salário permanece sendo de: R$" + salario);
    }
    System.out.println("=====================================================");
    }
}
