/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p2;

/**
 *
 * @author Luís Fernando
 */
public class P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        QuartoInteligente Quarto[] =new QuartoInteligente[3];
        Quarto[0]= new QuartoInteligente();
        Quarto[1]= new QuartoInteligente();
        Quarto[2]= new QuartoInteligente();
        
        CasaInteligente C1= new CasaInteligente();
        C1.Sinuca(Quarto[0], Quarto[2]);
        Quarto=C1.fecharCasa(Quarto[0], Quarto[1], Quarto[2]);
        
    }
    
}
