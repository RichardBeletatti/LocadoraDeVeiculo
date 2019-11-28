package service.menu.cadastroCliente;

import service.menu.TextInput;

public class MenuCadastraCliente {

	// CADASTRO DE CLIENTE
	public static void cadastroCliente() {
		int cadastrandoCliente = 1;

		while (cadastrandoCliente == 1) {
			// SELECIONANDO TIPO CLIENTE
			SelecionandoTipoDeCliente.selecionandoTipoCliente();

			// CONTINUAR CADASTRANDO CLIENTE
			String continuarCadastrandoCliente = TextInput
					.textInput("CONTINUAR CADASTRANDO CLIENTE ? SIM [1] / NÃO [2]");

			if (continuarCadastrandoCliente.equalsIgnoreCase("1")) {

			} else if (continuarCadastrandoCliente.equalsIgnoreCase("2")) {
				System.out.println("CADASTRO DE CLIENTE FINALIZADO COM SUCESSO !\n");
				cadastrandoCliente = 2;
			}
		}
	}
}
