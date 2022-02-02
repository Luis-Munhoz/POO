/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algoritimodebusca1;

/**
 *
 * @author Luís Fernando
 */
public class BuscaAutomaticaa {
    private String[] Dados;
    private String[] Chaves;
    private int Tamanho;
    private boolean tranca;

    public BuscaAutomaticaa(String[] Dados, String[] Chaves,int x) {
        this.tranca=false;
        Preencher(Dados, Chaves, x);
    }
    
    
    private void Size(int x){
        this.Tamanho=x;
    }

    public void Preencher(String[] Dados, String[] Chaves,int x) {
        this.tranca=true;
        Size(x);
        this.Dados= new String[this.Tamanho];
        this.Chaves=new String[this.Tamanho];
        this.Dados = Dados;
        this.Chaves = Chaves;
    }
    public void Busca(String chave){
        boolean lepo=false;
        int i=0;
        for (i=0;i<this.Tamanho;i++){
            if(this.Chaves[i]==chave){
                System.out.println("Encontrei a chave: "+this.Chaves[i]);
                System.out.println("Seu dado é: "+this.Dados[i]);
                lepo = true;
        }
        
    }
        if(!lepo){
            System.out.println("Não encontrei a chave: "+chave);
        }
    }
    
}
