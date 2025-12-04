package ecommerce.login;

public class LoginGerente extends LoginTemplate {

    private String senhaMestra;

    @Override
    protected void coletarCredenciais() {
        System.out.print("Senha mestra do gerente: ");
        senhaMestra = scanner.nextLine();
    }

    @Override
    protected void validarCredenciais() {
        if (!"MASTER123".equals(senhaMestra)) {
            System.out.println("Senha mestra incorreta!");
            System.exit(0);
        }
        System.out.println("Senha mestra validada.");
    }

    @Override
    protected void autenticar() {
        System.out.println("Autenticando gerente...");
        System.out.println("Gerente autenticado com sucesso!");
    }

    @Override
    protected void mostrarDashboard() {
        System.out.println("\n=== PAINEL DO GERENTE ===");
        System.out.println("📊 Estatísticas do dia:");
        System.out.println("• Total vendido hoje: R$ 12.740");
        System.out.println("• 47 pedidos finalizados");
        System.out.println("• 3 reclamações registradas\n");
    }
}
