package ecommerce.login;

public class LoginClienteTokenSMS extends LoginTemplate {

    private String token;

    @Override
    protected void coletarCredenciais() {
        System.out.print("Digite o token SMS de 6 dígitos: ");
        token = scanner.nextLine();
    }

    @Override
    protected void validarCredenciais() {
        if (token.length() != 6) {
            System.out.println("Token inválido! Deve conter exatamente 6 dígitos.");
            System.exit(0);
        }
        System.out.println("Token validado.");
    }

    @Override
    protected void autenticar() {
        System.out.println("Autenticando token SMS...");
        System.out.println("Cliente autenticado via SMS!");
    }

    @Override
    protected void mostrarDashboard() {
        System.out.println("\n=== Bem-vindo ao E-COMMERCE ===");
        System.out.println("Login via SMS foi bem-sucedido!");
        System.out.println("Produtos recomendados:");
        System.out.println("1. Camisa Polo - R$ 70");
        System.out.println("2. Carregador Turbo - R$ 45\n");
    }
}
