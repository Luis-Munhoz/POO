/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetoarrays;

import java.util.Scanner;

/**
 *
 * @author Luís Fernando
 */
public class ProjetoArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
    int X[][];
    int L,C,i,j;
    X=new int[10][10];
    System.out.println("Digite a quantidade de linhas e de colunas");
    L=entrada.nextInt();
    C=entrada.nextInt();
    System.out.println("Digite os valores da matriz");
    for (i=0;i<=L-1;i++){
        for (j=0;j<=C-1;j++){
        X[i][j]=entrada.nextInt();
    }
        }
        System.out.println("Os valores da matriz são");
        for (i=0;i<=L-1;i++){
            for (j=0;j<=C-1;j++){
            System.out.print(X[i][j]+"\t");
        }
        System.out.println(" ");
    }
    }
    
}
