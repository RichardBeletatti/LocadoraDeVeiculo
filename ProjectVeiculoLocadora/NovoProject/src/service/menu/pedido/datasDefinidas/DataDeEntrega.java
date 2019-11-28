package service.menu.pedido.datasDefinidas;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

import model.Eventos;
import service.menu.TextInput;
import service.menu.pedido.conversoes.ConversoesDeStringParaDate;

public class DataDeEntrega {

	// DEFININDO DATA DE ENTREGA
	public static String definindoDataEntrega() throws ParseException {
		String definindoDataEntrega = TextInput.textInput("DATA DE ENTREGA: ");
		ConversoesDeStringParaDate.conversao(definindoDataEntrega);

		Eventos.ENTREGA.toString("DATA DE DEVOLUÇÃO: " + definindoDataEntrega);

		return definindoDataEntrega;
	}
}
