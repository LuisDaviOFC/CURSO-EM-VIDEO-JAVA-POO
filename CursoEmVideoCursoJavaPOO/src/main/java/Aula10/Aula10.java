package Aula10;

public class Aula10 {
    public static void main(String[] args) {
    //Programa Principal
    Pessoa pessoa1 = new Pessoa();
    Aluno pessoa2 = new Aluno();
    Professor pessoa3 = new Professor();
    Funcionario pessoa4 = new Funcionario();
    
    pessoa1.setNome("Ana Julia");
    pessoa2.setNome("Carlos Eduardo");
    pessoa3.setNome("Laura");
    pessoa4.setNome("Paulo Henrique");
    
    pessoa1.setIdade(25);
    pessoa2.setIdade(16);
    pessoa3.setIdade(25);
    pessoa4.setIdade(30);
    
    pessoa1.setSexo("F");
    pessoa2.setSexo("M");
    pessoa3.setSexo("F");
    pessoa4.setSexo("M");
    
    pessoa2.setCurso("Informatica");
    pessoa3.setSalario(2500.75f);
    pessoa4.setSetor("Estoque");
            
    System.out.println(pessoa1.toString());
    System.out.println(pessoa2.toString());
    System.out.println(pessoa3.toString());
    System.out.println(pessoa4.toString());
    }
}
