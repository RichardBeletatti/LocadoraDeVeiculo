package inputs;

import java.util.Scanner;

public class StringInput {

	// M�TODO IMPLEMENTA��O DE TEXTO
	public static String textInput(String string) {
		System.out.println(string);
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		return input.nextLine();
	}
}
