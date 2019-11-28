package model.veiculo;

public class Van extends Veiculo {
	public Van(String modelo, String ano, String placa, TipoCombustivel tipo) {
		this.setModelo(modelo);
		this.setAno(ano);
		this.setPlaca(placa);
		this.setTipo(tipo);
	}
}
