//Defina a classe Funcionário, contendo os atributos nome, RG e total vendas em R$.
//Crie o método construtor padrão e os métodos seletores e modificadores para cada um de seus atributos.

package atividade03;
public class Funcionario {
    
    private String nome;
    private int rg;
    private float vendas;
    
    public Funcionario(){ //metodo construtor
        
    }
    
    public String getNome() 
    {
        return nome;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public int getRg() 
    {
        return rg;
    }

    public void setRg(int rg) 
    {
        this.rg = rg;
    }

    public float getVendas() 
    {
        return vendas;
    }

    public void setVendas(float vendas) 
    {
        this.vendas = vendas;
    }
    
    
    
}
