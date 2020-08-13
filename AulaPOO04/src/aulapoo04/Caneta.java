package aulapoo04;
public class Caneta {
    public String modelo;
    private String cor;
    private float ponta;
    private boolean tampada;
    
    //atalho pra criar: ctrl+I
    
    public Caneta(String modelo, String cor, float ponta){
        //metodo construct
        this.tampar();
        this.cor = cor;
        this.modelo = modelo;
        this.setPonta(ponta);
    }
    
    public void tampar(){
        this.tampada = true;
    }
    
    public void destampar(){
        this.tampada = false;
    }
    
    public String getModelo(){
        return this.modelo;
    }
    
    public void setModelo(String novoModelo){
        this.modelo = novoModelo;
    }
    public float getPonta(){
        return this.ponta;
    }
    
    public void setPonta(float novaPonta){
        this.ponta = novaPonta;
    }
    
    public void status(){
        System.out.println("________________________");
        System.out.println("| SOBRE A CANETA: .....|");
        System.out.println("|......................|");
        System.out.println("|Modelo "+this.getModelo() + "....|");
        System.out.println("|De ponta "+this.getPonta()+"..........|");
        System.out.println("|Uma caneta "+this.cor+ ".......|");
        System.out.println("|Está tampada? "+this.tampada+ "...|");
        System.out.println("|______________________|");
    }
}
