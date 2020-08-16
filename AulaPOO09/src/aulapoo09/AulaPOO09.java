package aulapoo09;
public class AulaPOO09 {

    public static void main(String[] args) {
        
        Pessoa na = new Pessoa("Natália", 18, "F");
        Pessoa lu = new Pessoa("Luiza", 25, "F");
        
        Livro hp1 = new Livro("HP e a PF", "JKR", 200, na);
        
        hp1.detalharLivro();
        hp1.abrir();
        hp1.folhear();
        hp1.detalharLivro();
        hp1.fechar();
    }
    
}
