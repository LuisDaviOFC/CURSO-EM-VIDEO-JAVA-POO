package Aula10;


public class Professor extends Pessoa{
//Atributos
    private String especialidade;
    private float salario;
    
//Métodos
    public void ReceberAumento(float aumento){
       this.salario += aumento;
        System.out.println("O novo salario é de: " + salario );
    }
    
//Métodos Especiais

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
}
