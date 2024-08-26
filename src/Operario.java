public class Operario extends Empregado {

    private double valorProducao;
    private double comissao; // Percentual de comissão (por exemplo, 10 para 10%)


    public Operario() {
        super();
        this.valorProducao = 0.0;
        this.comissao = 0.0;
    }


    public Operario(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double valorProducao, double comissao) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.valorProducao = valorProducao;
        this.comissao = comissao;
    }


    public double getValorProducao() {
        return valorProducao;
    }

    public double getComissao() {
        return comissao;
    }


    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario() {
        double salarioComComissao = super.calcularSalario() + (valorProducao * comissao / 100);
        return salarioComComissao;
    }

    @Override
    public String toString() {
        return super.toString() + ", Valor Produção: R$ " + valorProducao + ", Comissão: " + comissao + "%";
    }
}
