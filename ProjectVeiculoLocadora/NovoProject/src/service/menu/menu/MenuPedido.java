package service.menu.menu;

import java.util.Scanner;

import model.Eventos;
import service.menu.pedido.datasDefinidas.DataDeEntrega;
import service.menu.pedido.datasDefinidas.DataDeRetirada;
import service.menu.pedido.iDsSelecionado.SelecionandoIdCliente;
import service.menu.pedido.iDsSelecionado.SelecionandoIdVeiculo;

public class MenuPedido {

	static Scanner sc = new Scanner(System.in);
	private static String observacao;

	public static void pedido() {

		SelecionandoIdCliente.selecionaEVerificandoIdCliente();
		SelecionandoIdVeiculo.selecionaEVerificandoIdVeiculo();
		DataDeEntrega.definindoDataEntrega();
		DataDeRetirada.definindoDataRetirada();
		ValorDiaria.valorDaDiaria();

		Eventos.PAGAMENTO_DA_ENTRADA.toString("PAGAMENTO DE ENTRADA.");

		Eventos.OBSERVAÇÃO.toString("OBSERVAÇÃO: ");
		setObservacao(sc.nextLine());
	}

	public static String getObservacao() {
		return observacao;
	}

	public static void setObservacao(String observacao) {
		MenuPedido.observacao = observacao;
	}
}
