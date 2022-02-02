/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algoritimodebusca2;

/**
 *
 * @author Luís Fernando
 */
public class AlgoritimoDeBusca2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Buscador Dic01=new Buscador();
        String [] Dados;
       Dados = new String[4];
       Dados[0]="ola";
       Dados[1]="hi";
       Dados[2]="Guten Tag";
       Dados[3]="Hola";
       String[] Chaves;
       Chaves= new String[4];
       Chaves[0]="portugues";
       Chaves[1]="ingles";
       Chaves[2]="alemão";
       Chaves[3]="espanhol";
       Dic01.Construtor(Chaves,Dados,4);
       Dic01.Busca("ingles");
    }
    
}
