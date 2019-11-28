package DAO;

import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import model.cliente.Cliente;

public class ClienteDAO {
	static String id = UUID.randomUUID().toString();
	private Connection connection;
	private static Map<String, Cliente> clienteMap = new HashMap<>();

	public static Map<String, Cliente> getClienteMap() {
		return clienteMap;
	}

	public ClienteDAO() {
		this.connection = new ConnectionFactory().getConnection();
	}

	public static void adicionaCliente(Cliente cliente) {
		String sql = "INSERT INTO CONTATO " + "NOME, TELEFONE, ENDEREÇO";
		try {
			clienteMap.put(id, cliente);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
