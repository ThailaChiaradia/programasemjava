//Defina a classe Funcionário, contendo os atributos nome, RG e total vendas em R$.
//Crie o método construtor padrão e os métodos seletores e modificadores para cada um de seus atributos.

package atividade03;
public class Atividade03 {
    public static void main(String[] args) {
        
        Vendedor v = new Vendedor();
        
        v.setNome("Mariana");
        v.setRg(12345678);
        v.setVendas(1400.50f);
        v.calcular();
        v.apresentar();
        
        
    }
}