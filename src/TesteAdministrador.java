public class TesteAdministrador {
    public static void main(String[] args) {

        Administrador administrador = new Administrador("Carlos Pereira", "Avenida D, 101", "2233-4455", 3, 5000.00, 12.0, 1500.00);

        System.out.println("Administrador: " + administrador);

        System.out.println("Salário Líquido: R$ " + administrador.calcularSalario());

        administrador.setSalarioBase(5500.00);
        administrador.setImposto(8.0);
        administrador.setAjudaDeCusto(2000.00);

        System.out.println("Administrador Atualizado: " + administrador);
        System.out.println("Novo Salário Líquido: R$ " + administrador.calcularSalario());
    }
}
