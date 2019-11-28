package model.veiculo;

public class Veiculo {

	private String modelo;
	private String ano;
	private TipoCombustivel tipo;
	private String placa;

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public TipoCombustivel getTipo() {
		return tipo;
	}

	public void setTipo(TipoCombustivel tipo) {
		this.tipo = tipo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

}
