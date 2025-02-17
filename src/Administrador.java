public class Administrador extends Empregado {

    private double ajudaDeCusto;


    public Administrador(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double ajudaDeCusto) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.ajudaDeCusto = ajudaDeCusto;
    }


    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }


    @Override
    public double calcularSalario() {
        return super.calcularSalario() + ajudaDeCusto;
    }


    @Override
    public String toString() {
        return super.toString() + ", Ajuda de Custo: R$ " + ajudaDeCusto;
    }
}
