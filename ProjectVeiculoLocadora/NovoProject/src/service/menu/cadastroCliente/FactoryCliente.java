package service.menu.cadastroCliente;

import model.cliente.Cliente;
import model.cliente.ClienteFisico;
import model.cliente.ClienteJuridico;
import service.menu.TextInput;

public class FactoryCliente {

	public Cliente getCliente(String tipo) {
		if (tipo.equalsIgnoreCase("1"))
			return new ClienteFisico(TextInput.textInput("NOME:"), TextInput.textInput("TELEFONE: "),
					TextInput.textInput("ENDEREÇO: "), TextInput.textInput("RG: "));
		else if (tipo.equalsIgnoreCase("2"))
			return new ClienteJuridico(TextInput.textInput("NOME:"), TextInput.textInput("TELEFONE: "),
					TextInput.textInput("ENDEREÇO: "), TextInput.textInput("CNPJ: "));
		else
			System.out.println("ARGUMENTO INSERIDO INVÁLIDO.\n");
		return null;
	}
}
