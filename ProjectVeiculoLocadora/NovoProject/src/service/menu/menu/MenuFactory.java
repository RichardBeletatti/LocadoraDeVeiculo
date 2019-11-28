package service.menu.menu;

import java.util.HashMap;
import java.util.Map;

import service.menu.IntInput;
import service.menu.TextInput;
import service.menu.atualizar.MenuAtualizar;
import service.menu.cadastroCliente.MenuCadastraCliente;
import service.menu.cadastroVeiculo.MenuCadastraVeiculo;
import service.menu.consultar.MenuConsultar;

public class MenuFactory {

	private static MenuFactory instance;

	public static synchronized MenuFactory get() {
		if (instance == null) {
			instance = new MenuFactory();
		}
		return instance;
	}

	final Map<String, Runnable> acoes;

	public MenuFactory() {

		acoes = new HashMap<>();
		acoes.put("1", () -> MenuPedido.pedido());
		acoes.put("2", () -> MenuCadastraCliente.cadastroCliente());
		acoes.put("3", () -> MenuCadastraVeiculo.cadastroVeiculo());
		acoes.put("4", () -> MenuAtualizar.atualizar());
		acoes.put("5", () -> MenuConsultar.consultar());

	}

	public void getMenu() {
		int cadastrando = 1;
		while (cadastrando == 1) {
			try {
				String opcao = TextInput
						.textInput("SELECIONE A OPÇÃO:\n" + " 1 - PEDIDO \n" + " 2 - CADASTRAR CLIENTE \n"
								+ " 3 - CADASTRAR VEÍCULO \n" + " 4 - ATUALIZAR \n" + " 5 - CONSULTAR \n ");

				Runnable acao = acoes.get(opcao);
				acao.run();

			} catch (NullPointerException e) {
				System.out.println("OPÇÃO INSERIDA INVÁLIDA.\n");
			}

			try {
				cadastrando = IntInput.intInput("CONTINUAR NO MENU ? SIM [1] / NÃO [2]\n");
			} catch (IllegalArgumentException e) {
				System.out.println("ARGUMENTO INSERIDO NÃO RECONHECIDO.\n");
			}
		}
	}
}