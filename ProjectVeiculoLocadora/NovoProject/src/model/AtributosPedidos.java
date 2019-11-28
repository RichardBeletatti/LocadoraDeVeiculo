package model;

import java.sql.Date;
import java.util.UUID;

public class AtributosPedidos {

	private String idCliente = UUID.randomUUID().toString();
	@SuppressWarnings("unused")
	private String idVeiculo = UUID.randomUUID().toString();
	private Date dataRetirada;
	private Date dataDevolucao;
	private Double valorDaDiaria;

	public String getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}

	public void setIdVeiculo(String idVeiculo) {
		this.idVeiculo = idVeiculo;
	}

	public Date getDataRetirada() {
		return dataRetirada;
	}

	public void setDataRetirada(Date dataRetirada) {
		this.dataRetirada = dataRetirada;
	}

	public Date getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(Date dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

	public Double getValorDaDiaria() {
		return valorDaDiaria;
	}

	public void setValorDaDiaria(Double valorDaDiaria) {
		this.valorDaDiaria = valorDaDiaria;
	}
}
