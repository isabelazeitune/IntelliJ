public class Main {

    public static void main(String[] args) {

        Conta saque = new Conta (120);
        System.out.println(saque.saldo);

        Conta deposito = new Conta (120.4);
        System.out.println(deposito.saldo);
    }
}
