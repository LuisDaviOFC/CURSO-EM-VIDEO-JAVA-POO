package Aula9;

public class Aula09 {
     public static void main(String[] args) {
        Pessoa pessoa[] = new Pessoa[10];
        pessoa[0] = new Pessoa("Paulo", 17, "masculino");
        pessoa[0].fazerAniversario();
        pessoa[0].status();
        
        Livro livro[] = new Livro[10]; 
        livro[0] = new Livro("Harry Potter: A Pedra Filosofal", "J. K. Rowling", 208, 1, pessoa[0]);
        livro[0].abrir();
        //livro[0].avancarPag();
        livro[0].folhear(205);
        livro[0].detalhes();
     }
}
