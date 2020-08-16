package aulapoo12;
public class Cachorro extends Mamifero{
    
    public void abanarRabo(){
        System.out.println("Abanando rabo");
    }
    
    public void enterrandoAlgo(){
        System.out.println("Enterrando por meu dono não achar, hehe");
    }
    
    @Override
    public void sonificar(){
        System.out.println("AU AU AUUUUUUUUUU");
    }
    
    public void reagir(String frase){
        if (frase=="bom garoto!" || frase=="boa menina!" ){
            this.abanarRabo();
        }
        else{
            System.out.println("ARRRHGGGHR WAUU WAUUF");
        }
    }
    
    public void reagir(boolean dono){
        if (dono){
            this.abanarRabo();
            this.sonificar();
        }
        else{
            System.out.println("ARRRHGGGHR WAUU WAUUF");
        }
    }
}
