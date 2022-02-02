package projetoveiculos;
public abstract class Veiculos {
    private String Motor;
    private double peso;
    private int numPassageiros;
    private double autonomia;
    private String tipoCombustivel;
    private double tanqueCombustivel;
    private String cor;
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public double getAutonomia() {
        return autonomia;
    }
    public void setAutonomia() {
        this.autonomia=Autonomia();
    }
    public String getTipoCombustivel() {
        return tipoCombustivel;
    }
    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }
    public double getTanqueCombustivel() {
        return tanqueCombustivel;
    }
    public void setTanqueCombustivel(double tanqueCombustivel) {
        this.tanqueCombustivel = tanqueCombustivel;
    }
    public String getMotor() {
        return Motor;
    }
    public void setMotor(String Motor) {
        this.Motor = Motor;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public int getNumPassageiros() {
        return numPassageiros;
    }
    public void setNumPassageiros() {
        this.numPassageiros=this.Passageiros();
    }
    public int Passageiros(){
        return 0;
    }
    public double Autonomia(){
        double x=0;
        return x;
    }
}
