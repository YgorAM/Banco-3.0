
import java.util.ArrayList;
import javax.swing.*;

class Clientes {

    String usuario;
    int senhaA;

    public Clientes(String usuario, int senhaA) {
        this.usuario = usuario;
        this.senhaA = senhaA;
    }

    public static void login(ArrayList<Clientes> contas) {
        while (true) {
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
                }
                JOptionPane.showMessageDialog(null, "Usuário ou senha incorretos!");
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Senha deve ser um número válido!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    void menuPrincipal() {
        while (true) {

            String menu = JOptionPane.showInputDialog(null, "MENU PRINCIPAL - Bem-vindo, " + usuario + "\n" + "1 - SALDO \n 2 - CREDITO\n 3 - EMPRESTIMO\n 4 - SAIR");
            try {
                int menuc = Integer.parseInt(menu);

                switch (menuc) {

                    case 1:
                        exibirSaldo();
                        break;
                    case 2:
                        credito();
                        break;
                    case 3:
                        emprestimo();
                        break;
                    case 4:
                        System.exit(0);
                    default:
                        JOptionPane.showMessageDialog(null, "OPCAO INVALIDA", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "AS OPCOES DEVEM SER EM NUMEROS", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }

    }

    void exibirSaldo() {
        JOptionPane.showMessageDialog(null, "SALDO");
    }

    void credito() {
        JOptionPane.showMessageDialog(null, "CREDITO");
    }

    void emprestimo() {
        JOptionPane.showMessageDialog(null, "EMPRESTIMO");
    }
}
