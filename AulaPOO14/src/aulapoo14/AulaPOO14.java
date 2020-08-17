package aulapoo14;
public class AulaPOO14 {
    public static void main(String[] args) {
        
        Video v[] = new Video[3];
        
        v[0] = new Video("Curso de Java");       
        v[1] = new Video("Curso de MySQL");
        v[2] = new Video("Curso de Java POO");
        
        Gafanhoto g[] = new Gafanhoto[3];
        
        g[0] = new Gafanhoto("Natália", 18, "F", "nana");
        g[1] = new Gafanhoto("Matheus", 20, "M", "tetheu");
        g[2] = new Gafanhoto("Bernardo", 18, "M", "ber");
        
        Visualizacao view1 = new Visualizacao(g[0], v[2]);  
        System.out.println(view1);        
        
        Visualizacao view2 = new Visualizacao(g[2], v[2]);

        System.out.println(view2);


    }
    
}
