package model.cliente;

public class ClienteFisico extends Cliente {

	private String rg;

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public ClienteFisico(String nome, String telefone, String endereco, String rg) {
		super();
		this.setRg(rg);
	}
}
