package Aula2;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status(){
        System.out.println("O modelo da caneta: " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Tamanho da ponta: " + this.ponta);
        System.out.println("Quanto de carga tem a caneta? " + "R:" + this.carga);
        System.out.println("Está tampada? " + "R:" + this.tampada);
    }
    
    void rabiscar(){
        if(this.tampada == true){
            System.out.println("Erro! Não posso rabiscar.");
        }else{
            System.out.println("Estou Rabiscando.");
        }
    }
    
    void tampar(){
        this.tampada = true;
    }
    
    void destampar(){
        this.tampada = false;
    }
}
