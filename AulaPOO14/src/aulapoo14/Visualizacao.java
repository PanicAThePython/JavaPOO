package aulapoo14;
public class Visualizacao {
    
    private Gafanhoto espectador;
    private Video filme;

    public Visualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistidos(this.espectador.getTotAssistidos()+1);
        this.filme.setViews(this.filme.getViews()+1);
        this.filme.setReproduzindo(true);
    }

    public Gafanhoto getEspectador() {
        return espectador;
    }
    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }
    public void setFilme(Video filme) {
        this.filme = filme;
    }
    
    public void avaliar(){
        this.filme.setAvaliacao(5);
    }
    
    public void avaliar(int nota){
        this.filme.setAvaliacao(nota);
    }
    
    //porcentagem do VIDEO assistido
    public void avaliar(float porcentagem){
        int tot = 0;
        if (porcentagem<=20){
            tot = 3;
        }
        else if (porcentagem<=50){
            tot = 5;
        }
        else if (porcentagem<=90){
            tot = 8;
        }else{
            tot = 10;
        }
        this.filme.setAvaliacao(tot);
    }

    @Override
    public String toString() {
        return "Visualizacao{" + "espectador=" + espectador + ", filme=" + filme + '}';
    }
    
    
}
