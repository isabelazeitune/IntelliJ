package exercicio2;

public class JogadorDeFutebol {
    private String nome;
    private int energia;
    private int alegria;
    private int gols;
    private int experiencia;

    public JogadorDeFutebol(String nome, int energia, int alegria, int gols, int experiencia) {
        this.nome = nome;
        this.energia = energia;
        this.alegria = alegria;
        this.gols = gols;
        this.experiencia = experiencia;
    }

    public void fazerGol(int vezes) {
        for(int i = 0; i < vezes; i++) {
            if(this.energia >= 5) {
                this.energia = this.energia-5;
                this.alegria = this.alegria + 10;
                this.gols = this.gols + 1;
                System.out.println("GOOOOL!");
            } else {
                System.out.println("O jogador não possui energia para fazer gol.");
            }
        }
    }

    public void correr(int vezes) {
        for(int i = 0; i < vezes; i++) {
            if(this.energia >= 10) {
                this.energia = this.energia - 10;
                System.out.println("Cansei.");
            } else {
                System.out.println("O jogador não possui energia para correr.");
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getAlegria() {
        return alegria;
    }

    public void setAlegria(int alegria) {
        this.alegria = alegria;
    }

    public int getGols() {
        return gols;
    }

    public void setGols(int gols) {
        this.gols = gols;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }
}