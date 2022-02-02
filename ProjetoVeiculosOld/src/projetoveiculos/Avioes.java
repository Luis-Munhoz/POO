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
public class Avioes extends Aereos {
    private double altitude;
    private boolean voar;
    private int numTripulantes;

    public double getAltitude() {
        return altitude;
    }

    private void setAltitude(double altitude) {
        this.altitude = altitude;
    }

    public boolean isVoar() {
        return voar;
    }

    public void setVoar(boolean voar) {
        this.voar = voar;
    }

    public int getNumTripulantes() {
        return numTripulantes;
    }

    public void setNumTripulantes(int numTripulantes) {
        this.numTripulantes = numTripulantes;
    }
    
    Scanner Entrada=new Scanner (System.in);
    public Avioes(){
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
        System.out.println("Quantas asas ele tem?");
        x=Entrada.nextInt();
        this.setNumAsas(x);
        System.out.println("Quantos motores ele tem?");
        x=Entrada.nextInt();
        this.setNumMotores(x); 
        System.out.println("Quantos tripulantes? ");
        x=Entrada.nextInt();
        this.setNumTripulantes(x);
        System.out.println("Piloto: ");
        y=Entrada.next();
        this.setPiloto(y);
        this.setTipoAsa("fixa");
        this.setVoar(false);
        this.setNumPassageiros();
    }
    @Override
    public int Passageiros(){
        return 60*(this.getNumAsas())/12;
    }
    public void subir(){
        if (!this.isVoar()){
            System.out.println("Avião decolou");
            this.setVoar(true);
            this.setAltitude(1000);
        }else{
            System.out.println("o aviao ja esta voando");
        }
    }
    public void subir(double x){
        if (this.isVoar()){
            System.out.println("Altitude alterada");
            this.setAltitude(this.getAltitude()+x);   
        }else{
            System.out.println("O aviao nao decolou");
        }
    }
    public void descer(){
        if (this.isVoar()){
            System.out.println("Avião pousou");
            this.setAltitude(0);
        }
        else{
            System.out.println("O avião ja está pousado");
        }
    }
    public void descer(double z){
        if (this.isVoar()){
            if(this.getAltitude()-z>0){
                System.out.println("Altitude alterada");
                this.setAltitude(this.getAltitude()-z);
            }else{
                System.out.println("Mudança inválida");
            }
            }else{
                System.out.println("O avião nao decolou");
        }
        
    }
    public void Status(){
        System.out.println("Seu avião é");   
        System.out.println("tem a cor "+this.getCor());
        System.out.println("O motor é "+this.getMotor()+" com peso "+this.getPeso());
        System.out.println("Ele tem "+this.getNumMotores()+" Motores");
        System.out.println("o numero de passageiros é "+this.getNumPassageiros()+" com "+this.getNumAsas()+" Asas");
        System.out.println("Ele tem o combustivel: "+this.getTipoCombustivel()+" e um tanque/bateria de "+this.getTanqueCombustivel());
        System.out.println("A autonomia é de "+this.getAutonomia()+" Km");
        System.out.println("Ele é de asa "+this.getTipoAsa());
        System.out.println("O avião está "+this.isVoar()+" a altitude "+this.getAltitude());
       
    }
}
    

