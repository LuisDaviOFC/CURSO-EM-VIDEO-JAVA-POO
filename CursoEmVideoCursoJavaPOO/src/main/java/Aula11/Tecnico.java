package Aula11;

public class Tecnico extends Pessoa{
    //Atributos
    private int registroProfissional;
    
    //Métodos
    public void praticar(){
        System.out.println("Praticando!");
    }
    
    //Métodos Especiais

    public int getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
    
}
