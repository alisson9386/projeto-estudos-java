package cursojava.thread;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.plaf.DimensionUIResource;
import javax.swing.plaf.InsetsUIResource;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TelaTimeThread extends JDialog {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3919427130927404105L;

	private JPanel jPanel = new JPanel(new GridBagLayout());
	
	private JLabel descricaoHora = new JLabel("Nome");
	private JTextField mostraTempo = new JTextField();
	
	private JLabel descricaoHora2 = new JLabel("E-mail");
	private JTextField mostraTempo2 = new JTextField();
	
	private JButton jButton = new JButton("Add lista");
	private JButton jButton2 = new JButton("Stop");
	
	private ImplementacaoFilaThread fila = new ImplementacaoFilaThread();

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
			jPanel.add(mostraTempo, gridBagConstraints);
			
			gridBagConstraints.gridy = 3;
			descricaoHora2.setPreferredSize(new DimensionUIResource(200, 25));
			jPanel.add(descricaoHora2, gridBagConstraints);
			
			mostraTempo2.setPreferredSize(new DimensionUIResource(200, 25));
			gridBagConstraints.gridy = 4;
			jPanel.add(mostraTempo2, gridBagConstraints);
			
			gridBagConstraints.gridwidth = 1;
			
			jButton.setPreferredSize(new DimensionUIResource(92, 25));
			gridBagConstraints.gridy++;
			jPanel.add(jButton, gridBagConstraints);
			
			jButton2.setPreferredSize(new DimensionUIResource(92, 25));
			gridBagConstraints.gridx++;
			jPanel.add(jButton2, gridBagConstraints);
			
			jButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
					ObjetoFilaThread filaThread = new ObjetoFilaThread();
					
					filaThread.setNome(mostraTempo.getText());
					filaThread.setEmail(mostraTempo2.getText());
					
					fila.add(filaThread);
					
				}
			});
			
			jButton2.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
				}
				
			});
			
			
			fila.start();
			add(jPanel, BorderLayout.WEST);
			setVisible(true); /*Torna a tela visivel para o usuario, e sempre sera o utimo comando do construtor de telas*/
			
		}


}
