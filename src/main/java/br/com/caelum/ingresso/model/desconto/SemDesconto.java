package br.com.caelum.ingresso.model.desconto;

import java.math.BigDecimal;

import br.com.caelum.ingresso.model.Desconto;

public class SemDesconto implements Desconto {

	@Override
	public BigDecimal aplicarDescontoSobre(BigDecimal precoOriginal) {
		
		return precoOriginal;
		
	}

	@Override
	public String getDescricao() {
		// TODO Auto-generated method stub
		return "Normal";
	}

}
