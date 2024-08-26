public class TesteVendedor {
    public static void main(String[] args) {

        Vendedor vendedor = new Vendedor("Fernanda Souza", "Avenida F, 303", "5566-7788", 2, 3500.00, 12.0, 12000.00, 7.0);


        System.out.println("Vendedor: " + vendedor);


        System.out.println("Salário Líquido: R$ " + vendedor.calcularSalario());


        vendedor.setValorVendas(15000.00);
        vendedor.setComissao(8.0);


        System.out.println("Vendedor Atualizado: " + vendedor);
        System.out.println("Novo Salário Líquido: R$ " + vendedor.calcularSalario());
    }
}
