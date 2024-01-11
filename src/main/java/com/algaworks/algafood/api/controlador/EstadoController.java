package com.algaworks.algafood.api.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.algafood.domain.model.Estado;
import com.algaworks.algafood.domain.repository.EstadoRepository;
import com.algaworks.algafood.domain.service.CadastroEstadoService;

@RestController
@RequestMapping("/estados")
public class EstadoController {
	
	@Autowired
	private EstadoRepository estadoRepository;
	
	@Autowired
	private CadastroEstadoService cadastroEstado;

	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Estado> listar(){
		return estadoRepository.listar();
	}
	
	
	@GetMapping("/{estadoId}")
	public ResponseEntity<Estado> buscar(@PathVariable Long estadoId){
		Estado estado = estadoRepository.buscar(estadoId);
		
		if(estado != null) {
			return ResponseEntity.status(HttpStatus.OK).body(estado);
		}
		
		return ResponseEntity.notFound().build();
		
	}
	
	@ResponseStatus(code = HttpStatus.CREATED)
	@PostMapping
	public Estado adicionar(@RequestBody Estado estado){
		return cadastroEstado.adicionar(estado);
		
	}
}
