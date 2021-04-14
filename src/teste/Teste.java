package teste;
import javax.swing.SwingUtilities;

import controller.Controller;
import view.Botoes;

public class Teste {
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				createAndShowGUI();
			}
		});
	}
	
	
	public static void createAndShowGUI() {
		new Controller();
	}

}
