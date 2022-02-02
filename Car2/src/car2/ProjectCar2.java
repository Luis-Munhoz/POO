/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package car2;

/**
 *
 * @author Luís Fernando
 */
public class ProjectCar2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Car2 carro4 =new Car2();
        carro4.setCor("Branco");
        carro4.setTipo("Passeio");
        carro4.setPlaca("ABC-1010");
        carro4.setNumPortas(4);
        
         System.out.println("Características do carro");
         System.out.println ("Cor:"+carro4.getCor());
         System.out.println ("Tipo:" +carro4.getTipo());
         System.out.println ("Placa:" +carro4.getPlaca());
         System.out.println("Portas:" +carro4.getNumPortas());
}
}
