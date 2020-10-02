package br.com.pucrs.calculadoranotas.resource;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.pucrs.calculadoranotas.model.EntradaDTO;
import br.com.pucrs.calculadoranotas.service.AlunosService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin
@RestController
@RequestMapping("/avaliacao")
@Api(value="API AVALIACAO")
public class AlunosResource {

	private final AlunosService service;

	public AlunosResource(AlunosService service) {
		this.service = service;
	}

	@PostMapping
	@ApiOperation(value="Retorna as notas calculada dos alunos.")
	public ResponseEntity<String> save(@Valid @RequestBody EntradaDTO dto) {
		return new ResponseEntity<>(service.calculaNotas(dto.getAlunos()), HttpStatus.OK);
	}
}
