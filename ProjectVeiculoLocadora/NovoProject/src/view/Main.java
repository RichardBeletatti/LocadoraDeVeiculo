package view;

import service.menu.menu.MenuFactory;

public class Main {

	public static void main(String[] args) throws Exception {

		System.out.println("\n==================== BEM VINDO A LOCADORA DE CARROS ! ====================\n");
		MenuFactory menu = new MenuFactory();

		menu.getMenu();
	}
}