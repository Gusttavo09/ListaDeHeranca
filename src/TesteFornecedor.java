public class TesteFornecedor {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("João Silva", "Rua A, 123", "1234-5678");
        System.out.println("Pessoa: " + pessoa);


        Fornecedor fornecedor = new Fornecedor("Maria Oliveira", "Avenida B, 456", "9876-5432", 5000.00, 2000.00);


        System.out.println("Fornecedor: " + fornecedor);


        System.out.println("Saldo do Fornecedor: R$ " + fornecedor.obterSaldo());


        fornecedor.setValorCredito(6000.00);
        fornecedor.setValorDivida(1000.00);


        System.out.println("Fornecedor Atualizado: " + fornecedor);
        System.out.println("Novo Saldo do Fornecedor: R$ " + fornecedor.obterSaldo());
    }
}
