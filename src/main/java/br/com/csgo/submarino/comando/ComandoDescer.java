package br.com.csgo.submarino.comando;

import br.com.csgo.submarino.model.Submarino;

public class ComandoDescer implements ComandoSubmarino{

	@Override
	public void executa(Submarino submarino) {
		submarino.setZ(submarino.getZ() - 1);
	}

}
