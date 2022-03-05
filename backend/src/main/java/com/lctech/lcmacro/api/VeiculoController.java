package com.lctech.lcmacro.api;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.lctech.lcmacro.domain.model.Veiculo;
import com.lctech.lcmacro.domain.service.VeiculoService;

@RestController
@ResponseBody
@RequestMapping(value = "/api/veiculo")
public class VeiculoController {

	private VeiculoService veiculoService;

	public VeiculoController(VeiculoService veiculoService) {
		this.veiculoService = veiculoService;
	}
	
	@GetMapping
	public List<Veiculo> findAll() {
		return veiculoService.findAll();
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Veiculo save(@RequestBody Veiculo veiculo) {
		return veiculoService.save(veiculo);
	}

	@DeleteMapping("/{veiculoId}")
	public void deleteById(@PathVariable Long veiculoId) {

		veiculoService.deleteById(veiculoId);
	}

}
