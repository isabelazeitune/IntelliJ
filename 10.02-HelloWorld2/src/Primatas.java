public class Primatas extends Mamiferos {
    private String especie;
    private String raca;
    private int idade;

    public boolean arboricolas;

    public String amamentar() {
        return "estou amamentando";
    };

    public Primatas(String novaRaca, int novaIdade) {
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