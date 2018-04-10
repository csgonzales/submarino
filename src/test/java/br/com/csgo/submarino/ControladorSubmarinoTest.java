package br.com.csgo.submarino;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import br.com.csgo.submarino.comando.ComandoSubmarino;
import br.com.csgo.submarino.model.Direcao;
import br.com.csgo.submarino.model.Submarino;
import br.com.csgo.submarino.util.SubmarinoException;

public class ControladorSubmarinoTest {
	
	Submarino submarino;
	
	@Before
	public void preTests() {
		submarino = new Submarino();
	}
	
	@Test
	public void verificaPosicaoInicial() {
		assertEquals(0, submarino.getX());
		assertEquals(0, submarino.getY());
		assertEquals(0, submarino.getZ());
		assertEquals(Direcao.NORTE, submarino.getDirecao());
	}
	
	@Test
	public void viraADireita() {
		submarino.executa(ControladorSubmarino.get('R'));
		assertEquals(Direcao.LESTE, submarino.getDirecao());
	}

	@Test
	public void viraAEsquerda() {
		submarino.executa(ControladorSubmarino.get('L'));
		assertEquals(Direcao.OESTE, submarino.getDirecao());
	}
	
	@Test
	public void moveParaNorte() {
		submarino.executa(ControladorSubmarino.get('M'));
		assertEquals(0, submarino.getX());
		assertEquals(1, submarino.getY());
		assertEquals(0, submarino.getZ());		
	}
	
	@Test
	public void moveParaLeste() {
		submarino.executa(ControladorSubmarino.get('R'));
		assertEquals(Direcao.LESTE, submarino.getDirecao());
		submarino.executa(ControladorSubmarino.get('M'));
		assertEquals(1, submarino.getX());
		assertEquals(0, submarino.getY());
		assertEquals(0, submarino.getZ());		
	}
	
	@Test
	public void moveParaSul() {
		submarino.executa(ControladorSubmarino.get('R'));
		submarino.executa(ControladorSubmarino.get('R'));
		assertEquals(Direcao.SUL, submarino.getDirecao());
		submarino.executa(ControladorSubmarino.get('M'));
		assertEquals(0, submarino.getX());
		assertEquals(-1, submarino.getY());
		assertEquals(0, submarino.getZ());		
	}
	
	@Test
	public void moveParaOeste() {
		submarino.executa(ControladorSubmarino.get('L'));
		assertEquals(Direcao.OESTE, submarino.getDirecao());
		submarino.executa(ControladorSubmarino.get('M'));
		assertEquals(-1, submarino.getX());
		assertEquals(0, submarino.getY());
		assertEquals(0, submarino.getZ());		
	}
	
	@Test
	public void desce() {
		submarino.executa(ControladorSubmarino.get('D'));
		assertEquals(0, submarino.getX());
		assertEquals(0, submarino.getY());
		assertEquals(-1, submarino.getZ());
		assertEquals(Direcao.NORTE, submarino.getDirecao());
	}
	
	@Test
	public void sobe() {
		submarino.executa(ControladorSubmarino.get('D'));
		submarino.executa(ControladorSubmarino.get('U'));
		assertEquals(0, submarino.getX());
		assertEquals(0, submarino.getY());
		assertEquals(0, submarino.getZ());
		assertEquals(Direcao.NORTE, submarino.getDirecao());
	}
	
	@Test(expected=SubmarinoException.class)
	public void tentaSubirEmSuperficie() {
		submarino.executa(ControladorSubmarino.get('U'));
	}
	
	@Test
	public void tentaUsarComandoInexistente() {
		ComandoSubmarino comando = ControladorSubmarino.get('T');
		assertNull(comando);
		submarino.executa(comando);
		assertEquals(0, submarino.getX());
		assertEquals(0, submarino.getY());
		assertEquals(0, submarino.getZ());
		assertEquals(Direcao.NORTE, submarino.getDirecao());
		
	}

}
