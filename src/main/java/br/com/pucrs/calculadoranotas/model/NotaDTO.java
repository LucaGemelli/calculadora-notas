package br.com.pucrs.calculadoranotas.model;

import java.math.BigDecimal;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class NotaDTO {

	@NotNull(message = "Preencher Id da Nota")
	@Digits(integer=2, fraction = 0, message="Id Pode ter no máximo 2 casas")
	private Integer id;

	@Digits(integer=3, fraction=2, message="prova1 pode ter no máximo 3 casas inteiras e duas virgulas.")
	private BigDecimal prova1;

	@Digits(integer=3, fraction=2, message="peso1 pode ter no máximo 3 casas inteiras e duas virgulas.")
	private BigDecimal peso1;

	@Digits(integer=3, fraction=2, message="prova2 pode ter no máximo 3 casas inteiras e duas virgulas.")
	private BigDecimal prova2;

	@Digits(integer=3, fraction=2, message="peso2 pode ter no máximo 3 casas inteiras e duas virgulas.")
	private BigDecimal peso2;

	@Digits(integer=3, fraction=2, message="prova3 pode ter no máximo 3 casas inteiras e duas virgulas.")
	private BigDecimal prova3;

	@Digits(integer=3, fraction=2, message="peso3 pode ter no máximo 3 casas inteiras e duas virgulas.")
	private BigDecimal peso3;
}
