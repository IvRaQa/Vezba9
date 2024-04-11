public class Main {
    public static void main(String[] args) {

        Kalkulator kalkulator = new Kalkulator(126,14);

        System.out.println("Zbir dva broja " + kalkulator.add());
        System.out.println("Razlika dva broja " + kalkulator.sub());
        System.out.println("Proizvod dva broja " + kalkulator.mul());
        System.out.println("Kolicnik dva broja "+kalkulator.div());

    }
}