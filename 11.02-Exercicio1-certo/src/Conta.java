public class Conta {
    private double saldo;
    private Cliente cliente;

    public Conta() {

    }

    public Conta(Cliente cliente, double saldo) {
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public void deposito (double quantiaEmDinheiro) {
        if(quantiaEmDinheiro>0) {
            this.saldo = saldo + quantiaEmDinheiro;
            System.out.println("Saldo atual: " + saldo);
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    public void saque (double quantiaEmDinheiro) {
        if(saldo >= quantiaEmDinheiro) {
            this.saldo = saldo - quantiaEmDinheiro;
            System.out.println("Saldo atual: " + saldo);
        } else {
            System.out.println("Não existe saldo disponível para saque.");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}