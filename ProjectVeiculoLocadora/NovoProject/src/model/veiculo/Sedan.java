package model.veiculo;

public class Sedan extends Veiculo {
	public Sedan(String modelo, String ano, String placa, TipoCombustivel tipo) {
		this.setModelo(modelo);
		this.setAno(ano);
		this.setPlaca(placa);
		this.setTipo(tipo);
	}
}
