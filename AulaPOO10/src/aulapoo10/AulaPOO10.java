package aulapoo10;
public class AulaPOO10 {

    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa();
        Aluno a1 = new Aluno();
        Professor pf1 = new Professor();
        Funcionario f1 = new Funcionario();
        
        a1.setNome("Natália");
        a1.setIdade(18);
        a1.setSexo("F");
        a1.fazerAniversario();
        a1.getIdade();
        
        a1.setMatricula(123);
        a1.setCurso("Ciência da Computação");
        a1.isMatriculado();
    }
    
}
