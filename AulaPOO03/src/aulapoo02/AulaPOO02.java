package aulapoo02;

public class AulaPOO02 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.carga = 80; //deixa eu mexer em protegido pq estou dentro de uma classe que utiliza a Caneta
        c1.status();
    }
    
}
