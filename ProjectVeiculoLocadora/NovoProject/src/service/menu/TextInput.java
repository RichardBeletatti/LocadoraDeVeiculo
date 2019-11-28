package service.menu;

import java.util.Scanner;

public class TextInput {
	// MÉTODO IMPLEMENTAÇÃO DE TEXTO
	public static String textInput(String string) {
		System.out.println(string);
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		return input.nextLine();
	}
}
