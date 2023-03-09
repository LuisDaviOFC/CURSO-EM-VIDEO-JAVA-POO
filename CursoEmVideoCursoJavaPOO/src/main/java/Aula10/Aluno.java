package Aula10;

public class Aluno extends Pessoa{
//Atributos
    private int matricula;
    private String curso;

//Métodos
public void cancelarMatricula(){
    this.matricula = 0;
    this.curso = "nenhum";
    System.out.println("Sua matricula foi cancelado!");
}

//Métodos Especiais

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

}
