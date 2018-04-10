package br.com.csgo.submarino.comando;

import br.com.csgo.submarino.model.Submarino;
import br.com.csgo.submarino.util.SubmarinoException;

public class ComandoSubir implements ComandoSubmarino{

	@Override
	public void executa(Submarino submarino) {
		if(submarino.getZ() == 0) {
			throw new SubmarinoException("Submarino encontra-se em superfície.");
		}
		submarino.setZ(submarino.getZ() + 1);
	}

}
