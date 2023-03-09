package Aula12;

public class Aula12 {
    public static void main(String[] args) {
        Mamifero mamifero1 = new Mamifero();
        mamifero1.setIdade(7);
        mamifero1.setPeso(80f);
        mamifero1.setMembros(4);
        mamifero1.setCorPelo("Marrom");
        mamifero1.alimentar();
        System.out.println(mamifero1.toString() + " e " + "{ cor=" + mamifero1.getCorPelo() + " }");
        System.out.println("----------------------------------------------");
        Reptil reptil1 = new Reptil();
        reptil1.setIdade(4);
        reptil1.setPeso(5f);
        reptil1.setMembros(4);
        reptil1.setCorEscama("Verde");
        reptil1.locomover();
        System.out.println(reptil1.toString() + " e " + "{ cor=" + reptil1.getCorEscama() + " }");
        System.out.println("----------------------------------------------");
        Canguru canguru1 = new Canguru();
        Cachorro cachorro1 = new Cachorro();
        Cobra cobra1 = new Cobra();
        Tartaruga tartaruga1 =new Tartaruga();
        GoldFish goldfish1 = new GoldFish();
        Arara arara1 = new Arara();
        
        canguru1.locomover();
        canguru1.usarBolsa();
    }
}
