package projetoveiculos;
import java.util.Scanner;
public class ProjetoVeiculos {
	public static void main(String[] args) 
	{
                int x = 0;
                Scanner ler = new Scanner(System.in);
                System.out.println("Crie seu Veiculo");
                System.out.println("Escolha o veiculo que deseja criar:");
                System.out.println("1 terrestre, 2 aereo, 3 aquatico");
                x= ler.nextInt();
                if(x==1)
                 {
                        //Terrestres//
                        int i=0;
                        System.out.println("1-Carro, 2-Trem");
                        i= ler.nextInt();
                         if (i==1)
                          {   
                              // carros//
                              int z=0;
                              System.out.println("Escolha o tipo de carro:");
                              System.out.println("1-Passeio, 2- Esportivo, 3-Utilitario");
                              z=ler.nextInt();
                              if(z==1)
                              {
                                  Passeio Passeios = new Passeio();
                                  Passeios.Status();
                                  Passeios.buzina();
                                  Passeios.buzina(7);
                                  Passeios.subir(3);
                                  Passeios.subir("Gabriel");
                                  Passeios.subir("Luís", "Felipe");
                                  Passeios.descer();
                                  Passeios.descer(1);
                              }
                              else if(z==2)
                              {
                                  Esportivo Esportivos = new Esportivo();
                                  Esportivos.Status();
                                  Esportivos.buzina();
                                  Esportivos.buzina(7);
                                  Esportivos.subir(3);
                                  Esportivos.subir("Gabriel");
                                  Esportivos.subir("Luís", "Felipe");
                                  Esportivos.descer();
                                  Esportivos.descer(1);
                              }
                              else if(z==3)
                              {
                                  
                                    Utilitarios Utilitario = new Utilitarios();
                                    Utilitario.Status();
                                    Utilitario.buzina();
                                    Utilitario.buzina(7);
                                    Utilitario.subir(3);
                                    Utilitario.subir("Gabriel");
                                    Utilitario.subir("Luís", "Felipe");
                                    Utilitario.descer();
                                    Utilitario.descer(1);
			
                              }
                               else if (z>3 && z<1)
                              {
                                   System.out.println("Digitou errado");
                              }
                              
                          }
                         else if (i==2)
                         {
                              // trens//
                            Trens Trem = new Trens();
                            Trem.Status();
                            Trem.Sirene();
                            Trem.Sirene(5);
                            Trem.vagao();
                            Trem.vagao(4);
                         }
                         else if (i>2 && i<1)
                         {
                             System.out.println("Digitou errado");
                         }
                        
                 }
                else if (x==2)
                    {
                        //Aereos//
                        int j=0;
                        System.out.println("1-Helicoptero, 2-Avião");
                        j =ler.nextInt();
                         if (j==1)
                         {
                            Helicopteros Helicoptero = new Helicopteros();
                            Helicoptero.Status();  
                         }
                         else if (j==2)
                         {
                             Avioes Aviao = new Avioes();
                             Aviao.Status();
                             Aviao.subir();
                             Aviao.subir(10000);
                             Aviao.descer(5000);
                             Aviao.descer();
                         }
                         else if (j>2 && j<1)
                         {
                             System.out.println("Digitou errado");
                         }
                    }
                   else if (x==3)
                    {
                        //Aquaticos//
			Navios Navio = new Navios();
			Navio.Status(); 
                    }
                    else if (x>3 && x<1)
                         {
                             System.out.println("Digitou errado");
                         }	
	}
}
