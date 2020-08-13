package aulapoo05;
public class AulaPOO05 {
    public static void main(String[] args) {
        Banco b1 = new Banco(1, "Natália", 1);
        b1.status();
        
        b1.sacar(40f);
        b1.sacar(20f);
    }
    
}
