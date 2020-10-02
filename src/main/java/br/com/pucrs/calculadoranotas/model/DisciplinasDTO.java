package br.com.pucrs.calculadoranotas.model;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class DisciplinasDTO {

	@NotNull(message = "Preencher Id da Disciplina")
	@Digits(integer=2, fraction = 0, message="Id Pode ter no máximo 2 casas")
	private Integer id;

	@NotNull(message = "Preencher Nome da Disciplina")
	@Size(min = 1, max = 40, message = "Nome com no máximo 40 caracteres para Aluno.")
	private String nome;

	@NotNull(message = "Preencher Notas da Disciplina")
	private List<@Valid NotaDTO> notas;
}
