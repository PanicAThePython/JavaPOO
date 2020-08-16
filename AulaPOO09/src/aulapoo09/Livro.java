package aulapoo09;

import java.util.Scanner;

public class Livro implements Publicacao{
    
    private String titulo;
    private String autor;
    private int totalPag;
    private int atualPag;
    private boolean avancar;
    private boolean aberto;
    private Pessoa leitor; //colocar classe Pessoa

    private String perguntarCaminho(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Deseja avançar? Se sim, digite 1... se não, 0...");
        String resposta = teclado.next();
        return resposta;
    }
    
    public void detalharLivro(){
        System.out.println("---SOBRE O LIVRO---");
        System.out.println("Título: "+this.getTitulo());
        System.out.println("Autor: "+ this.getAutor());
        System.out.println("Página Atual:"+ this.getAtualPag());
        System.out.println("Total de Páginas: "+ this.getTotalPag());
        System.out.println("Está aberto? "+ this.isAberto());
        System.out.println("Quem está lendo? "+this.getLeitor());
    }
    
    public Livro(String tit, String aut, int totp, Pessoa leitor){
        this.setTitulo(tit);
        this.setAutor(aut);
        this.setTotalPag(totp);
        this.aberto = false;
        this.setAtualPag(0);
        this.leitor = leitor;
    }

    public String getTitulo() {
        return titulo;
    }
    private void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }
    private void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotalPag() {
        return totalPag;
    }
    private void setTotalPag(int totalPag) {
        this.totalPag = totalPag;
    }

    public int getAtualPag() {
        return atualPag;
    }
    private void setAtualPag(int atualPag) {
        this.atualPag = atualPag;
    }

    public boolean isAberto() {
        return aberto;
    }
    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public String getLeitor() {
        return leitor.getNome();
    }
    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    
    @Override
    public void abrir() {
        if(!this.isAberto()){
            this.aberto = true;
        }
        else{
            System.out.println("Livro já aberto");
        }
    }
    @Override
    public void fechar() {
        if(this.isAberto()){
            this.aberto = false;
        }
        else{
            System.out.println("Livro já fechado!");
        }
    }

    @Override
    public void folhear() {
        if(this.isAberto()){
            String p = this.perguntarCaminho();
            if (p.equals("1")){
                this.avancarPagina();
            }
            else{
                this.voltarPagina();
            }
        }
        else{
            System.out.println("Primeiro abra o livro!");
        }
    }

    @Override
    public void avancarPagina() {
        if (this.isAberto()&& this.getAtualPag()<this.getTotalPag()){
            this.setAtualPag(this.atualPag +=1);
        }
        else{
            System.out.println("Primeiro abra o livro!");
        }
    }

    @Override
    public void voltarPagina() {
        if (this.isAberto() && this.getAtualPag()<=this.getTotalPag()){
            this.setAtualPag(this.atualPag -=1);
        }
        else{
            System.out.println("Primeiro abra o livro!");
        }
    }
    
}
