package br.com.pucrs.calculadoranotas.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.pucrs.calculadoranotas.model.AvaliacaoDTO;

@Service
public class AvaliacaoService {

	public BigDecimal calculaValores(final List<AvaliacaoDTO> dto) {
		BigDecimal resultado =  BigDecimal.ZERO;
		for(int i=0; i < dto.size(); i++) {
			resultado = resultado.add(dto.get(i)
										  .getNota()
										  .getValor().multiply(dto.get(i)
																  .getPeso()
																  .getValor()));
		}
		return resultado.divide(new BigDecimal(dto.size()));
	}
}
