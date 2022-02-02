/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dogs;

/*author: Luís Fernando*/
public class Cachorros 
{
    // Atributos da classe Cachorro
    String nome;
    String corOlhos;
    String pelos;
    String raca;
    float peso;
    int idade;
    int tamanho;
    boolean guia;
    boolean farejador;
    boolean adestrado;
    // Métodos da Classe Cachorro
    void latir() 
    {

    System.out.println("Tipo de latido:");
    if (tamanho > 50) 
    {
        System.out.println("Wooof, Wooof!");
    }
        else if (tamanho > 25) 
        {
            System.out.println("Ruff!, Ruff! ");
        }
        else 
        {
            System.out.println("Yip!, Yip!");
        }
    }
    void caoGuia() 
    {
        if (guia==true)
        {
            System.out.println("Recebeu treinamento para cão guia");
        }
        else
        {
            System.out.println("Não é cao guia");
        }
    }
    void caoFarejador()
    {
        if (farejador==true)
        {
            System.out.println("Recebeu treinamento para cão farejador");
        }
        else
        {
            System.out.println("Não é cao cão farejador");
        }
    }

    void caoTreinado() 
    {
        if (adestrado==true)
        {
            System.out.println("Recebeu treinamento de comportamento");
        }
        else
        {
           System.out.println("Precisa de treinamento de comportamento");
        }
    }
    void status()
    {
        System.out.println("Nome: " + nome);
        System.out.println("Raça:" + raca);
        System.out.println("Idade: "+idade);
        System.out.println("Cor dos Olhos: " +corOlhos);
        System.out.println("Tipo de pelo:" + pelos);
        System.out.println("Peso:"+peso);
        System.out.println("Tamanho: "+tamanho);
        System.out.println("Cao adestrado: " +adestrado);
        System.out.println("Cao guia: "+guia);
        System.out.println("Cao farejador: "+farejador );
    }
}
