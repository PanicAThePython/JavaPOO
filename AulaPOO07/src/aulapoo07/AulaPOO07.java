package aulapoo07;
public class AulaPOO07 {
    public static void main(String[] args) {
        Lutador ferdinando = new Lutador("Ferdinando", "Brasil", 27, 1.89f, 83.5f, 10, 4, 3);
        
        Lutador l[] = new Lutador[3];
        l[0] = new Lutador("Putscript", "Alemanha", 33, 1.76f, 90f, 13, 5, 2);        
        l[1] = new Lutador("Dead Code", "Irlanda", 30, 1.67f, 78.4f, 10, 4, 3);
        l[2] = new Lutador("Snapshadow", "Hungria", 38, 1.89f, 91.3f, 8, 2, 0);

        
        Luta luta1 = new Luta(ferdinando, l[0], 3);
        
        luta1.marcarLuta(l[2], l[0]);
        luta1.lutar();
        l[0].apresentar();
        l[2].apresentar();
        
    }
    
}
