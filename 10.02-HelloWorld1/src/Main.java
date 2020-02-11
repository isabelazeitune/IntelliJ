import java.sql.SQLOutput;

public class Main {

    public static void main (String [] args) {
        Primatas primata1 = new Primatas();
        primata1.setEspecie("Humano");
        System.out.println(primata1.getEspecie());

        Primatas primata2 = new Primatas();
        primata2.setEspecie("Bonobo");
        System.out.println(primata2.getEspecie());

        Roedores roedor1 = new Roedores();
        roedor1.setEspecie("Comundongo");
        System.out.println(roedor1.getEspecie());

        Roedores roedor2 = new Roedores();
        roedor2.setEspecie("Ratazana");
        System.out.println(roedor2.getEspecie());

        Lagomorfos lagomorfo1 = new Lagomorfos();
        lagomorfo1.setEspecie("Coelho");
        System.out.println(lagomorfo1.getEspecie());

        Lagomorfos lagomorfo2 = new Lagomorfos();
        lagomorfo2.setEspecie("Lebre");
        System.out.println(lagomorfo2.getEspecie());

        System.out.println(primata1.amamentar());
        System.out.println(roedor1.amamentar());
        System.out.println(lagomorfo1.amamentar());
    }
}
