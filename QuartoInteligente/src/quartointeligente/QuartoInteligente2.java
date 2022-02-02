/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quartointeligente;

import java.util.Scanner;

/**
 *
 * @author Luís Fernando
 */
class QuartoInteligente2 implements Jarvis{
    Scanner Entrada=new Scanner (System.in);
    private boolean porta;
    private boolean janela;
    private boolean ventilador;
    private int veloVentilador;
    private String nome;
    private boolean luz;

    private boolean getPorta() {
        return porta;
    }

    private void setPorta(boolean porta) {
        this.porta = porta;
    }

    private boolean getJanela() {
        return janela;
    }

    private void setJanela(boolean janela) {
        this.janela = janela;
    }

    private boolean getVentilador() {
        return ventilador;
    }

    private void setVentilador(boolean ventilador) {
        this.ventilador = ventilador;
    }

    private int getVeloVentilador() {
        return veloVentilador;
    }

    private void setVeloVentilador(int veloVentilador) {
        this.veloVentilador = veloVentilador;
    }

    private String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    private boolean getLuz() {
        return luz;
    }

    private void setLuz(boolean luz) {
        this.luz = luz;
    }
    

    public QuartoInteligente2() {
        this.setPorta(true);
        this.setLuz(true);
        this.setJanela(false);
        this.setVentilador(false);
        this.setVeloVentilador(5);
        System.out.println("Qual o seu nome?");
        this.setNome(Entrada.nextLine());
        System.out.println("");
        System.out.println("Olá "+this.getNome()+" Bem vindo ao seu quarto virtual");
        System.out.println("Me chamo Jarvis e vou lhe guiar nele. Seu quarto está: ");
        if (this.getPorta()){
            System.out.println("A porta esta aberta");
        }
        else{
            System.out.println("A porta esta fechada");
        }
        if (this.getJanela()){
            System.out.println("A janela esta aberta");
        }
        else{
            System.out.println("A janela esta fechada");
        }
        if (this.getVentilador()){
            System.out.println("O ventilador está ligado com velocidade: "+this.getVeloVentilador());
        }
        else{
            System.out.println("O ventilador está desligado");
        }
        if(this.getLuz()){
            System.out.println("A luz está ligada");
        }
        else{
            System.out.println("A luz está desligada");
        }
    }

    @Override
    public void interagirPorta() {
        if (this.getPorta()){
            this.setPorta(false);
        }
        else{
            this.setPorta(true);
        }
    }
    @Override
    public void interagirJanela() {
        if(this.getJanela()){
            this.setJanela(false);
        }
        else{
            this.setJanela(true);
        }
    }
    @Override
    public void interagirVentilador() {
        if(this.getVentilador()){
            this.setVentilador(false);
        }
        else{
            this.setVentilador(true);
        }
    }

    @Override
    public void mudarVelocidade() {
        int x=0;
        boolean chave=false;
        if (this.getVentilador()){
            while (chave==false){
                System.out.println("Por favor "+this.getNome()+ " Coloque a velocidade do ventilador de 1 a 10");
                x=Entrada.nextInt();
                if (x<=0 || x>10){
                    System.out.println("Calma lá amigão ta errado");
                }
                else{
                    this.setVeloVentilador(x);
                    chave=true;
                }
            }
            if (this.getVeloVentilador()<3){
                System.out.println("shhhhhhhhhhhh");/*som do ventilador*/
            }
            else if(this.getVeloVentilador()<6){
                System.out.println("wooooooooooooooooo");/*som do ventilador*/
            }
            else if(this.getVeloVentilador()<=10){
                System.out.println("PA-PA-PA-PA-PA-PA"); /*som do ventilador*/
            }
        }
        else
        {
            System.out.println("O ventilador está desligado, não é possivel mudar sua velocidade.");
        }
    }
    @Override
    public void interagirLuz() {
        if (this.getLuz()){
            this.setLuz(false);
        }
        else{
            this.setLuz(true);
        }
    }
    @Override
    public void Status() {
        System.out.println("");
        System.out.println("Olá "+this.getNome()+" Bem vindo ao seu quarto virtual");
        System.out.println("Me chamo Jarvis e vou lhe guiar nele. Seu quarto está: ");
        if (this.getPorta()){
            System.out.println("A porta esta aberta");
        }
        else{
            System.out.println("A porta esta fechada");
        }
        if (this.getJanela()){
            System.out.println("A janela esta aberta");
        }
        else{
            System.out.println("A janela esta fechada");
        }
        if (this.getVentilador()){
            System.out.println("O ventilador está ligado com velocidade: "+this.getVeloVentilador());
        }
        else{
            System.out.println("O ventilador está desligado");
        }
        if(this.getLuz()){
            System.out.println("A luz está ligada");
        }
        else{
            System.out.println("A luz está desligada");
        }
    }

    @Override
    public void sair() {
        if(this.getPorta()){
            System.out.println("Tchau "+this.getNome()+" desligarei e fecharei tudo para você");
            this.setJanela(false);
            this.setLuz(false);
            this.setPorta(false);
            this.setVentilador(false);   
        }
        else if(this.getJanela()){
            System.out.println("Quer pular a janela é ? a Porta ta fechada, abra-a para sair");
        }
        else{
            System.out.println("A porta está fechada, abra-a para sair");
        }
    }

    @Override
    public void menu() {
        boolean k=false;
        int y;
        while (k==false){
            System.out.println("\n");
            System.out.println("Bem vindo ao menu, selecione a opção desejada: ");
            System.out.println("1- Abrir/fechar com a porta");
            System.out.println("2- Abrir/fechar com a janela");
            System.out.println("3- Ligar/desligar com a luz");
            System.out.println("4- Ligar/desligar com o ventilador");
            System.out.println("5- Mudar a velocidade do ventilador");
            System.out.println("6- Verificar a situação do quarto");
            System.out.println("7- Sair");
            y=Entrada.nextInt();
            if (y==1){
                this.interagirPorta();
            }
            else if(y==2){
                this.interagirJanela();
            }
            else if(y==3){
                this.interagirLuz();
            }
            else if(y==4){
                this.interagirVentilador();
            }
            else if(y==5){
                this.mudarVelocidade();
            }
            else if(y==6){
                this.Status();
            }
            else if(y==7){
                if (this.getPorta()){
                    k=true;
                }
                this.sair();
            }
            else{
                System.out.println("Opção inválida");
            }
        }
    }
}
