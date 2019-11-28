package service.menu.pedido.iDsSelecionado;

import java.util.Map;
import java.util.Scanner;

import DAO.VeiculoDAO;
import model.veiculo.Veiculo;

public class SelecionandoIdVeiculo {

	// SELECIONANDO ID VECULO
	public static void selecionaEVerificandoIdVeiculo() {
		// IMPRIMINDO E VERIFICANDO MAP DE ID VE�CULO
		for (Map.Entry<String, Veiculo> veiculoEntry : VeiculoDAO.getVeiculoMap().entrySet())
			System.out.println("ID DO VE�CULO: " + veiculoEntry.getKey() + "VALOR DO ID CLIENTE: " + veiculoEntry.getValue());

		// SELECIONANDO O ID VE�CULO
		VeiculoDAO.getVeiculoMap().get(textInput("DIGITE O ID VE�CULO DESEJA SELECIONAR: "));
	}

	private static String textInput(String string) {
		System.out.println(string);
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		return input.nextLine();
	}
}
