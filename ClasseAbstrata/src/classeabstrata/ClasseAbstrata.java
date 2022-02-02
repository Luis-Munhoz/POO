/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classeabstrata;

/**
 *
 * @author Luís Fernando
 */
public class ClasseAbstrata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Visitante v1=new Visitante();
        System.out.println("V1: "+v1.getNome()+" "+v1.getSexo()+" "+v1.getIdade());
        Aluno a1=new Aluno();
        a1.pagarMensalidade();
        a1.fazerAniv();
        Bolsista b1=new Bolsista();
        b1.pagarMensalidade();
    }
    
}
