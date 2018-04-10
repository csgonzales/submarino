package br.com.csgo.submarino.comando;

import br.com.csgo.submarino.model.Direcao;
import br.com.csgo.submarino.model.Submarino;

public class ComandoEsquerda implements ComandoSubmarino{

	@Override
	public void executa(Submarino submarino) {
		Direcao direcao = submarino.getDirecao();
		submarino.setDirecao(Direcao.aEsquerda(direcao));		
	}

}
