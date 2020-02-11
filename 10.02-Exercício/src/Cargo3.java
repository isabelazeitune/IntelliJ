public class Cargo3 extends Funcionario {
    public String Vendas;

    protected double calcularSalario (int horasTrabalhadas, double valorCobradoPorHora) {
        salario = horasTrabalhadas*valorCobradoPorHora;
        return salario;
    };

    public String vender() {
        return "Vendedor";
    };
}