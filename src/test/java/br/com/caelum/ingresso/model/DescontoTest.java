package br.com.caelum.ingresso.model;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalTime;

import org.junit.Test;

import br.com.caelum.ingresso.model.desconto.SemDesconto;

public class DescontoTest {
	@Test
	public void naoDeveConcederDescontoParaIngressoNormal() {
		Lugar lugar = new Lugar("A",1);
		Sala sala = new Sala("Eldorado-MAX", new BigDecimal("26.5"));
		Filme filme = new Filme("Rogue One", Duration.ofMinutes(120),"SCI-FI",new BigDecimal("12"));
		Sessao sessao = new Sessao(LocalTime.parse("10:00:00"),filme,sala);
		Ingresso ingresso = new Ingresso(sessao,TipoDeIngresso.INTEIRO,lugar);
		BigDecimal precoEsperado = new BigDecimal("38.50");
		assertEquals(precoEsperado,ingresso.getPreco());
		
		
	}

}
