package com.lctech.lcmacro.domain.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lctech.lcmacro.domain.model.Macro;
import com.lctech.lcmacro.domain.repository.MacroRepository;

@Service
public class MacroService {

	private MacroRepository macroRepository;

	public MacroService(MacroRepository macroRepository) {
		this.macroRepository = macroRepository;
	}

	public Macro save(Macro macro) {
		return macroRepository.save(macro);
	}

	public List<Macro> findAll() {
		return macroRepository.findAll();
	}

	public void deleteById(Long macroId) {
		macroRepository.deleteById(macroId);
	}
}
