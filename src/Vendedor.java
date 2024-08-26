public class Vendedor extends Empregado {

    private double valorVendas;
    private double comissao; // Percentual de comissão (por exemplo, 10 para 10%)

    public Vendedor() {
        super();
        this.valorVendas = 0.0;
        this.comissao = 0.0;
    }

    public Vendedor(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double valorVendas, double comissao) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.valorVendas = valorVendas;
        this.comissao = comissao;
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public double getComissao() {
        return comissao;
    }


    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }


    @Override
    public double calcularSalario() {
        double salarioComComissao = super.calcularSalario() + (valorVendas * comissao / 100);
        return salarioComComissao;
    }

    @Override
    public String toString() {
        return super.toString() + ", Valor Vendas: R$ " + valorVendas + ", Comissão: " + comissao + "%";
    }
}
