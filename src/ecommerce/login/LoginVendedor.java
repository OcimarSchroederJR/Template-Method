package ecommerce.login;

public class LoginVendedor extends LoginTemplate {

    private String codigoFuncionario;

    @Override
    protected void coletarCredenciais() {
        System.out.print("Código do funcionário (Vendedor): ");
        codigoFuncionario = scanner.nextLine();
    }

    @Override
    protected void validarCredenciais() {
        if (!codigoFuncionario.startsWith("VEND")) {
            System.out.println("Código de vendedor inválido!");
            System.exit(0);
        }
        System.out.println("Código validado.");
    }

    @Override
    protected void autenticar() {
        System.out.println("Autenticando vendedor...");
        System.out.println("Vendedor autenticado com sucesso!");
    }

    @Override
    protected void mostrarDashboard() {
        System.out.println("\n=== PAINEL DO VENDEDOR ===");
        System.out.println("1. Cadastrar novo produto");
        System.out.println("2. Ver pedidos pendentes");
        System.out.println("3. Atualizar estoque\n");
    }
}
