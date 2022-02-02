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
public abstract class Carros extends Terrestre {

    @Override
    public double Autonomia(){
        if (this.getTipoCombustivel()=="diesel" && this.getTanqueCombustivel()!=0){
            return (this.getTanqueCombustivel()*9);
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
    public double CustoReparoEstrada(){
        return this.getPeso()/1000;
    }

    
}
