public class Conta {

    public double saldo;
    public Cliente cliente;

    public Conta(double quantiaEmDinheiroDouble) {
        this.saldo = saldo + quantiaEmDinheiroDouble;
    }

    public Conta(int quantiaEmDinheiroInt) {
        this.saldo = saldo - quantiaEmDinheiroInt;
    }

}