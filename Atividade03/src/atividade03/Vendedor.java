//Defina a classe Vendedor, contendo o atributo valor comissão. Esta classe é subclasse da classe Funcionário e deverá implementar
//o método construtor padrão e os métodos seletores e modificadores para cada um de seus atributos. 
//Implemente um método que calcule e retorne o valor da comissão do vendedor, 
//sendo que o valor da comissão é de 5% sobre o valor total das vendas.

package atividade03;
public class Vendedor extends Funcionario{
    
    private float comissao;
    
    public Vendedor() 
    { //metodo construtor
        this.calcular();
        
    }
    
    public void calcular()
    {
        this.comissao = getVendas() * 0.05f;
    }

    public float getComissao() 
    {
        return comissao;
    }

    public void setComissao(float comissao) 
    {
        this.comissao = comissao;
    }

    public void apresentar()
    {
        System.out.println("\n==================================");
        System.out.println("Nome vendedor: " + getNome());
        System.out.println("RG vendedor: " + getRg());
        System.out.println("Valor da venda: R$" + getVendas());
        System.out.println("Valor da comissão: R$" + this.comissao);
        System.out.println("==================================");
    }
    
}
