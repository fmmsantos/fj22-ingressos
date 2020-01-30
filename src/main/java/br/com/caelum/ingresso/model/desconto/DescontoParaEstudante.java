package br.com.caelum.ingresso.model.desconto;

import java.math.BigDecimal;

import br.com.caelum.ingresso.model.Desconto;

public class  DescontoParaEstudante implements Desconto{

	@Override
	public BigDecimal aplicarDescontoSobre(BigDecimal precoOriginal) {
		precoOriginal = precoOriginal.divide(new BigDecimal("0.5"));
		return precoOriginal;
	}

	@Override
	public String getDescricao() {
		// TODO Auto-generated method stub
		return "Desconto Estudante";
	}
	

}
