/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package dogs;
import java.util.Scanner;
/**
 *
 * @author Luís Fernando
 */
public class Cao1 {
   
public static void main(String[] args)
{
int resp;
Scanner entrada=new Scanner(System.in);
Cachorros cao1= new Cachorros();
cao1.nome="Bob";
cao1.idade=2;
cao1.peso=(float)4.5;
cao1.pelos="Médio";
cao1.raca="Chihuahua";
cao1.corOlhos="Castanhos";
cao1.adestrado=true;
cao1.guia=false;
cao1.farejador=false;
cao1.tamanho=8;
cao1.status();
cao1.latir();
cao1.caoTreinado();
cao1.caoGuia();
cao1.caoFarejador();
Cachorros cao2= new Cachorros();
cao2.nome="Bert";
cao2.idade=4;
cao2.peso=(float)15;
cao2.pelos="Médio";
cao2.raca="Labrador";
cao2.corOlhos="Castanhos";
cao2.adestrado=true;
cao2.guia=true;
cao2.farejador=false;
cao2.tamanho=30;
cao2.status();
cao2.latir();
cao2.caoTreinado();
cao2.caoGuia();
cao2.caoFarejador();
Cachorros cao3= new Cachorros();
System.out.println("Digite o nome:");
cao3.nome=entrada.nextLine();
System.out.println("Digite a idade:");
cao3.idade=entrada.nextInt();
System.out.println("Digite o peso:");
cao3.peso=entrada.nextFloat();
System.out.println("Tamanho do pelo: curto, médio, longo");
cao3.pelos=entrada.nextLine();
System.out.println("Digite a raça:");
cao3.raca=entrada.nextLine();
System.out.println("Digite a cor dos olhos");
cao3.corOlhos=entrada.nextLine();
System.out.println(cao3.nome+ " foi adestrado? (1-sim) ou (0- não)");
resp=entrada.nextInt();
if (resp==1)
{
cao3.adestrado=true;
}
else
{
cao3.adestrado=false;
}
System.out.println(cao3.nome+ " foi treinado para ser cao guia?(1-sim) ou (0-não)");
resp=entrada.nextInt();
if (resp==1)
{
    cao3.guia=true;
}
else
{
    cao3.guia=false;
}

System.out.println(cao3.nome+ " foi treinado para ser cao farejador ?(1-sim) ou (0-não)");
resp=entrada.nextInt();
if (resp==1)
{
    cao3.farejador=true;
}
else
{
    cao3.farejador=false;
}
cao3.status();
cao3.latir();
cao3.caoTreinado();
cao3.caoGuia();
cao3.caoFarejador();

}

}
