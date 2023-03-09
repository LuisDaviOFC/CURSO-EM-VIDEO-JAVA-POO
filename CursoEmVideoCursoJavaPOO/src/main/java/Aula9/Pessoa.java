package Aula9;

public final class Pessoa {
    //Atributos
    String nome;
    private int idade;
    private String sexo;
    
    //Métodos
    public void fazerAniversario(){
       this.idade = this.idade + 1;
        System.out.println("Hoje você tem " + this.idade + " Anos");
    }
    
    //Métodos Especiais

    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public void status(){
        System.out.println("----------PESSOA----------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Sexo: " + this.sexo);
        System.out.println("--------------------------");
    }
}
