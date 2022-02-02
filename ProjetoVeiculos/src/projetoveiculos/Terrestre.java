package projetoveiculos;
public abstract class Terrestre extends Veiculos {
    private int numRodas;
    private String tipoEstrada;
    private int numPortas;
    private double Custo;
    public double getCusto() {
        return Custo;
    }
    public void setCusto() {
        this.Custo=CustoReparoEstrada();
    }
    public int getNumRodas() {
        return numRodas;
    }
    public void setNumRodas(int numRodas) {
        this.numRodas = numRodas;
    }
    public String getTipoEstrada() {
        return tipoEstrada;
    }
    public void setTipoEstrada(String tipoEstrada) {
        this.tipoEstrada = tipoEstrada;
    }
    public int getNumPortas() {
        return numPortas;
    }
    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }
    public double CustoReparoEstrada(){
        return 0;
    }
}