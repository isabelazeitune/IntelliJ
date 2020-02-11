public class Main {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("umNome", 10, "umCPF");

        Conta conta1 = new Conta(cliente1, 0);
        conta1.saque(100);

        Conta conta2 = new Conta();
        conta2.deposito(50);

    }
}
