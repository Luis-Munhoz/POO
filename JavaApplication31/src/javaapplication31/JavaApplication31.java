/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication31;

import java.util.Scanner;

/**
 *
 * @author Luís Fernando
 */
public class JavaApplication31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada=new Scanner (System.in);
            
        Quadrado t1=new Quadrado();
        System.out.println("Teste inteiro: "+t1.quadrado( 10));
        System.out.println("Teste real: "+ t1.quadrado(10.1));
        float q1;
          PolimorfismoArea quadrado1=new PolimorfismoArea();
          q1=quadrado1.area(1);
          System.out.println("Area:"+q1);
          q1=quadrado1.area((float)(2.5),(float)(3.4));
          System.out.println("Area:"+q1);
          System.out.println("Digite o lado do quadrado");
          q1=quadrado1.area(entrada.nextFloat());
          System.out.println("Area:"+q1);
          System.out.println("Digite os lados do retângulo");
          q1=quadrado1.area(entrada.nextFloat(),entrada.nextFloat());
          System.out.println("Area:"+q1);
    }
     
}
