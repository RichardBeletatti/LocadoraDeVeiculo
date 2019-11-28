package service.menu.cadastroVeiculo;

public enum TipoVeiculoSelecionado {

	HATCH("1"), PICAPE("2"), SEDAN("3"), SUV("4"), VAN("5");

	public String posicaoEscolhida;

	private TipoVeiculoSelecionado(String posicao) {
		posicaoEscolhida = posicao;
	}
}
