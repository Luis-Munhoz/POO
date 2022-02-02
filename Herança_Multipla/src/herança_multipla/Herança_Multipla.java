/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herança_multipla;

import java.util.Scanner;

/**
 *
 * @author Luís Fernando
 */
public class Herança_Multipla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoas p1=new Pessoas("luis",19,"homem");
        Aluno a1=new Aluno("AAP",2071,9.1,"luis",19,"homem");
        Professor pf1=new Professor("AAP",9700,"luis",19,"homem");
        Funcionario f1=new Funcionario("TI",true,"luis",19,"homem");
        f1.toString();
        p1.setIdade(18);
        p1.fazerAniv();
        System.out.println(p1.toString());
        p1.setSexo("Masculino");
        System.out.println(p1.toString());
        Aluno p2=new Aluno("20",2071,9.1,"Cupcake",19,"mulher");
        p2.setNome("camile");
        p2.setIdade(17);
        p2.fazerAniv();
        p2.setCurso("AAP");
        p2.setMatricula(1234);
        System.out.println("Nome:"+p2.getNome());
        System.out.println("Idade:"+p2.getIdade());
        System.out.println("Curso:"+a1.getCurso()+" Matricula:"+a1.getMatricula());
        System.out.println("Curso:"+p2.getCurso()+" Matricula:"+p2.getMatricula());
        Professor p3=new Professor("Quimica",1000,"Fauze",51,"homem");
        Scanner entrada=new Scanner(System.in);
        float x;
        p3.setNome("Claudio");
        p3.setIdade(22);
        p3.setEspecialidade("Computação");
        p3.setSalario(1000);
        System.out.println(p3.toString()); 
        System.out.println("Nome:"+p3.getNome());
        System.out.println("Idade:"+p3.getIdade());
        System.out.println("Especialidade:"+p3.getEspecialidade());
        System.out.println("Digite o valor do aumento em %");
        x=entrada.nextFloat();
        p3.receberAumento(x);
        System.out.println(p3.toString());
    }
    
}
