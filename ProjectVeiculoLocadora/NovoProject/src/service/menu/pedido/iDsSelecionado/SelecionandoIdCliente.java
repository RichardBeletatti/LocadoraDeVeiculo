package service.menu.pedido.iDsSelecionado;

import java.util.Map;
import java.util.Scanner;

import DAO.ClienteDAO;
import model.cliente.Cliente;

public class SelecionandoIdCliente {

	private static Cliente clienteSelecionado;

	public static void selecionaEVerificandoIdCliente() {

		for (Map.Entry<String, Cliente> clienteEntry : ClienteDAO.getClienteMap().entrySet())
			System.out.println("ID DO CLIENTE: " + clienteEntry.getKey() + " VALOR DO ID CLIENTE: "
					+ clienteEntry.getValue() + "\n");

		setClienteSelecionado(ClienteDAO.getClienteMap().get(textInput("DIGITE O ID CLIENTE DESEJA SELECIONAR: ")));

	}

	// MÉTODO IMPLEMENTAÇÃO DE TEXTO
	private static String textInput(String string) {
		System.out.println(string);
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		return input.nextLine();
	}

	public static Cliente getClienteSelecionado() {
		return clienteSelecionado;
	}

	public static void setClienteSelecionado(Cliente clienteSelecionado) {
		SelecionandoIdCliente.clienteSelecionado = clienteSelecionado;
	}
}
