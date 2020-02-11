public class Lagomorfos extends Mamiferos {
    private String especie;
    private String raca;
    private int idade;

    public String cor;

    public String amamentar() {
        return "estou amamentando";
    };

    public Lagomorfos(String novaRaca, int novaIdade) {
        this.raca = novaRaca;
        this.idade = novaIdade;
    }

    public String getRaca() {
        return raca;
    }

    public int getIdade() {
        return idade;
    }
}