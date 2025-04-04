
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Clientes> contas = new ArrayList<>();

        Clientes conta1 = new Clientes("Ygor", 405730);
        Clientes conta2 = new Clientes("Ana", 123456);
        Clientes conta3 = new Clientes("Carlos", 987654);

        contas.add(conta1);
        contas.add(conta2);
        contas.add(conta3);

        Clientes.login(contas);
    }
}
