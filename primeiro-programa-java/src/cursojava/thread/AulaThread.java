package cursojava.thread;

import javax.swing.JOptionPane;

public class AulaThread {
	
	public static void main(String[] args) throws InterruptedException {
		
		/*Envio de email*/
		new Thread() {
			
				public void run() {
					
					/*Código da rotina que quero executar em paralelo*/
					for(int i = 0; i <10; i++ ) {
						

						/*Quero executar esse envio com um tempo de parada, ou com um tempo determinado*/
						
						System.out.println("Executando envio de e-mail ao destinatario " + (i+1));
						
						 try {
							Thread.sleep(4000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					/*Fim do codigo em paralelo*/
					
				}
			
			
		}.start(); /*Liga a Thread*/
		
		
		
		/*DIVISAO DE THREADS*/
		
		/*Envio de nota fiscal*/
		new Thread() {
			
				public void run() {
					
					/*Código da rotina que quero executar em paralelo*/
					for(int i = 0; i <10; i++ ) {
						

						/*Quero executar esse envio com um tempo de parada, ou com um tempo determinado*/
						
						System.out.println("Executando envio de nota fiscal ao destinatario " + (i+1));
						
						 try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					/*Fim do codigo em paralelo*/
					
				}
			
			
		}.start(); /*Liga a Thread*/
		
		JOptionPane.showMessageDialog(null, "Envios de notas fiscais realizado");
		
		String nome = JOptionPane.showInputDialog("Digite o seu nome");
		
		JOptionPane.showMessageDialog(null, "Seu nome é " + nome);
		
		
	}

}
