package service.menu.atualizar.opcaoMenuAtualizar;

import java.util.Map;
import java.util.UUID;

import DAO.PedidoDAO;
import service.menu.TextInput;

public class OpcaoAtualizar {

	// MÉTODO DE ATUALIZAR PEDIDO
	public static void atualizarPedido() {
		@SuppressWarnings("unused")
		String id = UUID.randomUUID().toString();

		// IMPRIMINDO MAP DE PEDIDO
		for (Map.Entry<String, PedidoDAO> entryPedido : PedidoDAO.getPedidoMap().entrySet()) {
			System.out.println("ID DO PEDIDO: " + entryPedido.getKey() + "VALOR DO ID PEDIDO: ");

			// SELECIONANDO PEDIDO
			@SuppressWarnings("unused")
			PedidoDAO pedidoSelecionado = PedidoDAO.getPedidoMap()
					.get(TextInput.textInput("DIGITE O PEDIDO DESEJA ALTERAR: "));

		}
	}
}
