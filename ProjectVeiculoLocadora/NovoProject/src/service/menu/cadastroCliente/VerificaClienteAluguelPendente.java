package service.menu.cadastroCliente;

import DAO.ClienteDAO;
import model.cliente.Cliente;
import model.cliente.ClienteJuridico;

public class VerificaClienteAluguelPendente {

	public static boolean verificaClienteAluguemPendente(Cliente cliente) {
		if (ClienteDAO.getClienteMap().containsValue((ClienteJuridico) cliente)) {
			System.out.println("CLIENTE PODE ALUGAR OUTRO VEÍCULO !\n");
			return true;
		} else
			System.out.println("CLIENTE FÍSICO CONTÉM ALUGUEL PENDENTE, NÃO PODE ALUGAR !");
		return false;
	}
}
