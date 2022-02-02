/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classeabstrata;

/**
 *
 * @author Luís Fernando
 */
public class Bolsista extends Aluno{
    
   
    @Override //sobrepor o metodo
   public void pagarMensalidade(){
        System.out.println("Bolsista pagou "+this.getNome());
   }
}
