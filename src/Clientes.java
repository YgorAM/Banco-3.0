import javax.swing.*;
import java.util.ArrayList;

class Clientes {
    String usuario;
    int senhaA;

    public Clientes(String usuario, int senhaA) {
        this.usuario = usuario;
        this.senhaA = senhaA;
    }

    public static void login(ArrayList<Clientes> contas) {
        String usuarioM = JOptionPane.showInputDialog(null, "Insira seu usuário:");
        String senhaM = JOptionPane.showInputDialog(null, "Insira sua senha:");
        try {
            int senhac = Integer.parseInt(senhaM);

            for (Clientes conta : contas) {
                if (usuarioM.equals(conta.usuario) && senhac == conta.senhaA) {
                    JOptionPane.showMessageDialog(null, "Login bem-sucedido!\nBem-vindo, " + conta.usuario);
                    conta.menuPrincipal();
                    return;
                }
            } JOptionPane.showMessageDialog(null, "Usuário ou senha incorretos!");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Senha deve ser um número válido!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    void menuPrincipal() {
        JOptionPane.showMessageDialog(null, "MENU PRINCIPAL - Bem-vindo, " + usuario);
    }
}
