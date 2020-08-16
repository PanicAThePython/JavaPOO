package aulapoo07;

import java.util.Random;

public class Luta {
    
    private Lutador desafiante;
    private Lutador desafiado;
    private int rounds;
    private boolean aprovada;
    
    public Luta(Lutador desafiante, Lutador desafiado, int rounds){
        this.desafiante = desafiante;
        this.desafiado = desafiado;
        this.rounds = rounds;
    }
    
    public void marcarLuta(Lutador l1, Lutador l2){
        if (l1.getCategoria().equals(l2.getCategoria()) && l1!=l2){
            this.aprovada = true;
            this.desafiante = l1;
            this.desafiado = l2;
        }else{
            this.aprovada = false;
            this.desafiante = null;
            this.desafiado = null;
        }
    }

    public void lutar(){
        if (this.aprovada){
            System.out.println("DESAFIANTE!");
            this.desafiante.apresentar();
            System.out.println("DESAFIADO!");
            this.desafiado.apresentar();
            
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            
            switch (vencedor){
                case 0:
                    System.out.println("EMPATOU!!");
                    this.desafiante.empatarLuta();
                    this.desafiado.empatarLuta();
                    break;
                case 1:
                    System.out.println("DESAFIANTE VENCEU!");
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
                case 2:
                    System.out.println("DESAFIADO VENCEU!");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
            }
        }else{
            System.out.println("A luta não pode acontecer!");
        }
    }
    
    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    
}
