package service.menu.consultar;

import service.menu.TextInput;

public class MenuConsultar {

	public static void consultar() {

		String opcaoDeConsulta = TextInput.textInput("OPÇÃO DE CONSULTA:\n" + " 1 - CADASTRO REGISTRO\n "
				+ "2 - CADASTRO CLIENTE\n " + "3 - CADASTRO VEÍCULO\n");

		if (opcaoDeConsulta.equalsIgnoreCase("1")) {
			OpcaoConsulta.consultarPedido();
		} else if (opcaoDeConsulta.equalsIgnoreCase("2")) {
			OpcaoConsulta.consultarClientesCadastrados();
		} else if (opcaoDeConsulta.equalsIgnoreCase("3")) {
			OpcaoConsulta.consultarVeiculosCadastrados();
		} else {
			System.out.println("OPÇÃO INVÁLIDAS !");
		}
	}
}