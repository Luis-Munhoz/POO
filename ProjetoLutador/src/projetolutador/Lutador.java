/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetolutador;

/**
 *
 * @author Luís Fernando
 */
public final class Lutador {
    private String nome, nacionalidade, categoria;
    private int idade, vitorias, derrotas, empates;
    private float altura, peso;

public Lutador(String no, String na,int id, float al, float pe, int vi, int de, int em ) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
        this.altura = al;
        this.setPeso(pe);
    }
public void apresentar(){
      System.out.println("================");
      System.out.println("Lutador:"+ this.getNome());
      System.out.println("Origem:"+ this.getNacionalidade());
      System.out.println(this.getIdade()+ " anos");
      System.out.println(this.getAltura()+ " m de altura");
      System.out.println("Pesando"+this.getPeso()+ "kg");
      System.out.println("Ganhou:"+ this.getVitorias());
      System.out.println("Perdeu:"+  this.getDerrotas());
      System.out.println("Empatou:"+this.getEmpates());
      System.out.println("Categoria:"+this.getCategoria());
      System.out.println("================");
    }
public void ganharLuta(){
          this.setVitorias(this.getVitorias()+1);
           //vitoria=vitoria+1
    }// fim metodo
      
    public void perderLuta(){
          this.setDerrotas(this.getDerrotas()+1);
    }//fim metodo
      
    public void empatarLuta(){
         this.setEmpates(this.getEmpates()+1);
    }//fim metodo
    public void empatarluta(double h){
        
    }
    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    private void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
         if (this.peso<52.2f) {
            this.categoria="Invalido";
         }else if (this.peso<=70.3f){ 
            this.categoria="Leve";
        }else if (this.peso<=83.3f) {
            this.categoria="Medio";
        }else if (this.peso<=120.2f) {
            this.categoria="Pesado";
        }else{
            this.categoria="Invalido";
        }
    }

    public int getIdade() {
        return idade;
    }

    private void setIdade(int idade) {
        this.idade = idade;
    }

    public int getVitorias() {
        return vitorias;
    }

    private void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    private void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    private void setEmpates(int empates) {
        this.empates = empates;
    }

    public float getAltura() {
        return altura;
    }

    private void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    private void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }
    

            
    
    
}
