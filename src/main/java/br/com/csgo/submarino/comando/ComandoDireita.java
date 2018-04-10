package br.com.csgo.submarino.comando;

import br.com.csgo.submarino.model.Direcao;
import br.com.csgo.submarino.model.Submarino;

public class ComandoDireita implements ComandoSubmarino{

	@Override
	public void executa(Submarino submarino) {
		Direcao direcao = submarino.getDirecao();
		submarino.setDirecao(Direcao.aDireita(direcao));		
	}

}
