package com.lctech.lcmacro.api;

import java.util.List;
import java.util.Optional;

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

import com.lctech.lcmacro.domain.model.TipoMacro;
import com.lctech.lcmacro.domain.service.TipoMacroService;

@RestController
@ResponseBody
@RequestMapping(value = "/api/tipomacro")
public class TipoMacroController {

	private TipoMacroService tipoMacroService;

	public TipoMacroController(TipoMacroService tipoMacroService) {
		this.tipoMacroService = tipoMacroService;
	}

	@GetMapping
	public List<TipoMacro> findAll() {
		return tipoMacroService.findAll();
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public TipoMacro save(@RequestBody TipoMacro tipoMacro) {
		return tipoMacroService.save(tipoMacro);
	}

	@DeleteMapping("/{tipoMacroId}")
	public void deleteById(@PathVariable Long tipoMacroId) {

		tipoMacroService.deleteById(tipoMacroId);
	}
	
	@GetMapping("/{tipoMacroId}")
	public Optional<TipoMacro> getById(@PathVariable Long tipoMacroId) {

		return tipoMacroService.findById(tipoMacroId);
	}
}
