/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herança_multipla;

/**
 *
 * @author Luís Fernando
 */
public class Pessoas implements Sistema {
    private String nome;
    private int idade;
    private String sexo;

    public Pessoas(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }
    
    public void fazerAniv(){
        this.idade=this.idade+1;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Pessoas{" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + '}';
    }

    @Override
    public void status() {
        System.out.println("Nome: "+this.getNome()+" idade: "+this.getIdade()+" Sexp: "+this.getSexo());
    }
    
}
