/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cars2;

/**
 *
 * @author Luís Fernando
 */
public class Cars2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Carros carro1=new Carros();
carro1.setCor("Branco");
carro1.setTipo("Passeio");
carro1.setPlaca("ABC-1010");
carro1.setNumPortas(4);
System.out.println("Características do carro");
System.out.println("Cor: "+carro1.getCor());
System.out.println("Tipo: "+carro1.getTipo());
System.out.println("Placa: "+carro1.getPlaca());
System.out.println("Portas: "+carro1.getNumPortas());
    }
    
}
