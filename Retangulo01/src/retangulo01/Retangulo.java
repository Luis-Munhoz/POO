/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package retangulo01;

import java.util.Scanner;

/**
 *
 * @author Luís Fernando
 */
public class Retangulo {
    Scanner entrada=new Scanner(System.in);
    private double comprimento=0;
    private double largura=0;
    private double area=0;
    private double perimetro=0;
    private boolean quadrado=false;
    public void leitura(){
        System.out.println("Digite o comprimento: ");
        this.comprimento=entrada.nextDouble();
        System.out.println("Digite a largura: ");
        this.largura=entrada.nextDouble();
    }
    private double Area(){
        double X;
        X=this.comprimento*this.largura;
        return(X);
    }
    private double Perimetro(){
        double X;
        X=this.comprimento*2+this.largura*2;
        return(X);
    }
    private void Quadrado(){
        if(this.largura==this.comprimento){
            this.quadrado=true;
        }
        else{
            this.quadrado=false;
        }
    }
    public void Status(){
        this.area=Area();
        this.perimetro=Perimetro();
        System.out.println("Comprimento="+this.comprimento+" Largura="+this.largura+" Area="+this.area+" Perimetro="+this.perimetro);
        this.Quadrado();
        if(this.quadrado){
            System.out.println("É quadrado");
        }
        else{
            System.out.println("não é quadrado");
        }
    }
    public void Retangulo(double c, double l, double p, double a, boolean q){
        this.comprimento=c;
        this.largura=l;
        this.perimetro=this.Perimetro();
        this.area=this.Area();
        this.Quadrado();
    }
    
}
