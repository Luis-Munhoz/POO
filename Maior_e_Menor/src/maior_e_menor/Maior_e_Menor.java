/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maior_e_menor;

import java.util.Scanner;

/**
 *
 * @author Luís Fernando
 */
public class Maior_e_Menor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double Maior = 0, Menor = 0;
        int Pmaior = 0, Pmenor = 0;
         Scanner entrada=new Scanner(System.in);
         System.out.println("Digite um número: ");
         int N =(int) entrada.nextFloat();
         if(N<=0){
             System.out.println("Quantidade inválida");
         }
         int i=1;
         while (i<=N){
         System.out.println("Digite um número: ");
         double x =entrada.nextFloat();
         if(i==1){
             Maior=x;
              Menor=x;
              Pmaior=1;
              Pmenor=1;
         }
         else{
             if(x>=Maior){
                 Maior=x;
                 Pmaior=i;
             }
             if(x<=Menor){
                 Menor=x;
                 Pmenor=i;
             }
         }
         i=i+1;
                  
         }
         System.out.println("O maior número foi: "+Maior+" Na posição: "+Pmaior);
         System.out.println("O menor número foi: "+Menor+" Na posição: "+Pmenor); 
    }
}