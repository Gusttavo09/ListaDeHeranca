public class TesteOperario {
    public static void main(String[] args) {

        Operario operario = new Operario("Luiz Almeida", "Rua E, 202", "3344-5566", 7, 4000.00, 10.0, 8000.00, 5.0);

        System.out.println("Operário: " + operario);

        System.out.println("Salário Líquido: R$ " + operario.calcularSalario());

        operario.setValorProducao(10000.00);
        operario.setComissao(8.0);

        System.out.println("Operário Atualizado: " + operario);
        System.out.println("Novo Salário Líquido: R$ " + operario.calcularSalario());
    }
}
