package atividade02;
public class Cliente {
    
    private String nome;
    private float despesas;
    private float total;
    
    public Cliente()
    {// metodo construtor
        this.nome = "Laura";
        this.despesas = 150.50f;
        this.totalDespesa();
    }

    public void totalDespesa()
    {
        this.total = (despesas * 110)/100;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getDespesas() {
        return despesas;
    }

    public void setDespesas(float despesas) {
        this.despesas = despesas;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
    
    public void apresentar()
    {
        System.out.println("\n==================================");
        System.out.println("\nCliente: " + getNome());
        System.out.println("Despesa: R$" + getDespesas());
        System.out.println("Despesa Total: R$" + this.total);
        System.out.println("\n==================================");
    }    
   
}
