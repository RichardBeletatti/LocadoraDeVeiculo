package service.menu.cadastroVeiculo;

import java.util.Map;

import model.veiculo.Hatch;
import model.veiculo.Picape;
import model.veiculo.Sedan;
import model.veiculo.Suv;
import model.veiculo.TipoCombustivel;
import model.veiculo.Van;
import model.veiculo.Veiculo;
import service.menu.TextInput;

public class FactoryVeiculo {

	static Map<String, Runnable> veiculoSelecionadoMap;

	public static Veiculo getVeiculo(String tipo) {
		if (tipo.equalsIgnoreCase("1")) {
			return new Hatch(TextInput.textInput("MODELO: "), TextInput.textInput("ANO: "),
					TextInput.textInput("PLACA: "), TipoCombustivel.valueOf(TextInput.textInput("COMBUSTÍVEL: ")));
		} else if (tipo.equalsIgnoreCase("2")) {
			return new Picape(TextInput.textInput("MODELO: "), TextInput.textInput("ANO: "),
					TextInput.textInput("PLACA: "), TipoCombustivel.valueOf(TextInput.textInput("COMBUSTÍVEL: ")));
		} else if (tipo.equalsIgnoreCase("3")) {
			return new Sedan(TextInput.textInput("MODELO: "), TextInput.textInput("ANO: "),
					TextInput.textInput("PLACA: "), TipoCombustivel.valueOf(TextInput.textInput("COMBUSTÍVEL: ")));
		} else if (tipo.equalsIgnoreCase("4")) {
			return new Suv(TextInput.textInput("MODELO: "), TextInput.textInput("ANO: "),
					TextInput.textInput("PLACA: "), TipoCombustivel.valueOf(TextInput.textInput("COMBUSTÍVEL: ")));
		} else if (tipo.equalsIgnoreCase("5")) {
			return new Van(TextInput.textInput("MODELO: "), TextInput.textInput("ANO: "),
					TextInput.textInput("PLACA: "), TipoCombustivel.valueOf(TextInput.textInput("COMBUSTÍVEL: ")));
		} else
			System.out.println("ARGUMENTO INSERIDO É INVÁLIDO.\n");
		return null;
	}
}
