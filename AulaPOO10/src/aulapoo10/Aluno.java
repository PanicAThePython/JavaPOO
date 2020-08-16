package aulapoo10;
public class Aluno extends Pessoa{

    private int matricula;
    private String curso;
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

    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public void cancelarMatricula(){
        this.setMatriculado(false);
        this.setMatricula(0);
    }
    
}
