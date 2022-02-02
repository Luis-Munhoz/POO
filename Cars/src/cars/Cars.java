/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cars;

/**
 *
 * @author Luís Fernando
 */
public class Cars {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Carros carro1=new Carros("Branco","Passeio","ABC-1010",4); // forma de criar o objeto com inicialização

System.out.println("Características do carro");
System.out.println("Cor: "+carro1.getCor());
System.out.println("Tipo: "+carro1.getTipo());
System.out.println("Placa: "+carro1.getPlaca());
System.out.println("Portas: "+carro1.getNumPortas());
    }
    
}
