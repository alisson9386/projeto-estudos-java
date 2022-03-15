package cursojava.thread;

import javax.swing.JOptionPane;

public class AulaThread {
	
	public static void main(String[] args) throws InterruptedException {
		
		new Thread() {
			
				public void run() {
					
					/*Código da rotina que quero executar em paralelo*/
					for(int i = 0; i <10; i++ ) {
						

						/*Quero executar esse envio com um tempo de parada, ou com um tempo determinado*/
						
						System.out.println("Executando envio de e-mail ao destinatario " + (i+1));
						
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
		
		
		
		
		System.out.println("Envios de notas fiscais realizado");
		JOptionPane.showMessageDialog(null, "Sistema continua executando para o usuario");
		
	}

}
