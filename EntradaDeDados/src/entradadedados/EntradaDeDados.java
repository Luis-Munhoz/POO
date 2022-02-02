/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entradadedados;

import java.util.Scanner;

/**
 *
 * @author Luís Fernando
 */
public class EntradaDeDados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Cupcake=new Scanner (System.in);
        System.out.println("Insira o nome: ");
        String nome;
        nome = Cupcake.nextLine();
        System.out.println("nome="+nome);
        int numero;
        numero= Cupcake.nextInt(); //nextString(); nextDouble(); // nextShort();// nextChar();
        float real= Cupcake.nextFloat();
    }
    
}
