public class Roedores extends Mamiferos {
    private String especie;
    public String raca;
    public int idade;

    public boolean aquatico;
    public boolean desertico;

    public String amamentar() {
        return "estou amamentando";
    };

    public Roedores(String novaRaca, int novaIdade) {
        this.raca = novaRaca;
        this.idade = novaIdade;
    }

}