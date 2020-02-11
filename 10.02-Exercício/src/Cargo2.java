public class Cargo2 extends Funcionario {
    public String TI;

    protected double calcularSalario (int horasTrabalhadas, double valorCobradoPorHora) {
        salario = horasTrabalhadas*valorCobradoPorHora;
        return salario;
    };

    public String programar() {
        return "Programador";
    };
}