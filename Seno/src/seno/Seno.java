/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package seno;

import java.util.Scanner;

/**
 *
 * @author Luís Fernando
 */
public class Seno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        double x, xrad, soma, n, a, fat, f,z,pi,p,Q;
        System.out.println("Digite um número em graus: ");
        x=entrada.nextDouble(); 
        pi=3.141592;
        xrad=x*pi/180;
        System.out.println("Digite a quantidade de termos: ");
        Q=entrada.nextDouble();
        soma=0;
        int i;
        for(i=0;i<=Q;i=i+1){
            z=2*i+1;
            fat=1;
            for(f=1;f<=z;f=f+1){
                fat=fat*f;
            }
            a=Math.pow(-1.0,i);
            p=(a*(Math.pow(xrad,z)))/fat;
            soma=soma+p;
        }
        System.out.println("O seno é: "+soma);
        // TODO code application logic here
    }
    
}
