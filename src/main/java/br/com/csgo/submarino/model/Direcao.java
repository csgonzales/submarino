package br.com.csgo.submarino.model;

public enum Direcao {
	
	NORTE(0), LESTE(1), SUL(2), OESTE(3);
	
	private Direcao(int index) {
		this.index = index;
	}
	
	private int index;
	
	public int getIndex() {
		return index;
	}
	
	private static Direcao get(int index) {
		for (Direcao direcao : values()) {
			if(direcao.index == index)
				return direcao;
		}
		return null;
	}
	
	public static Direcao aDireita(Direcao direcao) {
		int index = direcao.getIndex();
		if(index == 3) {
			index = 0;
		} else {
			index++;
		}
		return get(index);
	}
	
	public static Direcao aEsquerda(Direcao direcao) {
		int index = direcao.getIndex();
		if(index == 0) {
			index = 3;
		} else {
			index--;
		}
		return get(index);
	}

}
