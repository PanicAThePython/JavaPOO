package aulapoo02;

public class AulaPOO02 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "Bic Crystal";
        c1.cor = "Preta";
        c1.ponta = 0.5f;
        c1.carga = 75;
        c1.tampada = true;
        c1.status();
        c1.destampar();
        c1.escrever();
        c1.pintar();
        c1.rabiscar();
        c1.status();
        c1.tampar();
        c1.status();
    }
    
}
