package Aula12;

public abstract class  Animal {
    //Atributos
    protected float peso;
    protected int idade;
    protected int membros;
    
    //Métodos
    public void locomover(){
        System.out.println("Correndo!");
    }
    
    public void alimentar(){
        System.out.println("Se alimentando!");
    }
    
    public void emitirSom(){
        System.out.println("Imitindo Som!");
    }
    
    //Métodos Especiais

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMembros() {
        return membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }

    @Override
    public String toString() {
        return "Animal{" + "peso=" + peso + ", idade=" + idade + ", membros=" + membros + '}';
    }
    
}
