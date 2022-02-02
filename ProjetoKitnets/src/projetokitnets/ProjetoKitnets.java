/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetokitnets;

/**
 *
 * @author Luís Fernando
 */
public class ProjetoKitnets {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        QuartoInteligente Quarto[] =new QuartoInteligente[3];
        Quarto[0]= new QuartoInteligente();
        Quarto[1]= new QuartoInteligente();
        Quarto[2]= new QuartoInteligente();
        ConjuntosKitnets C1= new ConjuntosKitnets();
        C1.Churrasquinho(Quarto[0],Quarto[1],Quarto[2]);
        C1.Sinuca(Quarto[0], Quarto[2]);
        C1.statusCasa(Quarto[0], Quarto[1], Quarto[2]);
        Quarto=C1.fecharCasa(Quarto[0], Quarto[1], Quarto[2]);
        Quarto[1].Abrir();
        C1.menus(Quarto[0], Quarto[1], Quarto[2]);
    }
    
}
