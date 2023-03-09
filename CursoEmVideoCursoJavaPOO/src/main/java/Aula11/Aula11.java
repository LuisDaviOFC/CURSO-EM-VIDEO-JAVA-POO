package Aula11;

public class Aula11 {
    public static void main(String[] args) {
        
    //Pessoa pessoa1 = new Pessoa();
    
    Visitante visitante1 = new Visitante();
    visitante1.setNome("Paulo");
    visitante1.setIdade(22);
    visitante1.setSexo("M");
    System.out.println(visitante1.toString());
    System.out.println("--------------------------------------------");
    Aluno aluno1 = new Aluno();
    aluno1.setNome("Pedro Henrique");
    aluno1.setIdade(18);
    aluno1.setSexo("M");
    aluno1.setMatricula(1);
    aluno1.setCurso("Sistemas de Informação");
    System.out.println(aluno1.toString());
    aluno1.pagarMensalidade();
    
    Bolsista bolsista1 = new Bolsista();
    bolsista1.setNome("Bruno");
    bolsista1.setIdade(20);
    bolsista1.setBolsa(12.5f);
    bolsista1.setSexo("M");
    System.out.println(bolsista1.toString() + " e " +  "{" + bolsista1.getBolsa() + "}");
    bolsista1.pagarMensalidade();
    
    Professor professor1 = new Professor();
    professor1.setNome("Nadio");
    professor1.setIdade(38);
    professor1.setSexo("M");
    professor1.setEspecialidade("Educação Fisica");
    professor1.setSalario(1350.00f);
    professor1.receberAumento(350.00f);
    System.out.println(professor1.toString() + " e " + "{" + professor1.getEspecialidade() + " , " + professor1.getSalario() + "}");
   
    Tecnico tecnico1 = new Tecnico();
    tecnico1.setNome("Paulo Henrique");
    tecnico1.setIdade(25);
    tecnico1.setSexo("M");
    tecnico1.setRegistroProfissional(1);
    tecnico1.praticar();
    System.out.println(tecnico1.toString() + " e " + "{" + tecnico1.getRegistroProfissional() + "}");
    
    }
}
