package ecommerce.login;

public class LoginClienteGoogle extends LoginTemplate {

    private String tokenOAuth;

    @Override
    protected void coletarCredenciais() {
        System.out.println("Redirecionando para Google OAuth...");
        System.out.print("Cole o token OAuth aqui: ");
        tokenOAuth = scanner.nextLine();
    }

    @Override
    protected void validarCredenciais() {
        if (tokenOAuth.length() < 5) {
            System.out.println("Token inválido!");
            System.exit(0);
        }
        System.out.println("Token OAuth validado.");
    }

    @Override
    protected void autenticar() {
        System.out.println("Autenticando via Google...");
        System.out.println("Cliente autenticado via Google!");
    }

    @Override
    protected void mostrarDashboard() {
        System.out.println("\n=== Bem-vindo ao E-COMMERCE ===");
        System.out.println("Você está conectado com Google!");
        System.out.println("Produtos recomendados:");
        System.out.println("1. Headset Gamer - R$ 340");
        System.out.println("2. Mouse sem fio - R$ 90\n");
    }
}
