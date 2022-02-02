/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classeabstrata;

import java.util.Scanner;

/**
 *
 * @author Luís Fernando
 */
public class Aluno extends Pessoa implements Notas {
    Scanner Entrada= new Scanner(System.in);
    private String curso;
    private int matricula;
    private double CR;


    public void pagarMensalidade(){
        System.out.println("pago "+this.getNome());
    }
    public void mudaNome(){
        System.out.println("Insira o novo nome: ");
        this.setNome(Entrada.nextLine()); 
    }
    public void cancelaMatricula(){
        this.matricula=0;
        System.out.println("Matricula cancelada");
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getCR() {
        return CR;
    }

    public void setCR(double CR) {
        this.CR = CR;
    }

    @Override
    public void Nota() {
        System.out.println("Insira o CR: ");
        this.setCR(Entrada.nextDouble());
    }
    
}
