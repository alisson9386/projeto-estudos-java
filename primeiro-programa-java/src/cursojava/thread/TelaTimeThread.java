package cursojava.thread;

import java.awt.Dimension;

import javax.swing.JDialog;

public class TelaTimeThread extends JDialog {
	

		public TelaTimeThread() {

			setTitle("Minha tela de time com Thread");			
			setSize(new Dimension(240, 240));
			setLocationRelativeTo(null);
			setResizable(false);
			
			
			setVisible(true); /*Torna a tela visivel para o usuario, e sempre sera o utimo comando do construtor de telas*/
			
		}

}
