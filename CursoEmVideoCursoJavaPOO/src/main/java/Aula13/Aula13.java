package Aula13;

public class Aula13 {

    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro();
        cachorro1.reagir("Toma comida");
        System.out.println("-----------------------");
        cachorro1.reagir(true);
        System.out.println("-----------------------");
        cachorro1.reagir(10, 0);
        System.out.println("-----------------------");
        cachorro1.reagir(8.5f, 10);
    }
}
