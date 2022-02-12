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

import com.lctech.lcmacro.domain.model.Proprietario;
import com.lctech.lcmacro.domain.service.ProprietarioService;

@RestController
@ResponseBody
@RequestMapping(value = "/api/proprietario")
public class ProprietarioController {

	private ProprietarioService proprietarioService;

	public ProprietarioController(ProprietarioService proprietarioService) {
		this.proprietarioService = proprietarioService;
	}

	@GetMapping
	public List<Proprietario> findAll() {
		return proprietarioService.findAll();
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Proprietario save(@RequestBody Proprietario proprietario) {
		return proprietarioService.save(proprietario);
	}

	@DeleteMapping("/{proprietarioId}")
	public void deleteById(@PathVariable Long proprietarioId) {

		proprietarioService.deleteById(proprietarioId);
	}
}
