package exercicio2;

public class SessaoDeTreinamento {
    private int experiencia;
    private JogadorDeFutebol jogadorDeFutebol;

    public SessaoDeTreinamento() {

    }

    public void treinarA(JogadorDeFutebol jogadorDeFutebol) {
        jogadorDeFutebol.correr(1);
        jogadorDeFutebol.fazerGol(1);
        jogadorDeFutebol.correr(1);

        System.out.println("Experiência inicial: " + jogadorDeFutebol.getExperiencia());
        this.experiencia = jogadorDeFutebol.getExperiencia();

        this.experiencia = this.experiencia + 1;
        jogadorDeFutebol.setExperiencia(this.experiencia);
        System.out.println("Experiência final: " + jogadorDeFutebol.getExperiencia());

    }

    public double getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public JogadorDeFutebol getJogadorDeFutebol() {
        return jogadorDeFutebol;
    }

    public void setJogadorDeFutebol(JogadorDeFutebol jogadorDeFutebol) {
        this.jogadorDeFutebol = jogadorDeFutebol;
    }
}
