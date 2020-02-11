public class Main {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("umNome", 10, "umCPF");

        Conta conta1 = new Conta(cliente1, 0);
        conta1.setSaque(100);
        System.out.println(conta1.getSaque());

        Conta conta2 = new Conta();
        conta2.setDeposito(50);
        System.out.println(conta2.getDeposito());

    }
}
