package projetoveiculos;
import java.util.Scanner;
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
