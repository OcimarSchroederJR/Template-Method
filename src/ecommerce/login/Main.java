package ecommerce.login;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== SISTEMA DE LOGIN ===");
        System.out.println("1 - Cliente");
        System.out.println("2 - Vendedor");
        System.out.println("3 - Gerente");
        System.out.println("0 - Sair");
        System.out.print("Escolha: ");

        String opcao = scanner.nextLine();
        LoginTemplate login = null;

        switch (opcao) {

            case "1":
                System.out.println("\n=== LOGIN DO CLIENTE ===");
                System.out.println("1 - Email e Senha");
                System.out.println("2 - Google OAuth");
                System.out.println("3 - Token SMS");
                System.out.println("0 - Voltar");
                System.out.print("Escolha o método de login: ");

                String metodo = scanner.nextLine();

                switch (metodo) {
                    case "1": login = new LoginClienteEmailSenha(); break;
                    case "2": login = new LoginClienteGoogle(); break;
                    case "3": login = new LoginClienteTokenSMS(); break;
                    case "0": System.out.println("Voltando..."); System.exit(0);
                    default:  System.out.println("Método inválido!"); System.exit(0);
                }
                break;

            case "2":
                login = new LoginVendedor();
                break;

            case "3":
                login = new LoginGerente();
                break;

            case "0":
                System.out.println("Saindo...");
                System.exit(0);

            default:
                System.out.println("Opção inválida!");
                System.exit(0);
        }

        System.out.println();
        login.login();
    }
}
