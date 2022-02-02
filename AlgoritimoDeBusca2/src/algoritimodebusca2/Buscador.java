/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algoritimodebusca2;

import java.util.Scanner;

/**
 *
 * @author Luís Fernando
 */
public class Buscador {
    Scanner Entrada= new Scanner(System.in);
    private boolean tranca=false;
    private int TipoDados;
    private int TipoChaves;
    private int [] DadosInt;
    private double[] DadosReal;
    private String[] DadosString;
    private boolean[] DadosBoolean;
    private int[] ChavesInt;
    private double[] ChavesDouble;
    private String[] ChavesString;
    private boolean[] ChavesBoolean;
    private int lenght;
    private int locate;

    public Buscador() {
        System.out.println("Chame o Construtor(Chaves[],Dados[],tamanho do dicionario");
    }
    
    public void Construtor(int[] Chaves, int[] Dados, int x){
        this.tranca=true;
        this.TipoDados=1;
        this.TipoChaves=1;
        this.lenght=x;
        this.ChavesInt=Chaves;
        this.DadosInt=Dados;
    }
    public void Construtor(double[] Chaves, int[] Dados, int x){
        this.tranca=true;
        this.TipoDados=1;
        this.TipoChaves=2;
        this.lenght=x;
        this.ChavesDouble=Chaves;
        this.DadosInt=Dados;
    }
    public void Construtor(String[] Chaves, int[] Dados, int x){
        this.tranca=true;
        this.TipoDados=1;
        this.TipoChaves=3;
        this.lenght=x;
        this.ChavesString=Chaves;
        this.DadosInt=Dados;
    }
    public void Construtor(boolean[] Chaves, int[] Dados, int x){
        this.tranca=true;
        this.TipoDados=1;
        this.TipoChaves=4;
        this.lenght=x;
        this.ChavesBoolean=Chaves;
        this.DadosInt=Dados;
    }
    public void Construtor(int[] Chaves, double[] Dados, int x){
        this.tranca=true;
        this.TipoDados=2;
        this.TipoChaves=1;
        this.lenght=x;
        this.ChavesInt=Chaves;
        this.DadosReal=Dados;
    }
    public void Construtor(double[] Chaves, double[] Dados, int x){
        this.tranca=true;
        this.TipoDados=2;
        this.TipoChaves=2;
        this.lenght=x;
        this.ChavesDouble=Chaves;
        this.DadosReal=Dados;
    }
    public void Construtor(String[] Chaves, double[] Dados, int x){
        this.tranca=true;
        this.TipoDados=2;
        this.TipoChaves=3;
        this.lenght=x;
        this.ChavesString=Chaves;
        this.DadosReal=Dados;
    }
    public void Construtor(boolean[] Chaves, double[] Dados, int x){
        this.tranca=true;
        this.TipoDados=2;
        this.TipoChaves=4;
        this.lenght=x;
        this.ChavesBoolean=Chaves;
        this.DadosReal=Dados;
    }
    public void Construtor(int[] Chaves, String[] Dados, int x){
        this.tranca=true;
        this.TipoDados=3;
        this.TipoChaves=1;
        this.lenght=x;
        this.ChavesInt=Chaves;
        this.DadosString=Dados;
    }
    public void Construtor(double[] Chaves, String[] Dados, int x){
        this.tranca=true;
        this.TipoDados=3;
        this.TipoChaves=2;
        this.lenght=x;
        this.ChavesDouble=Chaves;
        this.DadosString=Dados;
    }
    public void Construtor(String[] Chaves, String[] Dados, int x){
        this.tranca=true;
        this.TipoDados=3;
        this.TipoChaves=3;
        this.lenght=x;
        this.ChavesString=Chaves;
        this.DadosString=Dados;
    }
    public void Construtor(boolean[] Chaves, String[] Dados, int x){
        this.tranca=true;
        this.TipoDados=3;
        this.TipoChaves=4;
        this.lenght=x;
        this.ChavesBoolean=Chaves;
        this.DadosString=Dados;
    }
    public void Construtor(int[] Chaves, boolean[] Dados, int x){
        this.tranca=true;
        this.TipoDados=4;
        this.TipoChaves=1;
        this.lenght=x;
        this.ChavesInt=Chaves;
        this.DadosBoolean=Dados;
    }
    public void Construtor(double[] Chaves, boolean[] Dados, int x){
        this.tranca=true;
        this.TipoDados=4;
        this.TipoChaves=2;
        this.lenght=x;
        this.ChavesDouble=Chaves;
        this.DadosBoolean=Dados;
    }
    public void Construtor(String[] Chaves, boolean[] Dados, int x){
        this.tranca=true;
        this.TipoDados=4;
        this.TipoChaves=3;
        this.lenght=x;
        this.ChavesString=Chaves;
        this.DadosBoolean=Dados;
    }
    public void Construtor(boolean[] Chaves, boolean[] Dados, int x){
        this.tranca=true;
        this.TipoDados=4;
        this.TipoChaves=4;
        this.lenght=x;
        this.ChavesBoolean=Chaves;
        this.DadosBoolean=Dados;
    }
    public void Busca(int h){
        if(this.tranca){
                System.out.println("Qual a chave que voce busca?");
                int chaveTemp=h;
                int k;
                int o=0;
                boolean encontrada = false;
                for(k=0;k<this.lenght;k++){
                   
                    if(ChavesInt[k]==chaveTemp){
                        System.out.println("Chave encontrada");
                        this.locate=o;
                        encontrada=true;
                    }
                    o++;
                }
                if (!encontrada){
                    System.out.println("Chave não encontrada");
                }else{
                    imprima();
                }
        }else{
            System.out.println("Executo o construtor primeiro");
        }
    }
    public void Busca(double h){
        if(this.tranca){
        System.out.println("Qual a chave que voce busca?");
                double chaveTemp=h;
                int k;
                int o=0;
                boolean encontrada = false;
                for(k=0;k<this.lenght;k++){
                   
                    if(ChavesDouble[k]==chaveTemp){
                        System.out.println("Chave encontrada");
                        this.locate=o;
                        encontrada=true;
                    }
                    o++;
                }
                if (!encontrada){
                    System.out.println("Chave não encontrada");
                }else{
                    imprima();
                }  
                }else{
            System.out.println("Executo o construtor primeiro");
        }
    }
    public void Busca(String h){
        if(this.tranca){
        System.out.println("Qual a chave que voce busca?");
                String chaveTemp=h;
                int k;
                int o=0;
                boolean encontrada = false;
                for(k=0;k<this.lenght;k++){
                    if(ChavesString[k]==chaveTemp){
                        System.out.println("Chave encontrada");
                        this.locate=o;
                        encontrada=true;
                    }
                    o++;
                }
                if (!encontrada){
                    System.out.println("Chave não encontrada");
                }else{
                    imprima();
                }
                
                }else{
            System.out.println("Executo o construtor primeiro");
        }
    }
    public void Busca(boolean h){
        if(this.tranca){
        System.out.println("Qual a chave que voce busca?");
                boolean chaveTemp=h;
                int k;
                int o=0;
                boolean encontrada = false;
                for(k=0;k<this.lenght;k++){
                    if(ChavesBoolean[k]==chaveTemp){
                        System.out.println("Chave encontrada");
                        this.locate=o;
                        encontrada=true;
                    }
                    o++;
                }
                if (!encontrada){
                    System.out.println("Chave não encontrada");
                }else{
                    imprima();
                }
                
        }
    }
    
    private void imprima(){
        if(this.TipoDados==1){
            System.out.println(this.DadosInt[this.locate]);
        }else if(this.TipoDados==2){
            System.out.println(this.DadosReal[this.locate]);
        }else if(this.TipoDados==3){
            System.out.println(this.DadosString[this.locate]);
        }else if(this.TipoDados==4){
            System.out.println(this.DadosBoolean[this.locate]);
        }
    }   
}
