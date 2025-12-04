package ecommerce.login;

public class LoginClienteEmailSenha extends LoginTemplate {

    private String email;
    private String senha;

    @Override
    protected void coletarCredenciais() {
        System.out.print("Email do cliente: ");
        email = scanner.nextLine();

        System.out.print("Senha: ");
        senha = scanner.nextLine();
    }

    @Override
    protected void validarCredenciais() {
        if (!email.contains("@")) {
            System.out.println("Email inválido!");
            System.exit(0);
        }
        if (senha.length() < 3) {
            System.out.println("Senha muito curta!");
            System.exit(0);
        }
        System.out.println("Credenciais validadas.");
    }

    @Override
    protected void autenticar() {
        System.out.println("Autenticando cliente via Email/Senha...");
        System.out.println("Cliente autenticado com sucesso!");
    }

    @Override
    protected void mostrarDashboard() {
        System.out.println("\n=== Bem-vindo ao E-COMMERCE ===");
        System.out.println("Produtos recomendados:");
        System.out.println("1. Notebook - R$ 2500");
        System.out.println("2. Fone Bluetooth - R$ 120");
        System.out.println("3. Smartwatch - R$ 300\n");
    }
}
