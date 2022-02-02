/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p2;

import java.util.Random;

/**
 *
 * @author Luís Fernando
 */
public class CasaInteligente {
    private QuartoInteligente Q1;
    private QuartoInteligente Q2;
    private QuartoInteligente Q3;

    public QuartoInteligente[] fecharCasa(QuartoInteligente Qx,QuartoInteligente Qy, QuartoInteligente Qz){
        Q1=Qx;
        Q2=Qy;
        Q3=Qz;
        if (Q1.getChave()){
            Q1.sair();
        }else{
            System.out.println(Q1.getNome()+" Não está em sua kitnet, ela está fechada");
        }   
        if (Q2.getChave()){
            Q2.sair();
        }else{
            System.out.println(Q2.getNome()+" Não está em sua kitnet, ela está fechada");
        }  
        if (Q3.getChave()){
            Q3.sair();
        }else{
            System.out.println(Q3.getNome()+" Não está em sua kitnet, ela está fechada");
        } 
        return new QuartoInteligente[]{Q1,Q2,Q3};
}
    public QuartoInteligente[] statusCasa(QuartoInteligente Qx,QuartoInteligente Qy, QuartoInteligente Qz){
        Q1=Qx;
        Q2=Qy;
        Q3=Qz;
        Q1.Status();
        Q2.Status();
        Q3.Status();
        if (Q1.getChave()){
            System.out.println(Q1.getNome()+" Está em sua kitnet");
        }else{
            System.out.println(Q1.getNome()+" Não está em sua kitnet");
        }
        if (Q2.getChave()){
            System.out.println(Q2.getNome()+" Está em sua kitnet");
        }else{
            System.out.println(Q2.getNome()+" Não está em sua kitnet");
        }
        if (Q3.getChave()){
            System.out.println(Q3.getNome()+" Está em sua kitnet");
        }else{
            System.out.println(Q3.getNome()+" Não está em sua kitnet");
        }
        return new QuartoInteligente[]{Q1,Q2,Q3};
    }
    public QuartoInteligente[] menus(QuartoInteligente Qx,QuartoInteligente Qy, QuartoInteligente Qz){
        Q1=Qx;
        Q2=Qy;
        Q3=Qz;
        if (Q1.getChave()){
            Q1.menu();
        }else{
            System.out.println(Q1.getNome()+" Não está em sua kitnet, Não é´possivel abrir o menu");
        } 
        if (Q2.getChave()){
            Q2.menu();
        }else{
            System.out.println(Q2.getNome()+" Não está em sua kitnet, Não é´possivel abrir o menu");
        } 
        if (Q3.getChave()){
            Q3.menu();
        }else{
            System.out.println(Q3.getNome()+" Não está em sua kitnet, Não é´possivel abrir o menu");
        } 
        return new QuartoInteligente[]{Q1,Q2,Q3};
    }
    public void Churrasquinho(QuartoInteligente Qx,QuartoInteligente Qy, QuartoInteligente Qz){
        if (Q1.getChave() && Q2.getChave() && Q3.getChave()){
            System.out.println("O churrasco entre os moradores vai sair");
        }
    }
    public void Sinuca(QuartoInteligente Qx,QuartoInteligente Qy){
        if(Qx.getChave() && Qy.getChave()){
            System.out.println("A partida começa");
            Random aleatorio = new Random();
            int X;
            X=aleatorio.nextInt(2);
            if (X==1){
                System.out.println(Qx.getNome()+" Ganhou a partida");
            }
        }
    }
    
    public QuartoInteligente getQ1() {
        return Q1;
    }

    public void setQ1(QuartoInteligente Q1) {
        this.Q1 = Q1;
    }

    public QuartoInteligente getQ2() {
        return Q2;
    }

    public void setQ2(QuartoInteligente Q2) {
        this.Q2 = Q2;
    }

    public QuartoInteligente getQ3() {
        return Q3;
    }

    public void setQ3(QuartoInteligente Q3) {
        this.Q3 = Q3;
    }
    
    
    
}
