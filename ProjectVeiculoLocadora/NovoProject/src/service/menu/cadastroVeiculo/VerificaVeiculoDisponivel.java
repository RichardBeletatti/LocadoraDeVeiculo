package service.menu.cadastroVeiculo;

import DAO.VeiculoDAO;
import model.veiculo.Veiculo;

public class VerificaVeiculoDisponivel {

	public static boolean verificaVeiculoDisponivel(Veiculo veiculo) {
		if (VeiculoDAO.getVeiculoMap().containsValue(veiculo))
			System.out.println("VE�CULO J� EXISTENTE !\n");
		return true;
	}
}
