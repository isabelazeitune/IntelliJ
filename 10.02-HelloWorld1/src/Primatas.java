public class Primatas extends Mamiferos {
    private String especie;
    private String raca;
    private int idade;

    public boolean arboricolas;

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