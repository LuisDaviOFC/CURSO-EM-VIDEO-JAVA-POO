package Aula3;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;
    
   public void status(){
       System.out.println("O modelo da caneta: " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Tamanho da ponta: " + this.ponta);
        System.out.println("Quanto de carga tem a caneta? " + "R:" + this.carga);
        System.out.println("Está tampada? " + "R:" + this.tampada);
    }
    
   public void rabiscar(){
        if(this.tampada == true){
            System.out.println("Erro! Não posso rabiscar.");
        }else{
            System.out.println("Estou Rabiscando.");
        }
    }
    
   protected void tampar(){
        this.tampada = true;
    }
    
   protected void destampar(){
        this.tampada = false;
    }
}