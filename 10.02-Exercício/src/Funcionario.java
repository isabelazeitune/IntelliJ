public class Funcionario {

    protected double salario;

    protected double calcularSalario(int horasTrabalhadas, double valorCobradoPorHora) {
        return horasTrabalhadas*valorCobradoPorHora;
    };
}