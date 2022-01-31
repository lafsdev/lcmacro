package com.lctech.lcmacro.domain.model;

import java.math.BigDecimal;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_macro")
public class Macro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "tipo_macro_id", nullable = false)
	private TipoMacro tipoMacro;
	
	@ManyToOne
	@JoinColumn(name = "veiculo_id", nullable = false)
	private Veiculo veiculo;
	
	private String notaFiscal;
	
	private Integer kilometragem;
	
	private BigDecimal quantidadeDiesel;
	
	private BigDecimal quantidadeArla;
	
	private Integer numeroPneu;
	
	private BigDecimal peso;
	
	private String postoNome;
	
	private String ctrc;
	
	private String posicao;
	
	private String mensagem;
	
	public Macro() {
		
	}

	public Macro(Long id, TipoMacro tipoMacro, Veiculo veiculo, String notaFiscal, Integer kilometragem,
			BigDecimal quantidadeDiesel, BigDecimal quantidadeArla, Integer numeroPneu, BigDecimal peso,
			String postoNome, String ctrc, String posicao, String mensagem) {
		this.id = id;
		this.tipoMacro = tipoMacro;
		this.veiculo = veiculo;
		this.notaFiscal = notaFiscal;
		this.kilometragem = kilometragem;
		this.quantidadeDiesel = quantidadeDiesel;
		this.quantidadeArla = quantidadeArla;
		this.numeroPneu = numeroPneu;
		this.peso = peso;
		this.postoNome = postoNome;
		this.ctrc = ctrc;
		this.posicao = posicao;
		this.mensagem = mensagem;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public TipoMacro getTipoMacro() {
		return tipoMacro;
	}

	public void setTipoMacro(TipoMacro tipoMacro) {
		this.tipoMacro = tipoMacro;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public String getNotaFiscal() {
		return notaFiscal;
	}

	public void setNotaFiscal(String notaFiscal) {
		this.notaFiscal = notaFiscal;
	}

	public Integer getKilometragem() {
		return kilometragem;
	}

	public void setKilometragem(Integer kilometragem) {
		this.kilometragem = kilometragem;
	}

	public BigDecimal getQuantidadeDiesel() {
		return quantidadeDiesel;
	}

	public void setQuantidadeDiesel(BigDecimal quantidadeDiesel) {
		this.quantidadeDiesel = quantidadeDiesel;
	}

	public BigDecimal getQuantidadeArla() {
		return quantidadeArla;
	}

	public void setQuantidadeArla(BigDecimal quantidadeArla) {
		this.quantidadeArla = quantidadeArla;
	}

	public Integer getNumeroPneu() {
		return numeroPneu;
	}

	public void setNumeroPneu(Integer numeroPneu) {
		this.numeroPneu = numeroPneu;
	}

	public BigDecimal getPeso() {
		return peso;
	}

	public void setPeso(BigDecimal peso) {
		this.peso = peso;
	}

	public String getPostoNome() {
		return postoNome;
	}

	public void setPostoNome(String postoNome) {
		this.postoNome = postoNome;
	}

	public String getCtrc() {
		return ctrc;
	}

	public void setCtrc(String ctrc) {
		this.ctrc = ctrc;
	}

	public String getPosicao() {
		return posicao;
	}

	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
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
		Macro other = (Macro) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
