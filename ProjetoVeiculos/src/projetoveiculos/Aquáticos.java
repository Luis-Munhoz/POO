package projetoveiculos;
public abstract class Aquáticos extends Veiculos {
    private int numMotores;
    private double comprimento;
    private double profundidade;

    public int getNumMotores() {
        return numMotores;
    }
    public void setNumMotores(int numMotores) {
        this.numMotores = numMotores;
    }
    public double getComprimento() {
        return comprimento;
    }
    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getProfundidade() {
        return profundidade;
    }
    public void setProfundidade(double profundidade) {
        this.profundidade = profundidade;
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
}
