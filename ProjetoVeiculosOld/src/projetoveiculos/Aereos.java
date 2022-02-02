/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoveiculos;

/**
 *
 * @author Luís Fernando
 */
public abstract class Aereos extends Veiculos{
    private int numAsas;
    private String tipoAsa;
    private int numMotores;
    private String piloto;

    public String getPiloto() {
        return piloto;
    }

    public void setPiloto(String piloto) {
        this.piloto = piloto;
    }
    
    public int getNumMotores() {
        return numMotores;
    }

    public void setNumMotores(int numMotores) {
        this.numMotores = numMotores;
    }
    
    public int getNumAsas() {
        return numAsas;
    }

    public void setNumAsas(int numAsas) {
        this.numAsas = numAsas;
    }

    public String getTipoAsa() {
        return tipoAsa;
    }

    public void setTipoAsa(String tipoAsa) {
        this.tipoAsa = tipoAsa;
    }
    
        @Override
    public double Autonomia(){
        if (this.getTipoCombustivel()=="querosene" && this.getTanqueCombustivel()!=0){
            return (this.getTanqueCombustivel()*120);
        }
        else if (this.getTipoCombustivel()=="eletrico" && this.getTanqueCombustivel()!=0){
            return (this.getTanqueCombustivel()*12);
        }
        else{
            System.out.println("Combustivel errado ou sem armazenamento");
            return 0;
        }
    }
}
