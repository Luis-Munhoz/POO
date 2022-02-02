/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto_agenda;

/**
 *
 * @author Luís Fernando
 */
public class Agenda {
   private int dia;
   private int mes;
   private int ano;
   private String anotacao;
   

   private int getDia() {
        return dia;
    }

    private int getMes() {
        return mes;
    }

    private int getAno() {
        return ano;
    }

    private String getAnotacao() {
        return anotacao;
    }

    private void setDia(int alibaba) {
        this.dia = alibaba;
    }

    private void setMes(int mes) {
        this.mes = mes;
    }

    private void setAno(int ano) {
        this.ano = ano;
    }

    private void setAnotacao(String anotacao) {
        this.anotacao = anotacao;
    }
   
    // métodos da classe
   // método anote, para registrar data
    public void anote(int dia, int mes, int ano, String nota)
    {
        int x;
        setDia(dia);
        x=getDia();
        this.dia=dia;
        this.mes=mes;
        this.ano=ano;
        this.anotacao=nota;
       // verificar se a data é valida.
        validaData();
        mostraAnotacao();
    }
   private void validaData()
    {   
        if  ((dia<0) || (dia>31) ||  (mes>12))
        {
            this.dia=0;
            this.mes=0;
            this.ano=0;
            this.anotacao="Data inválida";
        }
    }
    private void mostraAnotacao()
    {
         System.out.println(this.dia+"/"+this.mes+"/"+this.ano+":"+this.anotacao);
    }
}
