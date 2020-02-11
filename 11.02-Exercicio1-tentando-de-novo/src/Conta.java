public class Conta {
    private double saldo;
    private Cliente cliente;

    public Conta() {

    }

    public Conta(Cliente cliente, double saldo) {
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public double getDeposito () {
        return saldo;
    }

    public void setDeposito (double quantiaEmDinheiro) {
        if(quantiaEmDinheiro>0) {
            this.saldo = saldo + quantiaEmDinheiro;
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    public double getSaque () {
        return saldo;
    }

    public void setSaque (double quantiaEmDinheiro) {
        if(quantiaEmDinheiro<=saldo) {
            this.saldo = saldo - quantiaEmDinheiro;
        } else {
            System.out.println("Não existe saldo disponível.");
        }
    }
}