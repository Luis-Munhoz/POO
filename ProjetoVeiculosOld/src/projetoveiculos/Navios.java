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
public class Navios extends Aquáticos{
    Scanner Entrada=new Scanner (System.in);
    private String Capitao;
    private int NumTripulantes;
 
    public Navios() {
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
            System.out.println("Qual o combustível? 1-carvao, 2-diesel ou 3-eletrico?");
            x=Entrada.nextInt();
            if(x==1||x==2||x==3){
                hehe=true;
                if(x==1){
                    this.setTipoCombustivel("carvao");
                }else if(x==2){
                    this.setTipoCombustivel("diesel");
                }else if (x==3){
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
        System.out.println("Quantos motores?");
        x=Entrada.nextInt();
        this.setNumMotores(x);
        System.out.println("qual o comprimento?");
        z=Entrada.nextDouble();
        this.setComprimento(x);
        System.out.println("Qual a cor?");
        y=Entrada.next();
        this.setCor(y);
        hehe=false;
        while (hehe==false){
            System.out.println("Quantos tripulantes?");
            x=Entrada.nextInt(); 
            if (x>=0){
                hehe=true;
            }
            else{
                System.out.println("Você digitou errado, tente novamente");
            }
        }
        this.setNumTripulantes(x);
        System.out.println("Capitao: ");
        y=Entrada.next();
        this.setCapitao(y);
        this.setAutonomia();
        this.setNumPassageiros();
        System.out.println("Qual a profundidade minima?");
        z=Entrada.nextDouble();
        this.setProfundidade(z);
    }

    public String getCapitao() {
        return Capitao;
    }

    public void setCapitao(String Capitao) {
        this.Capitao = Capitao;
    }

    public int getNumTripulantes() {
        return NumTripulantes;
    }

    public void setNumTripulantes(int NumTripulantes) {
        this.NumTripulantes = NumTripulantes;
    }
    @Override
    public int Passageiros(){
        return 400*(this.getNumMotores());
    }
    public void Status(){
        System.out.println("Seu Navio é:");
        System.out.println("tem a cor "+this.getCor());
        System.out.println("O motor é "+this.getMotor()+" com peso "+this.getPeso());
        System.out.println("o numero de passageiros é "+this.getNumPassageiros()+" com "+this.getNumMotores()+" motores");
        System.out.println("Ele tem o combustivel: "+this.getTipoCombustivel()+" e um tanque/bateria de "+this.getTanqueCombustivel());
        System.out.println("A autonomia é de "+this.getAutonomia()+" Km");
        System.out.println("A tripulação é de: "+this.getNumTripulantes()+ "O capitao é o "+this.getCapitao());
        System.out.println("Profundidade minima e comprimento: "+this.getProfundidade()+", "+this.getComprimento());
    }
  
}
