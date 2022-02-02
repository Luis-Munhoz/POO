/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package funcao;
import java.util.Scanner;
/**
 *
 * @author Luís Fernando
 */
public class Funcao {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
    double x;
    double y = 0;
    Scanner entrada=new Scanner(System.in);
    System.out.print("Insira o valor para a função: ");
    x =entrada.nextFloat();
    if (x>=7){
        y=2*x;
    }
    else if (x>=-5 && x<7){
        y=x+10;
    }
    else if(x<-5){
        y=x-5;
    }
    System.out.println();
    System.out.println("F(x)="+y);
    
    
        // TODO code application logic here
    }
    
}
