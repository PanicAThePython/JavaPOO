package aulapoo07;
public class Lutador {
    
    //atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    
    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derr, int emp){
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derr;
        this.empates = emp;
    }
    
    public void apresentar(){
        System.out.println("Lá vem ele!");
        System.out.println("Com "+ this.getAltura()+", "+ this.getPeso()+"Kg...");
        System.out.println(this.getIdade()+", veio da(o) "+ this.getNacionalidade()+"...");
        System.out.println("com "+this.getVitorias()+" vitórias, "+this.getDerrotas()+" derrotas e "+this.getEmpates()+" empates...");
        System.out.println("da categoria "+ this.getCategoria()+", é ele! "+ this.getNome()+"!");
        System.out.println("");
    }
    
    public void status(){
        System.out.println(this.getNome()+", "+this.getIdade()+", "+this.getCategoria());
    }
    
    public void ganharLuta(){
        this.setVitorias(this.getVitorias()+1);
    }
    
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas()+1);
    }
    
    public void empatarLuta(){
        this.setEmpates(this.getEmpates()+1);
    }
    //métodos especiais

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }
    private void setCategoria() {
        if (this.getPeso()<52.2){
            this.categoria = "Inválido";
        }
        else if (this.getPeso()<=70.3){
            this.categoria = "Leve";
        }
        else if (this.getPeso()<=83.9){
            this.categoria = "Médio";
        }
        else if (this.getPeso()<=120.2){
            this.categoria = "Pesado";
        }
        else{
            this.categoria = "Inválido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }
    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }
    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }
    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
    
    

}
