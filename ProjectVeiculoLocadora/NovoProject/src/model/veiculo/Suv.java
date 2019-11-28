package model.veiculo;

public class Suv extends Veiculo {
	public Suv(String modelo, String ano, String placa, TipoCombustivel tipo) {
		this.setModelo(modelo);
		this.setAno(ano);
		this.setPlaca(placa);
		this.setTipo(tipo);
	}
}
