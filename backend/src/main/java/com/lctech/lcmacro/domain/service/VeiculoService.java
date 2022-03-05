package com.lctech.lcmacro.domain.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lctech.lcmacro.domain.model.Veiculo;
import com.lctech.lcmacro.domain.repository.VeiculoRepository;

@Service
public class VeiculoService {

	private VeiculoRepository veiculoRepository;

	public VeiculoService(VeiculoRepository veiculoRepository) {
		this.veiculoRepository = veiculoRepository;
	}

	public Veiculo save(Veiculo veiculo) {
		return veiculoRepository.save(veiculo);
	}

	public List<Veiculo> findAll() {
		return veiculoRepository.findAll();
	}

	public void deleteById(Long veiculoId) {
		veiculoRepository.deleteById(veiculoId);
	}
}
