public class Empregado extends Pessoa {

    private int codigoSetor;
    private double salarioBase;
    private double imposto;


    public Empregado() {
        super();
        this.codigoSetor = 0;
        this.salarioBase = 0.0;
        this.imposto = 0.0;
    }


    public Empregado(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto) {
        super(nome, endereco, telefone);
        this.codigoSetor = codigoSetor;
        this.salarioBase = salarioBase;
        this.imposto = imposto;
    }


    public int getCodigoSetor() {
        return codigoSetor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double getImposto() {
        return imposto;
    }


    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public double calcularSalario() {
        return salarioBase - (salarioBase * imposto / 100);
    }

    @Override
    public String toString() {
        return super.toString() + ", Código do Setor: " + codigoSetor + ", Salário Base: R$ " + salarioBase + ", Imposto: " + imposto + "%";
    }
}
