package cursojava.thread;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.plaf.DimensionUIResource;
import javax.swing.plaf.InsetsUIResource;

import java.awt.*;

public class TelaTimeThread extends JDialog {
	
	private JPanel jPanel = new JPanel(new GridBagLayout());
	
	private JLabel descricaoHora = new JLabel("Time da Thread 1");
	
	private JTextField mostraTempo = new JTextField();
	
	private JLabel descricaoHora2 = new JLabel("Time da Thread 2");
	
	private JTextField mostraTempo2 = new JTextField();
	
	private JButton jButton = new JButton("Start");
	
	private JButton jButton2 = new JButton("Stop");
	

		public TelaTimeThread() {

			setTitle("Minha tela de time com Thread");			
			setSize(new Dimension(240, 240));
			setLocationRelativeTo(null);
			setResizable(false);
			
			GridBagConstraints gridBagConstraints = new GridBagConstraints();
			gridBagConstraints.gridx = 0;
			gridBagConstraints.gridy = 0;
			gridBagConstraints.gridwidth = 2;
			gridBagConstraints.insets = new InsetsUIResource(5, 10, 5, 5);
			gridBagConstraints.anchor = GridBagConstraints.WEST;
			
			descricaoHora.setPreferredSize(new DimensionUIResource(200, 25));
			jPanel.add(descricaoHora, gridBagConstraints);
			
			mostraTempo.setPreferredSize(new DimensionUIResource(200, 25));
			gridBagConstraints.gridy = 1;
			mostraTempo.setEditable(false);
			jPanel.add(mostraTempo, gridBagConstraints);
			
			gridBagConstraints.gridy = 3;
			descricaoHora2.setPreferredSize(new DimensionUIResource(200, 25));
			jPanel.add(descricaoHora2, gridBagConstraints);
			
			mostraTempo2.setPreferredSize(new DimensionUIResource(200, 25));
			gridBagConstraints.gridy = 4;
			mostraTempo2.setEditable(false);
			jPanel.add(mostraTempo2, gridBagConstraints);
			
			gridBagConstraints.gridwidth = 1;
			
			jButton.setPreferredSize(new DimensionUIResource(92, 25));
			gridBagConstraints.gridy++;
			jPanel.add(jButton, gridBagConstraints);
			
			jButton2.setPreferredSize(new DimensionUIResource(92, 25));
			gridBagConstraints.gridx++;
			jPanel.add(jButton2, gridBagConstraints);
			
			add(jPanel, BorderLayout.WEST);
			setVisible(true); /*Torna a tela visivel para o usuario, e sempre sera o utimo comando do construtor de telas*/
			
		}

}
