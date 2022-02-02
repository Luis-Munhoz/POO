/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetolutador;

/**
 *
 * @author Luís Fernando
 */
public class ProjetoLutador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lutador l[] =new Lutador[6]; 
         l[0]= new Lutador("Bruce Lee", "China", 31, 1.72f, 62f,21,0,0);
         l[1]= new Lutador("Jackie","China",40,1.75f,75f,14,2,3);
         l[2]= new Lutador("SamuraiX","Japão",25,1.76f,67f,30,0,0);
         l[3]= new Lutador("Chow Yun-fat","China",43,1.83f,77f,12,0,2);
         l[4]= new Lutador("Pablo","Brasil",20,1.70f,68f,5,4,0);
         l[5]= new Lutador("Jet Li","China",35,1.74f,67f,12,2,0);
         l[0].apresentar();
        l[1].apresentar();
        l[2].apresentar();
        l[3].apresentar();
         l[4].apresentar();
            l[5].apresentar();
         Luta lu=new Luta();
        System.out.println("==================");
        System.out.println("Primeira Luta");
        lu.marcarLuta(l[0],l[1]);
        lu.Lutar();
        System.out.println("==============");
        System.out.println("Segunda Luta");
        lu.marcarLuta(l[0],l[2]);
        lu.Lutar();

    }
    
}
