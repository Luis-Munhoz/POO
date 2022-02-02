/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula2;

/**
 *
 * @author Luís Fernando
 */
public class Aula2
{
    //CLASSE PRINCIPAL
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        //AQUI FICA O MÉTODO PRINCIPAL
        int valor= 5; //declaração
        System.out.println("valor= "+valor);
        int valor= (int)5.8; //typecast converte antes de armazenar
        System.out.println("valor= "+valor);
        Integer valor = new Integer(5); //de forma mais complexa 
        System.out.println("valor= "+valor);
        //o java faz tudo em double entao se for float coloca-se f no final
        float valor2 = 5.123f;
        double valor3 = 3.414;
        System.out.println("valor2="+valor2);
        System.out.println("valor3="+valor3);
        String valor4= "Abc";
        System.out.println("Valor4="+valor4);
        char valor5;
        valor5='A';
        System.out.println("Valor5="+valor5);
        boolean valor6= true;
        System.out.println("Valor6="+valor6);
        boolean valor7= false;
        System.out.println("Valor7="+valor7);
        short valor8 = 32767; //limite do valor short
        System.out.println("Valor8="+valor8);
        System.out.println("\n pula linha");
        System.out.println("\t tabula");
        System.out.println("\b retrocesso tira uma letra");
        System.out.println("\r volta uma linha");
        System.out.printf("texto Formatador %f f float d inteiro s string", valor2);
        System.out.println("f3.2 3 casas inteiras 2 casas decimais");
    }
    //AQUI ESTÁ A CLASSE PRINCIPAL
}
