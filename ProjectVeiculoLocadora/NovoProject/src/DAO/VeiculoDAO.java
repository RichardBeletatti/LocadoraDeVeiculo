package DAO;

import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import model.veiculo.Veiculo;

public class VeiculoDAO {

	static UUID id = UUID.randomUUID();
	private Connection connection;
	private static Map<String, Veiculo> veiculoMap = new HashMap<>();

	public static Map<String, Veiculo> getVeiculoMap() {
		return veiculoMap;
	}

	public void setVeiculoMap(Map<String, Veiculo> veiculoMap) {
		this.veiculoMap = veiculoMap;
	}

	public VeiculoDAO() {
		this.connection = new ConnectionFactory().getConnection();
	}

	public static void adicionaVeiculo(Veiculo veiculo) {
		String sql = "INSERT INTO VEICULO :" + "MODELO, ANO, PLACA";
		try {
			getVeiculoMap().put(String.valueOf(id), veiculo);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
