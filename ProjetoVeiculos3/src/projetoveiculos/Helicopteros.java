/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoveiculos;

import java.util.Scanner;

/**
 *
 * @author Luís Fernando
 */
public class Helicopteros extends Aereos {    
    Scanner Entrada=new Scanner (System.in);
    public Helicopteros(){
        int x;
        String y;
        double z;
        System.out.println("Voce está criando um veículo, preencha os dados dele:");
        System.out.println("Qual o motor?");
        y=Entrada.nextLine();
        this.setMotor(y);
        System.out.println("Qual o peso?");
        z=Entrada.nextDouble();
        this.setPeso(z);
        boolean hehe = false;
        while (hehe==false){
            System.out.println("Qual o combustível? 1-querosene ou 2-eletrico?");
            x=Entrada.nextInt();
            if(x==1||x==2){
                hehe=true;
                if(x==1){
                    this.setTipoCombustivel("querosene");
                }else if(x==2){
                    this.setTipoCombustivel("eletrico");
                }
            }
            else{
                System.out.println("Você digitou errado, tente novamente");
            }
        }
        hehe = false;
        while (hehe==false){
            System.out.println("Qual o tamanho do tanque? ou bateria");
            z=Entrada.nextDouble();
            if (z>0){
                hehe=true;
            }
            else{
                System.out.println("Você digitou errado, tente novamente");
            }
        }
        this.setTanqueCombustivel(z);
        System.out.println("Qual a cor?");
        y=Entrada.next();
        this.setCor(y);
        this.setAutonomia();
        System.out.println("Quantas pás ele tem?");
        x=Entrada.nextInt();
        this.setNumAsas(x);
        System.out.println("Quantos rotores ele tem?");
        x=Entrada.nextInt();
        this.setNumMotores(x); 
        System.out.println("Piloto: ");
        y=Entrada.next();
        this.setPiloto(y);
        this.setTipoAsa("Rotativa");
        this.setNumPassageiros();
    }
     @Override
    public int Passageiros(){
        return this.getNumAsas()*5;
    }
    
    public void Status(){
        System.out.println("Seu Helicoptero é");   
        System.out.println("tem a cor "+this.getCor());
        System.out.println("O motor é "+this.getMotor()+" com peso "+this.getPeso());
        System.out.println("Ele tem "+this.getNumMotores()+" rotores");
        System.out.println("o numero de passageiros é "+this.getNumPassageiros());
        System.out.println("Ele tem o combustivel: "+this.getTipoCombustivel()+" e um tanque/bateria de "+this.getTanqueCombustivel());
        System.out.println("A autonomia é de "+this.getAutonomia()+" Km");
        System.out.println("Ele tem "+this.getNumAsas()+" pás");
        System.out.println("Ele é de asa "+this.getTipoAsa());
    }
    
}
