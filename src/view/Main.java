package view;

import javax.swing.JOptionPane;

import controller.RedesController;

public class Main {

	public static void main(String[] args) {
		int opcao = Integer.parseInt(JOptionPane.showInputDialog(
				"Menu\n1) Ver nome do adaptador Ethernet e IPv4\n2) Testar ping com 10 iterações\n3) Sair"));
		RedesController redesCon = new RedesController();
		switch (opcao) {
		case 1:
			String os = System.getProperty("os.name");
			redesCon.ip(os);
			break;
		case 2:
			os = System.getProperty("os.name");
			redesCon.ping(os);
		case 3:
			System.exit(0);
			break;
		}

	}
}
