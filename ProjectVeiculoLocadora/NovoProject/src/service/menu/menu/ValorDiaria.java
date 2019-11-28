package service.menu.menu;

import DAO.ClienteDAO;
import model.cliente.ClienteFisico;
import service.menu.TextInput;
import service.menu.pedido.conversoes.ConversaoDeStringParaDouble;

public class ValorDiaria {

	public static Double valorDaDiaria() {
		// DESCONTO NO VALOR DIÁRIA
		String valorDaDiaria = TextInput.textInput("INSIRA O VALOR DA DIÁRIA: ");
		double valorDiariaConvertido = ConversaoDeStringParaDouble.conversao(valorDaDiaria);

		ClienteFisico clienteSelecionado = null;
		@SuppressWarnings("unlikely-arg-type")
		double desconto = (ClienteDAO.getClienteMap().containsValue(clienteSelecionado instanceof ClienteFisico))
				? valorDiariaConvertido * 5.5
				: 2.2;
		System.out.println("DESCONTO APLICADO !");

		return desconto;
	}
}
