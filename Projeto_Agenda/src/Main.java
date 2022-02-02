
import projeto_agenda.Agenda;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Luís Fernando
 */
public class Main {
    public static void main(String[] args) {
    Agenda agenda1=new Agenda();
        Agenda agenda2=new Agenda();
        agenda1.anote(12,10,2021,"Dia das Crianças");
        agenda2.anote(07,15,2021,"Independência do Brasil");
        /*agenda2.dia=7;
        agenda2.mes=15;
        agenda2.ano=2021;
        agenda2.anotacao="Independência do Brasil";
        agenda2.mostraAnotacao();
        agenda2.validaData();*/
    }
}
