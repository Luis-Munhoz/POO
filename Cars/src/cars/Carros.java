/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cars;

/**
 *
 * @author Luís Fernando
 */
public class Carros {
    String tipo;
String cor;
String placa;
int numPortas;
// construtor
public Carros(String tipo, String cor, String placa, int numPortas){
this.tipo=tipo;
this.cor=cor;
this.placa=placa;
this.numPortas=numPortas;
}
String getCor()
{// retorna o valor do atrtibuto cor
// String é o tipo retornado por esse método
return cor;
}
String getTipo()
{ return tipo;
}
String getPlaca()
{ return placa;
}
int getNumPortas()
{ return numPortas;
}
    
}
