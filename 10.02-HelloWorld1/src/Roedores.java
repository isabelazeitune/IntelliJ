public class Roedores extends Mamiferos {
    private String especie;

    public boolean aquatico;
    public boolean desertico;

    public String amamentar() {
        return "estou amamentando";
    };

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String novaEspecie) {
        this.especie = novaEspecie;
    }
}