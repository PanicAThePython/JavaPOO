package aulapoo12;
public class Mamifero extends Animal{

    private String corPelo;
    
    @Override
    public void locomover() {
        System.out.println("Correndoooo");
    }

    @Override
    public void comer() {
        System.out.println("Mamando");
    }

    @Override
    public void sonificar() {
        System.out.println("Som de mamífero");
    }
    
}
