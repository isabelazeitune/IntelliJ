public class Cargo1 extends Funcionario {
    public String Marketing;

    protected double calcularSalario (int horasTrabalhadas, double valorCobradoPorHora) {
        salario = horasTrabalhadas*valorCobradoPorHora;
        return salario;
    };

    public String escrever() {
        return "Redator";
    };
}