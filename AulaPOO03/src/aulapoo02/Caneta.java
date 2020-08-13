package aulapoo02;

public class Caneta {
    
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;
    
    void status(){
        System.out.println("Modelo "+this.modelo);
        System.out.println("Uma caneta "+this.cor);
        System.out.println("De ponta "+this.ponta);
        System.out.println("Com carga de "+this.carga+"%");
        System.out.println("Está tampada? "+this.tampada);
    }
    
    public void rabiscar(){
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
    
    public void pintar(){
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
    
    public void escrever(){
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
    
    private void tampar(){
        this.tampada = true;
    }
    
    private void destampar(){
        this.tampada = false;
    }
}
