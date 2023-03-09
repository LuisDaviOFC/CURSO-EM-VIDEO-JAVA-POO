package Aula12;

public class Mamifero  extends Animal{
    //Atributo
    private String  corPelo;
    
    //Métodos
    @Override
    public void locomover(){
        System.out.println("Correndo");
    }
    
    @Override
    public void alimentar(){
        System.out.println("Mamando");
    }
    
    @Override
    public void emitirSom(){
        System.out.println("Som de Mamifero");
    }
    
    //Métodos Especiais

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    
}
