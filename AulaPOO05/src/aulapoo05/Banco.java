package aulapoo05;
public class Banco {
    public int numConta;
    private String nomeDono;
    protected int tipoConta;
    private float saldo = 0f;
    private boolean contaAberta;
    
    public Banco(int num, String nome, int tipo){
        this.setNumConta(num);
        this.nomeDono = nome;
        this.tipoConta = tipo;
        this.contaAberta = false;
        this.saldo = 0;
    }
    
    //depositar
    public void depositar(float valor){
        if (this.contaAberta){
            this.setSaldo(valor);
        }
        else{
            System.out.println("Você não pode sacar, pois sua conta não está aberta!");
        }
    }
    public void setSaldo(float valor){
        this.saldo+=valor;
        System.out.println("Valor atual do saldo: " + getSaldo());
    }
    public float getSaldo(){
        return this.saldo;
    }
    public void sacar(float valor){
        if(this.contaAberta){
            if(this.saldo < valor){
                System.out.println("Você não pode sacar mais do que tem!");
            }else{
                this.saldo-=valor;
                System.out.println("Valor atual do saldo: " + getSaldo());
            }
        }
        else{
            System.out.println("Você não pode sacar, pois sua conta não está aberta");
        }
       
    }
    
    public void abrirConta(){
        this.contaAberta = true;
    }
    public void fecharConta(){
        if (this.saldo == 0){
           this.contaAberta = false; 
        }
        else{
            System.out.println("Você não pode fechar a conta, pois seu saldo não está zerado");
            this.getSaldo();
        }
    }
    
    public void pagarMensalidade(){
        if (this.tipoConta == 0){
            this.saldo -= 20f;
        }
        else{
            this.saldo-=12f;
        }
    }
    
    public void setNumConta(int num){
        this.numConta = num;
    }
    
    public void status(){
        System.out.println("Sobre a conta:");
        System.out.println("Tipo: "+ this.tipoConta);
        System.out.println("Saldo: "+this.getSaldo());
    }
}
