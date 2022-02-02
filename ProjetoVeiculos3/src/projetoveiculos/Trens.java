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
public class Trens extends Terrestre {
    Scanner Entrada=new Scanner (System.in);
    private String Maquinista;
    private int NumTripulantes;
    private int numVagoes;
    private int VagoesCozinha;
    private int Locomotiva;

    public int getVagoesCozinha() {
        return VagoesCozinha;
    }

    public void setVagoesCozinha(int VagoesCozinha) {
        this.VagoesCozinha = VagoesCozinha;
    }

    public int getLocomotiva() {
        return Locomotiva;
    }

    public void setLocomotiva(int Locomotiva) {
        this.Locomotiva = Locomotiva;
    }

    public int getNumVagoes() {
        return numVagoes;
    }

    public void setNumVagoes(int numVagoes) {
        this.numVagoes = numVagoes;
    }
    
    public Trens() {
        int x;
        String y;
        double z;
        this.setNumVagoes(7);
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
        System.out.println("Quantas portas possui o veiculo?");
        x=Entrada.nextInt();
        this.setNumPortas(x);
        System.out.println("Quantas rodas possui?");
        x=Entrada.nextInt();
        this.setNumRodas(x);
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
        System.out.println("Maquinista: ");
        y=Entrada.next();
        this.setMaquinista(y);
        this.setAutonomia();
        this.setNumPassageiros();
        this.setCusto();
        this.setTipoEstrada("Ferrovia");
    }

    public String getMaquinista() {
        return Maquinista;
    }

    public void setMaquinista(String Maquinista) {
        this.Maquinista = Maquinista;
    }

    public int getNumTripulantes() {
        return NumTripulantes;
    }

    public void setNumTripulantes(int NumTripulantes) {
        this.NumTripulantes = NumTripulantes;
    }
    @Override
    public double Autonomia(){
        if (this.getTipoCombustivel()=="carvao" && this.getTanqueCombustivel()!=0){
            return (this.getTanqueCombustivel()*5);
        }
        else if (this.getTipoCombustivel()=="diesel" && this.getTanqueCombustivel()!=0){
            return (this.getTanqueCombustivel()*10);
        }
        else if (this.getTipoCombustivel()=="eletrico" && this.getTanqueCombustivel()!=0){
            return (this.getTanqueCombustivel()*1.2);
        }
        else{
            System.out.println("Combustivel errado ou sem armazenamento");
            return 0;
        }
    }
    @Override
    public int Passageiros(){
        return 60*(this.getNumRodas())/12;
    }
    @Override
    public double CustoReparoEstrada(){
        return this.getPeso()/100;
    }
    public void Sirene(){
        System.out.println("FOOON");
    }
    public void Sirene(int x){
        int i=0;
        while(i<x){
            System.out.println("FOOON");
            i=i+1;
        }
    }
    public void vagao(int x){
        System.out.println("Vagão de passageiros adicionado");
        this.setNumVagoes(this.getNumVagoes()+x);
    }
    public void vagao(){
        System.out.println("1-vagao cozinha, 2- vagao locomotiva");
        int x;
        x=Entrada.nextInt();
        if (x==1){
            System.out.println("voce adicionou um vagao cozinha no trem");
            this.setNumVagoes(this.getNumVagoes()+1);
            this.setVagoesCozinha(this.getVagoesCozinha()+1);
        }else{
            System.out.println("voce adicionou um vagao locomotiva no trem");
            this.setNumVagoes(this.getNumVagoes()+1);
            this.setLocomotiva(this.getLocomotiva()+1);
        }
    }
        
    public void Status(){
        System.out.println("Seu trem é:");
        System.out.println("tem a cor "+this.getCor());
        System.out.println("O motor é "+this.getMotor()+" com peso "+this.getPeso());
        System.out.println("o numero de passageiros é "+this.getNumPassageiros()+" com "+this.getNumRodas()+" Rodas");
        System.out.println("Ele tem o combustivel: "+this.getTipoCombustivel()+" e um tanque/bateria de "+this.getTanqueCombustivel());
        System.out.println("A autonomia é de "+this.getAutonomia()+" Km");
        System.out.println("tem "+this.getNumPortas()+" portas com o tipo de estrada sendo: "+this.getTipoEstrada());
        System.out.println("O custo de operação é de "+this.getCusto());
        System.out.println("A tripulação é de: "+this.getNumTripulantes()+ "O maquinista é o "+this.getMaquinista());
        System.out.println("O trem tem "+this.getNumVagoes()+ " Vagoes sendo "+this.getLocomotiva()+" Locomotivas e  "+this.getVagoesCozinha()+" Vagoes cozinha");
    }
  
}
