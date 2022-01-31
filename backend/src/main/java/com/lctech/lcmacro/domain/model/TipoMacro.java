package com.lctech.lcmacro.domain.model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_tipo_macro")
public class TipoMacro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nomeMacro;
	private String numeroMacro;

	public TipoMacro() {

	}

	public TipoMacro(Long id, String nomemacro, String numeromacro) {
		this.id = id;
		this.nomeMacro = nomemacro;
		this.numeroMacro = numeromacro;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomemacro() {
		return nomeMacro;
	}

	public void setNomemacro(String nomemacro) {
		this.nomeMacro = nomemacro;
	}

	public String getNumeromacro() {
		return numeroMacro;
	}

	public void setNumeromacro(String numeromacro) {
		this.numeroMacro = numeromacro;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TipoMacro other = (TipoMacro) obj;
		return Objects.equals(id, other.id);
	}

}
