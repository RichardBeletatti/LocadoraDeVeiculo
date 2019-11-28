package service.menu.atualizar.opcaoMenuAtualizar;

import java.util.Map;

import DAO.PedidoDAO;
import service.menu.TextInput;

public class OpcaoRemover {

	// MÉTODO REMOVE PEDIDO
	public static void remover() {
		// IMPRIMINDO MAP DE PEDIDO
		for (Map.Entry<String, PedidoDAO> entryPedido : PedidoDAO.getPedidoMap().entrySet()) {
			System.out.println(
					"ID DO PEDIDO: " + entryPedido.getKey() + " VALOR DO ID PEDIDO: " + entryPedido.getValue());

			// REMOVENDO PEDIDO
			if (PedidoDAO.getPedidoMap().remove(TextInput.textInput("DIGITE O PEDIDO DESEJA REMOVER: ")) != null) {
				System.out.println("REMOVIDO COM SUCESSO !!!\n");
			}
		}
	}
}
