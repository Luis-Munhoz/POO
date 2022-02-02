//tal classe configura as ações jo jogador//
package game.Modelo;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;

public class Player 
{
	//essas variaveis servirao para os controles e etc//
	private int x,y;
	private int dx,dy;
	private Image imagem;
	private int altura, largura;
	private List <Tiro> tiros;
	private boolean isVisivel;
	
	//Criando o cosntrutor//
	
	public Player()
	{
		this.x = 100;
		this.y = 100;
		isVisivel = true;
		
		tiros = new ArrayList <Tiro>();
	}
	
	//o metodo a seguir define a imagem do player//
	public void load()
	{
		ImageIcon referencia = new ImageIcon("res//player_ship.png");
		imagem = referencia.getImage();
		altura = imagem.getHeight(null);
		largura = imagem.getHeight(null);
	}
	//Criando os metodos para mover o player//
	
	public void update() 
	{
		x += dx;
		y += dy;
		//a imagem da nave se move no eixo x e y//
	}
	
	public void tiroSimples()
	{
		this.tiros.add(new Tiro(x+largura, y+(altura/2)));
	}
	
	
	public Rectangle getBounds() 
	{
		return new Rectangle (x,y,largura,altura);
	}
	
	
	public void keyPressed(KeyEvent tecla) 
	{
		int codigo = tecla.getKeyCode();
		
		//quando pressionar os botoes a nave se movera//
		
		if(codigo == KeyEvent.VK_SPACE)
		{
			tiroSimples();;
		}
		
		if(codigo == KeyEvent.VK_UP)
		{
			dy=-5;
		}
		if(codigo == KeyEvent.VK_DOWN)
		{
			dy=5;
		}
		if(codigo == KeyEvent.VK_LEFT)
		{
			dx=-5;
		}
		if(codigo == KeyEvent.VK_RIGHT)
		{
			dx=5;
		}
	}
	//esse metodo faz com que quando a telca para de ser pressionada//
	//as variaveis ficasm em 0//
	public void keyRelease(KeyEvent tecla) 
	{
		int codigo = tecla.getKeyCode();
	
		if(codigo == KeyEvent.VK_UP)
		{
			dy=0;
		}
		if(codigo == KeyEvent.VK_DOWN)
		{
			dy=0;
		}
		if(codigo == KeyEvent.VK_LEFT)
		{
			dx=0;
		}
		if(codigo == KeyEvent.VK_RIGHT)
		{
			dx=0;
		}
	}

	//getters and setters//
	
	
	public int getX() {
		return x;
	}

	public boolean isVisivel() {
		return isVisivel;
	}

	public void setVisivel(boolean isVisivel) {
		this.isVisivel = isVisivel;
	}

	public int getY() {
		return y;
	}

	public Image getImagem() {
		return imagem;
	}

	public List<Tiro> getTiros() {
		return tiros;
	}
	
	
	
}
