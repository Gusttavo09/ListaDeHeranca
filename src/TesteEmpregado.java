public class TesteEmpregado {
    public static void main(String[] args) {

        Empregado empregado = new Empregado("Ana Costa", "Rua C, 789", "1122-3344", 5, 3000.00, 15.0);

        System.out.println("Empregado: " + empregado);

        System.out.println("Salário Líquido: R$ " + empregado.calcularSalario());

        empregado.setSalarioBase(3500.00);
        empregado.setImposto(10.0);

        System.out.println("Empregado Atualizado: " + empregado);
        System.out.println("Novo Salário Líquido: R$ " + empregado.calcularSalario());
    }
}
