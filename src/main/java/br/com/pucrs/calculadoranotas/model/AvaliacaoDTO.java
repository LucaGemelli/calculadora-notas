package br.com.pucrs.calculadoranotas.model;

import javax.validation.Valid;

import lombok.Data;

@Data
public class AvaliacaoDTO {

	@Valid
	private PesoDTO peso;

	@Valid
	private NotaDTO nota;

}
