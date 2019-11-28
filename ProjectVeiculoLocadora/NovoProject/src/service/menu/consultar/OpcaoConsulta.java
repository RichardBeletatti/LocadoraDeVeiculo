package service.menu.consultar;

import java.util.Map;
import java.util.Map.Entry;

import DAO.ClienteDAO;
import DAO.PedidoDAO;
import DAO.VeiculoDAO;
import model.cliente.Cliente;
import model.veiculo.Veiculo;

public class OpcaoConsulta {

	// M�TODO PRIVADO PARA CONSULTAR TUDO QUE H� CADASTRADOS
	public static void consultarPedido() {
		for (Entry<String, PedidoDAO> entryPedido : PedidoDAO.getPedidoMap().entrySet()) {
			System.out.println(
					"ID DO PEDIDO: " + entryPedido.getKey() + " VALOR DO ID PEDIDO: " + entryPedido.getValue());
		}
	}

	// M�TODO PRIVADO PARA CONSULTAR APENAS CLIENTES CADASTRADOS
	public static void consultarClientesCadastrados() {
		for (Entry<String, Cliente> entryCliente : ClienteDAO.getClienteMap().entrySet()) {
			System.out.println(
					"ID DO CLIENTE: " + entryCliente.getKey() + " VALOR DO ID CLIENTE: " + entryCliente.getValue());
		}
	}

	// M�TODO PRIVADO PARA CONSULTAR APENAS VE�CULOS CADASTRADOS
	public static void consultarVeiculosCadastrados() {
		for (Map.Entry<String, Veiculo> veiculoEntry : VeiculoDAO.getVeiculoMap().entrySet()) {
			System.out.println(
					"ID DO VE�CULO: " + veiculoEntry.getKey() + "VALOR DO ID CLIENTE: " + veiculoEntry.getValue());
		}
	}
}
