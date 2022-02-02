/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetobicicleta;

/**
 *
 * @author Luís Fernando
 */
public class Bicicleta3 {
    public int tamanhoAro;
    private int numMarchas;
    public String cor;
    private String marca;

    public Bicicleta3(int numMarchas, String cor) {
        this.numMarchas = numMarchas;
        this.cor = cor;
    }

    public int getTamanhoAro() {
        return tamanhoAro;
    }

    public void setTamanhoAro(int tamanhoAro) {
        this.tamanhoAro = tamanhoAro;
    }

    public int getNumMarchas() {
        return numMarchas;
    }

    public void setNumMarchas(int numMarchas) {
        this.numMarchas = numMarchas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
