package aulapoo11;
public class Aluno extends Pessoa{

    private int matricula;
    private Curso curso;
    private boolean matriculado;
    
    public Aluno(){
        this.setMatriculado(true);
    }

    public boolean isMatriculado() {
        return matriculado;
    }
    private void setMatriculado(boolean matriculado) {
        this.matriculado = matriculado;
    }

    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Curso getCurso() {
        return curso;
    }
    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    
    public void cancelarMatricula(){
        this.setMatriculado(false);
        this.setMatricula(0);
        System.out.println("Matrícula cancelada");
    }
    
    public void pagarMensalidade(){
        System.out.println("Você pagou a mensalidade de "+this.getCurso().getValMensal()+" reais");
    }
    
}
