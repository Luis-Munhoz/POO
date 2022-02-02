/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algoritimosbuscadicionario;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;
/**
 *
 * @author Luís Fernando
 */
public class AlgoritimosBuscaDicionario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Dictionary<Integer, String> dicionario = new Hashtable<Integer, String>();
    dicionario.put(0, "Luis");
    dicionario.put(1, "Fernando");
    dicionario.put(2, "Taiacol");
    dicionario.put(3, "Munhoz");
    dicionario.put(9, "nao precisa ser sequencial");
    
    System.out.println("\n Tamanho do dicionario: " + dicionario.size());
    System.out.println("Valor da chave 1: " + dicionario.get(1));
    
    //Iterate over elements in dictionary
    System.out.println("Usando o comando enumeration");
    Enumeration<String> e = dicionario.elements();
    while(e.hasMoreElements()){
        System.out.print(e.nextElement() + " ");
    }
    System.out.println("\nMostrando as chaves: \n");
    Enumeration<Integer> ekey = dicionario.keys();
    while(ekey.hasMoreElements()){
      System.out.print(ekey.nextElement() + " ");
    }
    
    dicionario.remove(9);
    System.out.println("\n Depois de remover o nove: " + dicionario);
    //Update value at key 3
    dicionario.put(3, "Gon");
    System.out.println("Novo valor de 3: " + dicionario.get(3));
    
    System.out.println("Dicinário está vazio ? " + dicionario.isEmpty());
    
    
  
    }
    
}
