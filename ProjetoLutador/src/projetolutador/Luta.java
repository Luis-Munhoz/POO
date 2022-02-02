/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetolutador;

import java.util.Random;

/**
 *
 * @author Luís Fernando
 */
public class Luta {
    private Lutador desafiado; // tipo de dado
    private Lutador desafiante; // tipo de dado
    private int rounds;
    private boolean aprovado;
    // Métodos principais
    public void marcarLuta(Lutador l1, Lutador l2){
        if (l1.getCategoria()==l2.getCategoria() && (l1 != l2)) {
        this.aprovado=true;
        this.desafiado=l1;
        this.desafiante=l2;
        }else {
        this.aprovado=false;
        this.desafiado=null;
        this.desafiante=null;
        }

    }
   public void Lutar(){
        int vencedor;
        if (this.aprovado) {
            desafiado.apresentar();
            desafiante.apresentar();
            Random aleatorio = new Random();
            // gerar três números aleatórios 0,1,2
            // Aqui pode ser lido o vencedor
            vencedor=aleatorio.nextInt(3);
            switch(vencedor){
                case 0: // empate
                System.out.println("Empatou");
                desafiado.empatarLuta();
                desafiante.empatarLuta();
                case 1: // ganhou desafiado
                System.out.println(desafiado.getNome());
                desafiado.ganharLuta();
                desafiante.perderLuta();
                case 2: // ganhou desafiante
                System.out.println((desafiante.getNome()));
                desafiante.ganharLuta();
                desafiado.perderLuta();
             }
            }else{
                System.out.println("Luta não pode acontecer");
            }

    }
    
// métodos especiais get e set

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovado;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovado = aprovada;
    }
}
