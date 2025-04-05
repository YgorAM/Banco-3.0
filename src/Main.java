
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Clientes> contas = new ArrayList<>();

        Clientes conta1 = new Clientes("Ygor", 101010);
        Clientes conta2 = new Clientes("Ana Clara", 202020);
        Clientes conta3 = new Clientes("Natan", 303030);
        Clientes conta4 = new Clientes("Nathan", 404040);
        Clientes conta5 = new Clientes("Guilherme", 505050);
        Clientes conta6 = new Clientes("Augusto", 606060);

        contas.add(conta1);
        contas.add(conta2);
        contas.add(conta3);
        contas.add(conta4);
        contas.add(conta5);
        contas.add(conta6);

        Clientes.login(contas);
    }
}
