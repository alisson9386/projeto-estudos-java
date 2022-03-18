package cursojava.thread;

import java.awt.Dimension;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.plaf.DimensionUIResource;

import java.awt.*;

public class TelaTimeThread extends JDialog {
	
	private JPanel jPanel = new JPanel(new GridBagLayout());
	
	private JLabel descricaoHora = new JLabel("Time da Thread 1");
	
	private JTextField mostraTempo = new JTextField();
	
	
private JLabel descricaoHora2 = new JLabel("Time da Thread 2");
	
	private JTextField mostraTempo2 = new JTextField();
	

		public TelaTimeThread() {

			setTitle("Minha tela de time com Thread");			
			setSize(new Dimension(240, 240));
			setLocationRelativeTo(null);
			setResizable(false);
			
			GridBagConstraints gridBagConstraints = new GridBagConstraints();
			gridBagConstraints.gridx = 0;
			gridBagConstraints.gridy = 0;
			
			descricaoHora.setPreferredSize(new DimensionUIResource(200, 25));
			jPanel.add(descricaoHora, gridBagConstraints);
			
			mostraTempo.setPreferredSize(new DimensionUIResource(200, 25));
			gridBagConstraints.gridy = 1;
			jPanel.add(mostraTempo, gridBagConstraints);
			
			gridBagConstraints.gridy = 3;
			descricaoHora2.setPreferredSize(new DimensionUIResource(200, 25));
			jPanel.add(descricaoHora2, gridBagConstraints);
			
			mostraTempo2.setPreferredSize(new DimensionUIResource(200, 25));
			gridBagConstraints.gridy = 4;
			jPanel.add(mostraTempo2, gridBagConstraints);
			
			add(jPanel, BorderLayout.WEST);
			setVisible(true); /*Torna a tela visivel para o usuario, e sempre sera o utimo comando do construtor de telas*/
			
		}

}
