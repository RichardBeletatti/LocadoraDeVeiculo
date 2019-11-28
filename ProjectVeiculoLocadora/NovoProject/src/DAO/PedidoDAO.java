package DAO;

import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class PedidoDAO {

	private Connection connection;
	static private Map<String, PedidoDAO> PedidoMap = new HashMap<>();
	static String id = UUID.randomUUID().toString();

	public static Map<String, PedidoDAO> getPedidoMap() {
		return PedidoMap;
	}

	public void setPedidoMap(Map<String, PedidoDAO> pedidoMap) {
		PedidoMap = pedidoMap;
	}

	public PedidoDAO() {
		this.connection = new ConnectionFactory().getConnection();
	}

	public void adicionaPedido(PedidoDAO pedido) {
		String sql = "INSERT INTO PEDIDO: ";
		try {
			getPedidoMap().put(id, pedido);
			System.out.println("PEDIDO ALTERADO COM SUCESSO !!!\n");
		} catch (Exception e) {
			throw new RuntimeException();
		}
	}
}
