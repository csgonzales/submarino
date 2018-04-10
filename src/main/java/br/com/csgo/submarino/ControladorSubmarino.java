package br.com.csgo.submarino;

import java.util.LinkedHashMap;
import java.util.Map;

import br.com.csgo.submarino.comando.ComandoDescer;
import br.com.csgo.submarino.comando.ComandoDireita;
import br.com.csgo.submarino.comando.ComandoEsquerda;
import br.com.csgo.submarino.comando.ComandoMover;
import br.com.csgo.submarino.comando.ComandoSubir;
import br.com.csgo.submarino.comando.ComandoSubmarino;
import br.com.csgo.submarino.model.Submarino;

public class ControladorSubmarino {
	
	private static final Map<Character, ComandoSubmarino> COMANDOS;
	
	static {
		COMANDOS = new LinkedHashMap<>();
		COMANDOS.put('L', new ComandoEsquerda());
		COMANDOS.put('R', new ComandoDireita());
		COMANDOS.put('M', new ComandoMover());
		COMANDOS.put('D', new ComandoDescer());
		COMANDOS.put('U', new ComandoSubir());
	}
	
	public static void main(String[] args) {
		Submarino submarino = new Submarino();
		for (char comando : args[0].toCharArray()) {
			submarino.executa(get(comando));
		}
		System.out.println(submarino);
	}
	
	public static ComandoSubmarino get(char comando) {
		return COMANDOS.get(Character.toUpperCase(comando));
	}

}
