public class Ponto{
	private int x;
	private int y;
	
	//método construtor
	public Ponto(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	//getters
	public int getX(){ return x; }
	public int getY(){ return y; }
	
	//setters
	public void setX(int x){
		this.x = x;
	}
	
	public void setY(int y){
		this.y = y;
	}
	
	//mover um ponto significa mudar as coordenadas (x,y)
	public void mover(int novo_x, int novo_y){
		x = novo_x;
		y = novo_y;
	}
	
	//dois pontos são iguais se as coordenadas (x,y) de ambos forem iguais
	public boolean ehIgual(Ponto p){
		if ((this.x == p.getX()) && (this.y == p.getY()))
			return true;
		else
			return false;
	}
}


