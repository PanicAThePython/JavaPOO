package aulapoo14;
public class Gafanhoto extends Pessoa{
    
    private String login;
    private int totAssistidos;
    
    public Gafanhoto(String nome, int idade, String sexo, String login){
        super(nome, idade, sexo);
        this.setLogin(login);
        this.setTotAssistidos(0);
    }

    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistidos() {
        return totAssistidos;
    }
    public void setTotAssistidos(int totAssistidos) {
        this.totAssistidos = totAssistidos;
    }
    
    public void verMaisUm(){
        this.setTotAssistidos(this.getTotAssistidos()+1);
    }

    @Override
    public String toString() {
        return "Gafanhoto{" + super.toString() + "login=" + login + ", totAssistidos=" + totAssistidos + '}';
    }
    
    
}
