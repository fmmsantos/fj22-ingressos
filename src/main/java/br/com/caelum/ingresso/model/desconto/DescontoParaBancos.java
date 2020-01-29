package br.com.caelum.ingresso.model.desconto;

import java.math.BigDecimal;

import br.com.caelum.ingresso.model.Desconto;

public class DescontoParaBancos implements Desconto{

	@Override
	public BigDecimal aplicarDescontoSobre(BigDecimal precoOriginal) {
		precoOriginal = precoOriginal.subtract(descontoTrintaPorCentoSobre(precoOriginal));
		return null;
	}
	private BigDecimal descontoTrintaPorCentoSobre(BigDecimal precoOriginal) {
	return	precoOriginal = precoOriginal.multiply(new BigDecimal("0.3"));
	}

}
