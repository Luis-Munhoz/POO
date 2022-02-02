// Container seria um terreno criado para construir o jogo//
// Tal classe assume o papel de um objeto//
package game;

import javax.swing.JFrame;

import game.Modelo.Fase;

public class Container extends JFrame 
	{
		//Iniciando o Construtor//
	
	public Container ()
	{
		//Aqui ficam as caracteristicas do Container//
		//Adicionando a imagem de fundo//
		add(new Fase());
		setTitle("Jogao do Cicarelli");
		setSize(1600,900);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		//tal Comando controla a maximização da tela: Nesse caso não é possivel//
		this.setResizable(false);
		// Definindo a serie de Comandos como visivel//
		setVisible(true);
		
	}
	
	public static void main (String []args) 
	{
		new Container();
	}

	}
