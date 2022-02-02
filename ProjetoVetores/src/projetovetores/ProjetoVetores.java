/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetovetores;

import java.util.Scanner;

/**
 *
 * @author Luís Fernando
 */
public class ProjetoVetores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        int N[];
        int k,M;
        N=new int[10];
        System.out.println("Digite a quantidade de elementos");
        M=entrada.nextInt();
        System.out.println("Digite os valores do vetor");
        for (k=0;k<=M-1;k++){
            N[k]=entrada.nextInt();
        }
        System.out.println("Os valores do vetor são");
        for (k=0;k<=M-1;k++){
            System.out.print("\t"+N[k]);
        }

    }
    
}
