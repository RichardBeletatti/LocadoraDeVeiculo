package model.veiculo;

public class Picape extends Veiculo {

	public Picape(String modelo, String ano, String placa, TipoCombustivel tipo) {
		this.setModelo(modelo);
		this.setPlaca(placa);
		this.setAno(ano);
		this.setTipo(tipo);
	}
}
