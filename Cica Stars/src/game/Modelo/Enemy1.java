//essa classe configura o tiro da nave do player//
package game.Modelo;
import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

public class Enemy1 
{
	private Image imagem;
	private int x,y;
	private int largura, altura;
	private boolean isVisivel;
	
	
	//private static final int LARGURA = 1500;//
	private static int VELOCIDADE = 8;
	
	//Criando o construtor//
	public Enemy1(int x, int y)
	{
		this.x = x;
		this.y = y;
		isVisivel = true;
	}
	
	//imagem do tiro//
	public void load()
	{
		ImageIcon referencia = new ImageIcon("res//enemy_1.png");
		imagem = referencia.getImage();
		
		this.largura = imagem.getWidth(null);
		this.altura = imagem.getWidth(null);
	}
	
	//fazendo o tiro sumir//
	public void update()
	{
		this.x -= VELOCIDADE;
			//if(this.x > LARGURA)
			//{
				//isVisivel = false;
			//}
	}
	
	public Rectangle getBounds() 
	{
		return new Rectangle (x,y,largura,altura);
	}
	
	//getters and setters//

	public boolean isVisivel() {
		return isVisivel;
	}

	public void setVisivel(boolean isVisivel) {
		this.isVisivel = isVisivel;
	}

	public static int getVELOCIDADE() {
		return VELOCIDADE;
	}

	public static void setVELOCIDADE(int vELOCIDADE) {
		VELOCIDADE = vELOCIDADE;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public Image getImagem() {
		return imagem;
	}
	
	
	
	
	
}
