package aulapoo11;
public class AulaPOO11 {
    public static void main(String[] args) {
        //Pessoa p1 = new Pessoa(); --> é abstrata, não pode ser instanciada
        Visitante v1 = new Visitante();
        v1.setNome("George");
        v1.setIdade(14);
        v1.setSexo("M");
        v1.fazerAniversario();
        
        Curso c1 = new Curso();
        c1.setNome("Ciência da Computação");
        c1.setNumFases(9);
        c1.setValMensal(1200f);
        
        Aluno a1 = new Aluno();
        a1.setNome("Bernardo");
        a1.setIdade(18);
        a1.setSexo("M");
        a1.setCurso(c1);
        a1.setMatricula(321);
        
        Bolsista b1 = new Bolsista();
        b1.setNome("Natália");
        b1.setIdade(18);
        b1.setSexo("F");
        b1.setCurso(c1);
        b1.setMatricula(123);
        b1.setValBolsa(200f);
        
        a1.fazerAniversario();
        a1.pagarMensalidade();
        b1.pagarMensalidade();
    
    }
    
}
