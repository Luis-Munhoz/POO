/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetocontrole;

/**
 *
 * @author Luís Fernando
 */
public class Controle implements Controlador{
    private boolean ligado;
    private boolean tocando;
    private int volume;
    public Controle() {
        this.ligado = false;
        this.tocando = false;
        this.volume = 50;
    }
    private boolean getLigado() {
        return ligado;
    }
    private boolean getTocando() {
        return tocando;
    }
    private int getVolume() {
        return volume;
    }
    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    private void setVolume(int volume) {
        this.volume = volume;
    }
    @Override
    public void desligar() {
        this.setLigado(ligado);
    }
    @Override
    public void ligar() {
        this.setLigado(true);
    }
    @Override
    public void abrirmenu() {
        System.out.println("Está ligado?"+this.getLigado());
        System.out.println("Está tocando"+this.getTocando());
        System.out.println("Volume:"+this.getVolume());
        for (int k=1; k<=getVolume();k=k+5){
            System.out.print("|");
        }
        System.out.println(" ");
    }
    @Override
    public void fecharmenu() {
        System.out.println("Fechando Menu");
    }
    @Override
    public void maisvolume() {
        if (this.getLigado()){// se ligado for true
            this.setVolume(this.getVolume()+5);
        }else{
            System.out.println("Impossível aumentar volume");
        }
    }
    @Override
    public void menosvolume() {
        if (this.getLigado()){// se ligado for true
            this.setVolume(this.getVolume()-5);
        }else{
            System.out.println("Impossível diminuir volume");
        }
    }
    @Override
    public void ligarmudo() {
        if (this.getLigado() && this.getVolume()>0){
            this.setVolume(0);
        } 
    }
    @Override
    public void desligarmudo() {
        if (this.getLigado() && this.getVolume()==0){
            this.setVolume(50);
        }
    }
    @Override
    public void play() {
     if (this.getLigado() && !(this.getTocando())){
        this.setTocando(true);
    }else{
        System.out.println("Não é possível reproduzir");
    }
    }
    @Override
    public void pause() {
       if (this.getLigado() && this.getTocando()){
            this.setTocando(false);
        }else{
            System.out.println("Não é possível pausar");
        }
    }
}