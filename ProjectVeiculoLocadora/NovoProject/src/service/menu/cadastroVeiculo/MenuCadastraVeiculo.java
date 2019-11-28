package service.menu.cadastroVeiculo;

import DAO.VeiculoDAO;
import model.veiculo.Veiculo;
import service.menu.TextInput;

public class MenuCadastraVeiculo {
	static FactoryVeiculo factoryVeiculo = new FactoryVeiculo();
	static int cadastrando = 1;

	// CADASTRO VEÍCULO
	public static void cadastroVeiculo() {

		while (cadastrando == 1) {
			// TIPO DE VEÍCULO A SER CRIADO
			String tipoDeVeiculo = TextInput.textInput("SELECIONE O TIPO DE VEÍCULO:" + " HATCH[1], " + "PICAPE[2],"
					+ " SEDAN[3], " + "SUV[4], " + "VAN[5]");

			Veiculo tipoDeVeiculoSelecionado = FactoryVeiculo.getVeiculo(tipoDeVeiculo);

			// VERIFICA VEÍCULO DISPONÍVEL
			if (VerificaVeiculoDisponivel.verificaVeiculoDisponivel(tipoDeVeiculoSelecionado))
				VeiculoDAO.adicionaVeiculo(tipoDeVeiculoSelecionado);

			String continuarCadastrandoVeiculo = TextInput
					.textInput("CONTINUAR CADASTRANDO VEÍCULO ? SIM [1] / NÃO [2]\n");
			if (continuarCadastrandoVeiculo.equalsIgnoreCase("1")) {

			} else if (continuarCadastrandoVeiculo.equalsIgnoreCase("2")) {
				System.out.println("CADASTRO DE VEÍCULO FINALIZADO COM SUCESSO !\n");
				cadastrando = 2;
			}
		}
	}
}
