package service.menu.pedido.conversoes;

public class ConversaoDeStringParaDouble {

	// CONVERSÃO DE STRING PARA DOUBLE
	public static double conversao(String valorDaDiaria) {
		double valorConvertido = Double.parseDouble(valorDaDiaria);
		return valorConvertido;
	}
}
