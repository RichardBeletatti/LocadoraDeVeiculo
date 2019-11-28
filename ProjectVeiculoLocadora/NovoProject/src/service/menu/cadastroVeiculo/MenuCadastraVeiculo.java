package service.menu.cadastroVeiculo;

import DAO.VeiculoDAO;
import model.veiculo.Veiculo;
import service.menu.TextInput;

public class MenuCadastraVeiculo {
	static FactoryVeiculo factoryVeiculo = new FactoryVeiculo();
	static int cadastrando = 1;

	// CADASTRO VE�CULO
	public static void cadastroVeiculo() {

		while (cadastrando == 1) {
			// TIPO DE VE�CULO A SER CRIADO
			String tipoDeVeiculo = TextInput.textInput("SELECIONE O TIPO DE VE�CULO:" + " HATCH[1], " + "PICAPE[2],"
					+ " SEDAN[3], " + "SUV[4], " + "VAN[5]");

			Veiculo tipoDeVeiculoSelecionado = FactoryVeiculo.getVeiculo(tipoDeVeiculo);

			// VERIFICA VE�CULO DISPON�VEL
			if (VerificaVeiculoDisponivel.verificaVeiculoDisponivel(tipoDeVeiculoSelecionado))
				VeiculoDAO.adicionaVeiculo(tipoDeVeiculoSelecionado);

			String continuarCadastrandoVeiculo = TextInput
					.textInput("CONTINUAR CADASTRANDO VE�CULO ? SIM [1] / N�O [2]\n");
			if (continuarCadastrandoVeiculo.equalsIgnoreCase("1")) {

			} else if (continuarCadastrandoVeiculo.equalsIgnoreCase("2")) {
				System.out.println("CADASTRO DE VE�CULO FINALIZADO COM SUCESSO !\n");
				cadastrando = 2;
			}
		}
	}
}
