public class Main {

    public static void main (String [] args) {

        Primatas primata3 = new Primatas("Amarelo", 5);
        System.out.println(primata3.getRaca() + ", " + primata3.getIdade());

        Roedores roedor3 = new Roedores("seiLa", 10);
        System.out.println(roedor3.raca + ", " + roedor3.idade);

       Lagomorfos lagomorfo3 = new Lagomorfos("umaRaça", 24);
        System.out.println(lagomorfo3.getRaca() + ", " + lagomorfo3.getIdade());

    }
}
