package service.menu.pedido.datasDefinidas;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

import model.Eventos;
import service.menu.TextInput;
import service.menu.pedido.conversoes.ConversaoDeStringParaDouble;

public class DataDeRetirada {

	// DEFININDO DATA DE RETIRDADA
	public static void definindoDataRetirada() throws ParseException {
		String definindoDataRetirada = TextInput.textInput("DATA RETIRADA: ");
		ConversaoDeStringParaDouble.conversao(definindoDataRetirada);

		Eventos.RETIRADA.toString("VEÍCULO RETIRADO NO DIA: " + definindoDataRetirada);
	}
}
