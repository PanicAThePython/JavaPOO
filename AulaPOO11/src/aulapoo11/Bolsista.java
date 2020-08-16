package aulapoo11;
public class Bolsista extends Aluno{
    
    private float valBolsa;

    public float getValBolsa() {
        return valBolsa;
    }
    public void setValBolsa(float valBolsa) {
        this.valBolsa = valBolsa;
    }
    
    @Override
    public void pagarMensalidade(){
        System.out.println("Você pagou a mensalidade de "+(this.getCurso().getValMensal()-this.getValBolsa())+" reais");
    }
}
