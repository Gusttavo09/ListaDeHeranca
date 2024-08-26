public class Fornecedor extends Pessoa{
    private double valorCredito;
    private double valorDivida;


    public Fornecedor(String nome, String endereco, String telefone, double valorCredito, double valorDivida) {
        super(nome, endereco, telefone);
        this.valorCredito = valorCredito;
        this.valorDivida = valorDivida;
    }

    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }
    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }
    public double obterSaldo() {
        return valorCredito - valorDivida;
    }
    @Override
    public String toString() {
        return super.toString() + ", Valor Crédito: R$ " + valorCredito + ", Valor Dívida: R$ " + valorDivida;
    }
}
