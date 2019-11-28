package service.menu.atualizar;

import service.menu.TextInput;
import service.menu.atualizar.opcaoMenuAtualizar.OpcaoAtualizar;
import service.menu.atualizar.opcaoMenuAtualizar.OpcaoRemover;

public class MenuAtualizar {
	// MÉTODO CONSTRUTOR ATUALIZAR
	public static void atualizar() {
		String opcao = TextInput.textInput("SELECIONE SUA OPÇÃO:\n 1- REMOVER\n 2- ATUALIZAR ALUGUEL \n");
		switch (opcao) {
		case "1":
			OpcaoRemover.remover();
			break;
		case "2":
			OpcaoAtualizar.atualizarPedido();
			break;
		default:
			System.out.println("OPÇÃO INVÁLIDA !!!\n");
		}
	}
}
