public class Main {

    public static void main(String[] args) {
        Cargo1 cargo1 = new Cargo1();
        Cargo2 cargo2 = new Cargo2();
        Cargo3 cargo3 = new Cargo3();

        System.out.println(cargo1.calcularSalario(8,15));
        System.out.println(cargo2.calcularSalario(8,30));
        System.out.println(cargo3.calcularSalario(8,45));
    }

}
