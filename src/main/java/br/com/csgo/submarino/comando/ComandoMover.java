package br.com.csgo.submarino.comando;

import br.com.csgo.submarino.model.Direcao;
import br.com.csgo.submarino.model.Submarino;

public class ComandoMover implements ComandoSubmarino{

	@Override
	public void executa(Submarino submarino) {
		Direcao direcao = submarino.getDirecao();
		
		if(direcao == Direcao.NORTE) {
			submarino.setY(submarino.getY() + 1);
		} else if(direcao == Direcao.LESTE) {
			submarino.setX(submarino.getX() + 1);
		} else if(direcao == Direcao.SUL) {
			submarino.setY(submarino.getY() - 1);
		} else if(direcao == Direcao.OESTE) {
			submarino.setX(submarino.getX() - 1);
		}
		
	}

}
