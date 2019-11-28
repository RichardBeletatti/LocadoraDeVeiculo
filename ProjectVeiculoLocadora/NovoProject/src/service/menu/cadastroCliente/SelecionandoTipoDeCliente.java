package service.menu.cadastroCliente;

import DAO.ClienteDAO;
import model.cliente.Cliente;
import service.menu.TextInput;

public class SelecionandoTipoDeCliente {
	static FactoryCliente factoryCliente = new FactoryCliente();

	// SELECIONANDO TIPO CLIENTE
	public static void selecionandoTipoCliente() {
			String tipoDeCliente = TextInput.textInput("SELECIONE TIPO DE CLIENTE, FÍSICO [1] / JURÍDICO [2] ?\n");
			Cliente tipoDeClienteSelecionado = factoryCliente.getCliente(tipoDeCliente);

			// VERIFICAÇÃO DE CLIENTE COM ALUGUEL PENDENTE
			ClienteDAO.adicionaCliente(tipoDeClienteSelecionado);
	}
}
