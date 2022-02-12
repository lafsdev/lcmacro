package com.lctech.lcmacro.domain.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lctech.lcmacro.domain.model.Proprietario;
import com.lctech.lcmacro.domain.repository.ProprietarioRepository;
@Service
public class ProprietarioService {

	private ProprietarioRepository proprietarioRepository;

	public ProprietarioService(ProprietarioRepository proprietarioRepository) {
		this.proprietarioRepository = proprietarioRepository;
	}

	public Proprietario save(Proprietario proprietario) {
		return proprietarioRepository.save(proprietario);
	}

	public List<Proprietario> findAll() {
		return proprietarioRepository.findAll();
	}

	public void deleteById(Long proprietarioId) {
		proprietarioRepository.deleteById(proprietarioId);
	}

}
