package model;

import java.util.List;

import model.cliente.Cliente;
import model.veiculo.Veiculo;

public class Filial {
	private String nome;
	private List<Cliente> clientesDaFilial;
	private List<Veiculo> veiculosDaFilial;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Veiculo> getVeiculosDaFilial() {
		return veiculosDaFilial;
	}

	public void setVeiculosDaFilial(List<Veiculo> veiculosDaFilial) {
		this.veiculosDaFilial = veiculosDaFilial;
	}

	public void addVeiculo(Veiculo veiculo) {
		veiculosDaFilial.add(veiculo);
	}

	public void removeVeiculo(int posicao) {
		veiculosDaFilial.remove(posicao);
	}

	public List<Cliente> getClientesDaFilial() {
		return clientesDaFilial;
	}

	public void setClientesDaFilial(List<Cliente> clientesDaFilial) {
		this.clientesDaFilial = clientesDaFilial;
	}

	enum status {
		CRIADO, EM_ANDAMENTO;
	}
}
