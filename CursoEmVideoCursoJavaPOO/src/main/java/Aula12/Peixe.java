package Aula12;

public class Peixe extends Animal{
    //Atributos
    private String corEscama;
    
    //Métodos
    @Override
    public void locomover(){
        System.out.println("Nadando");
    }
    
    @Override
    public void alimentar(){
        System.out.println("Comendo Substancias");
    }
    
    @Override
    public void emitirSom(){
        System.out.println("Peixe não faz barulho");
    }
    
    public void soltarBolha(){
        System.out.println("Soltou uma bolha");
    }
    
    //Métodos Especiais

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
}
