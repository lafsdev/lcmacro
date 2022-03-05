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

import com.lctech.lcmacro.domain.model.Macro;
import com.lctech.lcmacro.domain.model.Proprietario;
import com.lctech.lcmacro.domain.service.MacroService;

@RestController
@ResponseBody
@RequestMapping(value = "/api/macro")
public class MacroController {
	
	private MacroService macroService;

	public MacroController(MacroService macroService) {
		this.macroService = macroService;
	}
	
	@GetMapping
	public List<Macro> findAll() {
		return macroService.findAll();
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Macro save(@RequestBody Macro macro) {
		return macroService.save(macro);
	}

	@DeleteMapping("/{macroId}")
	public void deleteById(@PathVariable Long macroId) {

		macroService.deleteById(macroId);
	}
	
 
}
