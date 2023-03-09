package Aula9;

public class Livro implements Publicacao{
    //Atributos
    private String titulo;
    private String autor;
    private int totalpaginas;
    private int paginaatual;
    private boolean aberto;
    private Pessoa leitor;
    
    //Métodos
    
    public Livro(String titulo, String autor, int totalpaginas, int paginaatual, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalpaginas = totalpaginas;
        this.paginaatual = paginaatual;
        this.leitor = leitor;
    }
    
    //Métodos Especiais

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotalpaginas() {
        return totalpaginas;
    }

    public void setTotalpaginas(int totalpaginas) {
        this.totalpaginas = totalpaginas;
    }

    public int getPaginaatual() {
        return paginaatual;
    }

    public void setPaginaatual(int paginaatual) {
        this.paginaatual = paginaatual;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    
    public void detalhes(){
        System.out.println("----------LIVRO-----------");
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Autor(a) " + this.autor);
        System.out.println("Total de Paginas: " + this.totalpaginas);
        System.out.println("Pagina Atual: " + this.paginaatual);
        System.out.println("O livro esta aberto? " + this.aberto);
        System.out.println("Leitor: " + this.leitor.getNome());
    }

    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear(int pagina) {
        if (pagina > this.totalpaginas) {
            this.paginaatual = 0;
        } else{
            this.paginaatual = pagina;
        }
    }

    @Override
    public void avancarPag() {
     this.paginaatual = this.paginaatual + 1;
    }

    @Override
    public void voltarPag() {
     this.paginaatual = this.paginaatual - 1;
    }

}
