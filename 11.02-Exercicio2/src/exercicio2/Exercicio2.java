package exercicio2;

public class Exercicio2 {

    public static void main(String[] args) {
        JogadorDeFutebol jogador1 = new JogadorDeFutebol("nome1", 100, 100, 0, 3);
        JogadorDeFutebol jogador2 = new JogadorDeFutebol("nome2", 100, 100, 0, 3);

        SessaoDeTreinamento sessaoDeTreinamento1 = new SessaoDeTreinamento();
        System.out.println("Jogador 1: ");
        sessaoDeTreinamento1.treinarA(jogador1);
        System.out.println("Jogador 2: ");
        sessaoDeTreinamento1.treinarA(jogador2);
    }
}