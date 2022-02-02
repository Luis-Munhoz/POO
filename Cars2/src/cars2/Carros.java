/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cars2;

/**
 *
 * @author Luís Fernando
 */
public class Carros {
    String tipo;
String cor;
String placa;
int numPortas;
void setCor(String cor) // lista de parâmetros
{ // altera o valor do atributo cor
// void porque o método não retorna nada
this.cor=cor;
}

String getCor()
{// retorna o valor do atrtibuto cor
// String é o tipo retornado por esse método
return cor;
}

void setTipo(String tipo) {
this.tipo=tipo;
}
String getTipo() {
return tipo;
}
void setPlaca(String placa) {
this.placa=placa;
}
String getPlaca() {
return placa;

}
void setNumPortas(int numPortas)
{
this.numPortas=numPortas;
}
int getNumPortas()
{ return numPortas;
}
}
