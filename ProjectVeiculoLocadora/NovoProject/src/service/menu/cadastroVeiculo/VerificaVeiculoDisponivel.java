package service.menu.cadastroVeiculo;

import DAO.VeiculoDAO;
import model.veiculo.Veiculo;

public class VerificaVeiculoDisponivel {

	public static boolean verificaVeiculoDisponivel(Veiculo veiculo) {
		if (VeiculoDAO.getVeiculoMap().containsValue(veiculo))
			System.out.println("VEÍCULO JÁ EXISTENTE !\n");
		return true;
	}
}
