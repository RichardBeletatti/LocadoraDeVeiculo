package model.cliente;

public class ClienteJuridico extends Cliente {

	private String cnpj;

	public ClienteJuridico(String nome, String telefone, String endereco, String cnpj) {
		super();
		this.setCnpj(cnpj);
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
}
