package service.menu.pedido.conversoes;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

public class ConversoesDeStringParaDate {

	// MÉTODO CONVERSÃO STRING PARA DATE
	public static Date conversao(String data) throws ParseException {
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		Date dataFormatada = null;
		try {
			dataFormatada = formato.parse(data);
		} catch (java.text.ParseException e) {
			e.printStackTrace();
		}
		return dataFormatada;
	}
}
