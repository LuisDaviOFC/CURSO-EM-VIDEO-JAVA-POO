package Aula5;

public class ClienteBanco {
    public static void main(String[] args) {
      ContaBanco pessoa1 = new ContaBanco();
      pessoa1.setNumConta(1);
      pessoa1.setDono("Luis Davi");
      pessoa1.abrirConta("CC");
      
      ContaBanco pessoa2 = new ContaBanco();
      pessoa2.setNumConta(2);
      pessoa2.setDono("Maria");
      pessoa2.abrirConta("CP");
      
      
      pessoa1.depositar(300f);
      pessoa2.depositar(500f);
      pessoa1.sacar(350f);
      pessoa2.sacar(100f);
      
      pessoa1.fecharConta();
      
      pessoa1.estadoAtual();
      pessoa2.estadoAtual();
    }
}
