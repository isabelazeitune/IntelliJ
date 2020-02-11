public class Lagomorfos extends Mamiferos {
    private String especie;

    public String cor;

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