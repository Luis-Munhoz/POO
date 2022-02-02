/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menu;
import java.util.Scanner;
/**
 *
 * @author Luís Fernando
 */
public class Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada=new Scanner(System.in);
        int opcao=1;
        double x;
        double y;
        double z=0;
        do{
            System.out.println("0- Sair");
            System.out.println("1- potência");
            System.out.println("2- raiz quadrada");
            System.out.println("3- raiz cúbica");
            System.out.println("4- seno");
            System.out.print("Insira a opção: ");
            opcao =(int) entrada.nextFloat();
            System.out.println();
            if(opcao ==1 || opcao==2 || opcao==3 || opcao==4){
                System.out.println("Insira o valor de X: ");
                x =entrada.nextFloat();
                if(opcao==1){
                  System.out.println("Insira o valor de y: ");
                  y =entrada.nextFloat();
                  z=Math.pow(x, y);
                }
                if(opcao==2){
                   z=Math.sqrt(x); 
                }
                if(opcao==3){
                   z=Math.pow(x,1./3.);
                }
                if(opcao==4){
                    y=Math.PI*x/180;
                    z=Math.sin(y); 
                }
                System.out.println("O resultado é: "+z);
            }
        }while(opcao!=0);
            
    }
    
}
