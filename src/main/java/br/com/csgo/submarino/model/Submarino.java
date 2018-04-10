package br.com.csgo.submarino.model;

import br.com.csgo.submarino.comando.ComandoSubmarino;

public class Submarino {
	
	private int x;
	private int y;
	private int z;
	private Direcao direcao;

	public Submarino() {
		this.x = 0;
		this.y = 0;
		this.z = 0;
		this.direcao = Direcao.NORTE;
	}
	
	public void executa(ComandoSubmarino comando) {
		if(comando != null) 
			comando.executa(this);
	}

	//Getters
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getZ() {
		return z;
	}

	public Direcao getDirecao() {
		return direcao;
	}

	
	//Setters
	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setZ(int z) {
		this.z = z;
	}

	public void setDirecao(Direcao direcao) {
		this.direcao = direcao;
	}

	@Override
	public String toString() {
		return "Submarino (" + x + ", " + y + ", " + z + ", " + direcao + ")";
	}
	
	
	
	 
}
