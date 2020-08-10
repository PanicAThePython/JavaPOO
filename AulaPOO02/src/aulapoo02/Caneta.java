package aulapoo02;

public class Caneta {
    
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status(){
        System.out.println("Modelo "+this.modelo);
        System.out.println("Uma caneta "+this.cor);
        System.out.println("De ponta "+this.ponta);
        System.out.println("Com carga de "+this.carga+"%");
        System.out.println("Está tampada? "+this.tampada);
    }
    
    void rabiscar(){
        if(this.tampada){
            System.out.println("ERRO! Primeiro destampe a caneta!");
        }
        else{
            if (carga == 0){
                System.out.println("ERRO! Caneta sem tinta!");
            }
            else{
                System.out.println("Rabiscando...");
                this.carga -=3;
            }
                
        }
    }
    
    void pintar(){
        if(this.tampada){
            System.out.println("ERRO! Primeiro destampe a caneta!");
        }
        else{
            if (carga == 0){
                System.out.println("ERRO! Caneta sem tinta!");
            }
            else{
                System.out.println("Pintando...");
                this.carga -=5;
            }
                
        }
    }
    
    void escrever(){
        if(this.tampada){
            System.out.println("ERRO! Primeiro destampe a caneta!");
        }
        else{
            if (carga == 0){
                System.out.println("ERRO! Caneta sem tinta!");
            }
            else{
                System.out.println("Rabiscando...");
                this.carga -=1;
            }
                
        }
    }
    
    void tampar(){
        this.tampada = true;
    }
    
    void destampar(){
        this.tampada = false;
    }
}
