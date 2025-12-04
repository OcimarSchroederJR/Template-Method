package ecommerce.login;

import java.util.Scanner;

public abstract class LoginTemplate {

    protected Scanner scanner = new Scanner(System.in);

    public final void login() {
        coletarCredenciais();
        validarCredenciais();
        autenticar();
        mostrarDashboard();
        finalizarProcesso();
    }

    protected abstract void coletarCredenciais();
    protected abstract void validarCredenciais();
    protected abstract void autenticar();
    protected abstract void mostrarDashboard();


    protected void finalizarProcesso() {
        System.out.println("Processo concluído.\n");
    }
}
