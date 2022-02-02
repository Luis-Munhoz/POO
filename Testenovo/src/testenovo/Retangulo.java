/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Testenovo;

import java.util.Scanner;

/**
 *
 * @author Luís Fernando
 */
public class Retangulo {
    Scanner entrada=new Scanner(System.in);
    private double comprimento=0;
    private double perimetro=0;
    private double largura=0;
    private double area=0;
    private boolean quadrado=false;
   public void leitura(){
        System.out.println("Qual o comprimento? ");
        this.comprimento=entrada.nextDouble();
        System.out.println("Qual a largura? ");
        this.largura=entrada.nextDouble();
    }
   private double area(){
       double X=0;
       X=this.comprimento*this.largura;
       return(X);
   }
   private double perimetro(){
       double X=0;
       X=this.comprimento*2+this.largura*2;
       return(X);
   }
   private void quadrado(){
      
    if (this.comprimento==this.largura)
    {
       this.quadrado=true;
    }
    else{
        this.quadrado=false;
    }
   }
   public void imprimir(){
       this.area=area();
       this.perimetro=perimetro();
       System.out.println("O quadrado possui comprimento="+this.comprimento+" e largura="+this.largura);
       System.out.println("Area="+this.area+" perimetro="+this.perimetro);
       if (this.quadrado){
           System.out.println("Ele é quadrado");
       }
       else{
           System.out.println("Ele não é quadrado");
       }
   }
    
}
