package br.com.pucrs.calculadoranotas.resource;

import java.math.BigDecimal;
import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.pucrs.calculadoranotas.model.AvaliacaoDTO;
import br.com.pucrs.calculadoranotas.service.AvaliacaoService;

@CrossOrigin
@RestController
@RequestMapping("/avaliacao")
public class AvaliacaoResource {

	private final AvaliacaoService service;

	public AvaliacaoResource(AvaliacaoService service) {
		this.service = service;
	}

	@PostMapping
	public ResponseEntity<BigDecimal> save(@Valid @RequestBody List<AvaliacaoDTO> dto) {
		return new ResponseEntity<>(service.calculaValores(dto), HttpStatus.OK);
	}
}
