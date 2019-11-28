package service.menu.cadastroCliente;

import DAO.ClienteDAO;
import model.cliente.Cliente;
import service.menu.TextInput;

public class SelecionandoTipoDeCliente {
	static FactoryCliente factoryCliente = new FactoryCliente();

	// SELECIONANDO TIPO CLIENTE
	public static void selecionandoTipoCliente() {
			String tipoDeCliente = TextInput.textInput("SELECIONE TIPO DE CLIENTE, F�SICO [1] / JUR�DICO [2] ?\n");
			Cliente tipoDeClienteSelecionado = factoryCliente.getCliente(tipoDeCliente);

			// VERIFICA��O DE CLIENTE COM ALUGUEL PENDENTE
			ClienteDAO.adicionaCliente(tipoDeClienteSelecionado);
	}
}
