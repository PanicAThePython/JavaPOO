
package aulapoo10;
public class Professor extends Pessoa{
    
    private String especialidade;
    private float salario;
    
    public Professor(){
        this.setSalario(1090f);
    }

    public String getEspecialidade() {
        return especialidade;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }
    private void setSalario(float salario) {
        this.salario = salario;
    }
    
    public void receberAumento(float aumento){
        this.setSalario(this.getSalario()+aumento);
    }
}
