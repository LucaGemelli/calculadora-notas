package br.com.pucrs.calculadoranotas.model;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class EntradaDTO {

	
	@NotNull(message = "Preencher Lista de Alunos")
	private List<@Valid AlunosDTO> alunos;

}
