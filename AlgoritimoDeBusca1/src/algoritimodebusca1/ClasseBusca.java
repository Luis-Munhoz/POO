/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algoritimodebusca1;

import java.util.Scanner;

/**
 *
 * @author Luís Fernando
 */
public class ClasseBusca {
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
    
    public ClasseBusca() {
        boolean k = false;
        while (!k){
            System.out.println("Insira o tipo de dado que deseja armazenar: ");
            System.out.println("1-Inteiro, 2-Real, 3-Palavra, 4-Booleana");
            int z;
            z=Entrada.nextInt();
            if(z==1){
                this.TipoDados=1;
                k = true;
            }else if (z==2){
                this.TipoDados=2;
                k = true;
            }else if (z==3){
                this.TipoDados=3;
                k = true;
            }else if (z==4){
                this.TipoDados=4;
                k = true;
            }else{
                System.out.println("Você digito errado tente novamente");
            }
        }
        k=false;
        while (!k){
            System.out.println("Insira o tipo de chave que deseja armazenar: ");
            System.out.println("1-Inteiro, 2-Real, 3-Palavra, 4-Booleana");
            int z;
            z=Entrada.nextInt();
            if(z==1){
                this.TipoChaves=1;
                k = true;
            }else if (z==2){
                this.TipoChaves=2;
                k = true;
            }else if (z==3){
                this.TipoChaves=3;
                k = true;
            }else if (z==4){
                this.TipoChaves=4;
                k = true;
            }else{
                System.out.println("Você digito errado tente novamente");
            }
        }
    }

    public void InserirDados(){
        System.out.println("Insira quantos dados serão armazenados:");
        this.lenght=Entrada.nextInt();
        int z=this.TipoDados;
        if(z==1){
            int[] Dados;
            Dados = new int[this.lenght];
            int i;
            System.out.println("Insira os valores a serem armazenados:");
            for(i=0;i<this.lenght;i++){
                Dados[i]=Entrada.nextInt();
        }
            this.DadosInt = new int[this.lenght];
            this.DadosInt=Dados;
        }else if (z==2){
            double [] Dados;
            Dados = new double[this.lenght];
            int i;
            System.out.println("Insira os valores a serem armazenados:");
            for(i=0;i<this.lenght;i++){
                Dados[i]=Entrada.nextDouble();
        }
            this.DadosReal = new double[this.lenght];
            this.DadosReal=Dados;
        }else if (z==3){
            String[] Dados;
            Dados = new String[this.lenght];
            int i;
            System.out.println("Insira os valores a serem armazenados:");
            for(i=0;i<this.lenght;i++){
                Dados[i]=Entrada.next();
        }
            this.DadosString = new String[this.lenght];
            this.DadosString=Dados;
        }else if (z==4){
            boolean[] Dados;
            Dados = new boolean[this.lenght];
            int i;
            System.out.println("Insira os valores a serem armazenados:");
            for(i=0;i<this.lenght;i++){
                Dados[i]=Entrada.nextBoolean();
        }
            this.DadosBoolean = new boolean[this.lenght];
            this.DadosBoolean=Dados;
        }
        int x=this.TipoChaves;
        if(x==1){
            int[] Chaves;
            Chaves = new int[this.lenght];
            int i;
            System.out.println("Insira As chaves a serem armazenados:");
            for(i=0;i<this.lenght;i++){
                Chaves[i]=Entrada.nextInt();
                        
        }
            this.ChavesInt = new int[this.lenght];
            this.ChavesInt=Chaves;
        }else if (x==2){
            double [] Chaves;
            Chaves = new double[this.lenght];
            int i;
            System.out.println("Insira As chaves a serem armazenados:");
            for(i=0;i<this.lenght;i++){
                Chaves[i]=Entrada.nextDouble();
        }
            this.ChavesDouble = new double[this.lenght];
            this.ChavesDouble=Chaves;
        }else if (x==3){
            String[] Chaves;
            Chaves = new String[this.lenght];
            int i;
            System.out.println("Insira As chaves a serem armazenados:");
            for(i=0;i<this.lenght;i++){
                Chaves[i]=Entrada.nextLine();
        }
            this.ChavesString = new String[this.lenght];
            this.ChavesString=Chaves;
        }else if (x==4){
            boolean[] Chaves;
            Chaves = new boolean[this.lenght];
            int i;
            System.out.println("Insira As chaves a serem armazenados:");
            for(i=0;i<this.lenght;i++){
                Chaves[i]=Entrada.nextBoolean();
        }
            this.ChavesBoolean = new boolean[this.lenght];
            this.ChavesBoolean=Chaves;
        }
        this.tranca=true;
    }
    public void Busca(){
        int z=this.TipoDados;
        int x=this.TipoChaves;
        int i = 0;
        while (i<=1){
            if (this.tranca){
                i=2;
                if(x==1){
                    System.out.println("Qual a chave que voce busca?");
                    int chaveTemp=Entrada.nextInt();
                    int k;
                    int o=0;
                    boolean encontrada = false;
                    for(k=0;k<this.lenght;k++){
                        o++;
                        if(ChavesInt[k]==chaveTemp){
                            System.out.println("Chave encontrada");
                            this.locate=o;
                            encontrada=true;
                        }
                    }
                    if (!encontrada){
                        System.out.println("Chave não encontrada");
                    }else{
                        imprima();
                    }
                }else if(x==2){
                    System.out.println("Qual a chave que voce busca?");
                    double chaveTemp=Entrada.nextDouble();
                    int k;
                    int o=0;
                    boolean encontrada = false;
                    for(k=0;k<this.lenght;k++){
                        o++;
                        if(ChavesDouble[k]==chaveTemp){
                            System.out.println("Chave encontrada");
                            this.locate=o;
                            encontrada=true;
                        }
                    }
                    if (!encontrada){
                        System.out.println("Chave não encontrada");
                    }else{
                        imprima();
                    }
                    
                }else if(x==3){
                    System.out.println("Qual a chave que voce busca?");
                    String chaveTemp=Entrada.nextLine();
                    int k;
                    int o=0;
                    boolean encontrada = false;
                    for(k=0;k<this.lenght;k++){
                        o++;
                        if(ChavesString[k]==chaveTemp){
                            System.out.println("Chave encontrada");
                            this.locate=o;
                            encontrada=true;
                        }
                    }
                    if (!encontrada){
                        System.out.println("Chave não encontrada");
                    }else{
                        imprima();
                    }
                    
                }else if(x==4){
                    System.out.println("Qual a chave que voce busca?");
                    boolean chaveTemp=Entrada.nextBoolean();
                    int k;
                    int o=0;
                    boolean encontrada = false;
                    for(k=0;k<this.lenght;k++){
                        o++;
                        if(ChavesBoolean[k]==chaveTemp){
                            System.out.println("Chave encontrada");
                            this.locate=o;
                            encontrada=true;
                        }
                    }
                    if (!encontrada){
                        System.out.println("Chave não encontrada");
                    }else{
                        imprima();
                    }
                }
                
            }else{
                System.out.println("Execute primeiro o método InserirDados");
                this.InserirDados();
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
