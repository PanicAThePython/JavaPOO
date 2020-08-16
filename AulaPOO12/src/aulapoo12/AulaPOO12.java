package aulapoo12;
public class AulaPOO12 {
    public static void main(String[] args) {

        Mamifero m1 = new Mamifero();
        
        m1.locomover();
        m1.sonificar();
        Cachorro c1 = new Cachorro();
        c1.sonificar();
        c1.locomover();
        c1.enterrandoAlgo();
        
        c1.reagir("boa menina!");
        c1.reagir(true);
    }
    
}
