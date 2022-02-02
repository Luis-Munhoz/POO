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
public class Esportivo extends Carros {
    String[] Pessoas = new String[7];
    private int contador=0;

    public String[] getPessoas() {
        return Pessoas;
    }

    public int getContador() {
        return contador;
    }
    Scanner Entrada=new Scanner (System.in);
    public Esportivo(){
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
            System.out.println("Qual o combustível? 1-diesel ou 2-eletrico?");
            x=Entrada.nextInt();
            if(x==1||x==2){
                hehe=true;
                if(x==1){
                    this.setTipoCombustivel("diesel");
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
        System.out.println("Quantas portas possui o veiculo?");
        x=Entrada.nextInt();
        this.setNumPortas(x);
        this.setNumRodas(4);
        System.out.println("Qual a cor?");
        y=Entrada.next();
        this.setCor(y);
        this.setAutonomia();
        this.setNumPassageiros();
        this.setCusto();
        this.setTipoEstrada("Rodovia");
    }
    @Override
    public int Passageiros(){
        return 2;
    }
    public void subir(String x){
        if(this.contador<this.getNumPassageiros()){
            System.out.println(x+ " Subiu no veiculo");
            this.Pessoas[this.contador]=x;
            this.contador=this.contador+1;
        }else{
            System.out.println("O carro está cheio");
        }
    }
    public void subir(String x, String y){
        if(this.getContador()<this.getNumPassageiros()-1){
            System.out.println(x+" e "+y+" subiram no veiculo");
            this.Pessoas[this.getContador()]=x;
            this.contador=this.getContador()+1;
            this.Pessoas[this.getContador()]=y;
            this.contador=this.getContador()+1;
        }else{
            System.out.println("O carro está cheio");
        }
    }
    public void subir(int x){
        int i=0;
        while(i<x){
            if(this.getContador()<this.getNumPassageiros()){
            System.out.println("Quem subiu?");
            this.Pessoas[this.getContador()]=Entrada.next();
            this.contador=this.contador+1;
            i=i+1;
            }
            else{
                System.out.println("O carro está cheio");
                i=x;
            }
        }
    }
    public void descer(){
        this.contador=this.getContador()-1;
        System.out.println(this.Pessoas[this.getContador()]+" desceu do veiculo");
        this.Pessoas[this.getContador()]="";
    }
        public void descer(int x){
        int i=0;
        while (i<x){
        this.contador=this.getContador()-1;
        System.out.println(this.Pessoas[this.getContador()]+" desceu do veiculo");
        this.Pessoas[this.getContador()]="";   
        i=i+1;
        }
    }
        public void buzina(){
            System.out.println("BEEP");
        }
        public void buzina(int x){
            int i=0;
            while(i<x){
                System.out.println("BEEP");
                i=i+1;
            }
        }
    public void Status(){
        System.out.println("Seu carro de passeio é:");
        System.out.println("tem a cor "+this.getCor());
        System.out.println("O motor é "+this.getMotor()+" com peso "+this.getPeso());
        System.out.println("o numero de passageiros é "+this.getNumPassageiros()+" com "+this.getNumRodas()+" Rodas");
        System.out.println("Ele tem o combustivel: "+this.getTipoCombustivel()+" e um tanque/bateria de "+this.getTanqueCombustivel());
        System.out.println("A autonomia é de "+this.getAutonomia()+" Km");
        System.out.println("tem "+this.getNumPortas()+" portas com o tipo de estrada sendo: "+this.getTipoEstrada());
        System.out.println("O custo de operação é de "+this.getCusto());
        if(this.getPessoas()!=null){
            int i=0;
            System.out.println("Estão a bordo: "); 
            while(i<this.getContador()){
                  System.out.println(this.Pessoas[i]);
                  i=i+1;
            }
        }
    }
    
    
}
