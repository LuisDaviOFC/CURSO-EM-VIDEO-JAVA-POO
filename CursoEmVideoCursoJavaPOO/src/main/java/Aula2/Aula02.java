package Aula2;

public class Aula02 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "Big Cristal";
        c1.cor  = "azul";
        c1.ponta = 0.5f;
        c1.tampar();
        c1.carga = 90;
        c1.status();
        c1.rabiscar();
        
        Caneta c2 = new Caneta();
        c2.modelo = "Curso em video";
        c2.cor  = "vermelho";
        c2.ponta = 1.0f;
        c2.destampar();
        c2.carga = 75;
        c2.status();
        c2.rabiscar();
    }
}
