package com.lctech.lcmacro.domain.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.lctech.lcmacro.domain.model.TipoMacro;
import com.lctech.lcmacro.domain.repository.TipoMacroRepository;

@Service
public class TipoMacroService {

	private TipoMacroRepository tipoMacroRepository;

	public TipoMacroService(TipoMacroRepository tipoMacroRepository) {
		this.tipoMacroRepository = tipoMacroRepository;
	}

	public TipoMacro save(TipoMacro tipoMacro) {
		return tipoMacroRepository.save(tipoMacro);
	}

	public List<TipoMacro> findAll() {
		return tipoMacroRepository.findAll();
	}

	public void deleteById(Long tipoMacroId) {
		tipoMacroRepository.deleteById(tipoMacroId);
	}
	
	public Optional<TipoMacro> findById(Long tipoMacroId) {
		return tipoMacroRepository.findById(tipoMacroId);
	}

}
