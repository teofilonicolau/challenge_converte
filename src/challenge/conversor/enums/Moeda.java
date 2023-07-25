package challenge.conversor.enums;

import java.math.BigDecimal;

public enum Moeda {
	
	// cotação em 25/07/2023
	DOLAR(BigDecimal.valueOf(4.73)),
	EURO(BigDecimal.valueOf(5.24)),
	LIBRA_ESTERLINA(BigDecimal.valueOf(6.08)),
	PESO_ARGENTINO(BigDecimal.valueOf(0.017 )),
	PESO_CHILENO(BigDecimal.valueOf(0.0057));
	
	private BigDecimal FATOR_CONVERSAO;
	
	Moeda(BigDecimal FATOR_CONVERSAO) {
		this.FATOR_CONVERSAO = FATOR_CONVERSAO;
	}
	
	public BigDecimal getFATOR_CONVERSAO() {
		return FATOR_CONVERSAO;
	}
}
