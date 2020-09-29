package br.com.pucrs.calculadoranotas.model;

import java.math.BigDecimal;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class PesoDTO {

	@NotNull(message = "Preencher o Campo Valor ")
	@DecimalMin(value = "0.1")
    @Digits(integer=3, fraction=2)
	private BigDecimal valor;
}
