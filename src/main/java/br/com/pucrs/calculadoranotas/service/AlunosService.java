package br.com.pucrs.calculadoranotas.service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.pucrs.calculadoranotas.model.AlunosDTO;
import br.com.pucrs.calculadoranotas.model.NotaDTO;

@Service
public class AlunosService {

	public String calculaNotas(final List<AlunosDTO> dto) {
		final StringBuilder resposta = new StringBuilder();

		dto.parallelStream()
		   .forEach(aluno -> {
				aluno.getDisciplinas().forEach(disciplina -> {
					BigDecimal notaGeral =  BigDecimal.ZERO;
					BigDecimal divide = BigDecimal.ZERO;

					for(int x=0; x < disciplina.getNotas().size(); x++) {
						final NotaDTO nota = disciplina.getNotas().get(x);
						if(nota.getProva1() != null) {
							final BigDecimal peso1 = this.validaPeso(nota.getPeso1());
							divide = divide.add(peso1);
							notaGeral = notaGeral.add(this.calculaNota(nota.getProva1(),
																	   peso1));
						}

						if(nota.getProva2() != null) {
							final BigDecimal peso2 = this.validaPeso(nota.getPeso2());
							divide = divide.add(peso2);
							notaGeral = notaGeral.add(this.calculaNota(nota.getProva2(), 
																	   peso2));
						}

						if(nota.getProva3() != null) {
							final BigDecimal peso3 = this.validaPeso(nota.getPeso3());
							divide = divide.add(peso3);
							notaGeral = notaGeral.add(this.calculaNota(nota.getProva3(),
																	    peso3));
						}
					}
					if(notaGeral != null && notaGeral != BigDecimal.ZERO) {
						resposta.append(this.montaReposta(aluno.getId(), 
														  aluno.getNome(),
														  disciplina.getNome(),
														  notaGeral.divide(divide, RoundingMode.HALF_UP)));
					} else {
						resposta.append(this.montaReposta(aluno.getId(), 
														  aluno.getNome(),
														  disciplina.getNome(),
														  BigDecimal.ZERO));

					}
				});
		 });

		return resposta.toString();
	}

	private BigDecimal validaPeso(final BigDecimal peso) {
		if(peso == null) {
			return BigDecimal.ONE;
		}
		return peso;
	}

	private BigDecimal calculaNota(final BigDecimal nota, final BigDecimal peso) {
		return nota.multiply(peso);
	}

	private String montaReposta(final Integer id,
								final String nomeAluno,
								final String nomeDisciplina,
								final BigDecimal nota) {
		return new StringBuilder().append("\n")
								  .append(" Aluno ")
								  .append(id)
								  .append(" - ")
								  .append(nomeAluno)
								  .append(" Na Disciplina ")
								  .append(nomeDisciplina)
								  .append(" Tirou a Nota ")
								  .append(nota)
								  .toString();
	}
}
