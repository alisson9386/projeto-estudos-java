package cursojava.thread;

import javax.swing.JOptionPane;

public class AulaThread {

	public static void main(String[] args) throws InterruptedException {

		/* Envio de email */
		Thread threadEmail = new Thread(thread1);
		threadEmail.start();

		/* Envio de nota fiscal */
		Thread threadNf = new Thread(thread2);
		threadNf.start();

		JOptionPane.showMessageDialog(null, "Envios de notas fiscais realizado");

		String nome = JOptionPane.showInputDialog("Digite o seu nome");

		JOptionPane.showMessageDialog(null, "Seu nome é " + nome);

	}

	private static Runnable thread1 = new Runnable() {

		public void run() {

			/* Código da rotina que quero executar em paralelo */
			for (int i = 0; i < 10; i++) {

				/*
				 * Quero executar esse envio com um tempo de parada, ou com um tempo determinado
				 */

				System.out.println("Executando envio de e-mail ao destinatario " + (i + 1));

				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			/* Fim do codigo em paralelo */

		}
	};

	private static Runnable thread2 = new Runnable() {

		public void run() {

			/* Código da rotina que quero executar em paralelo */
			for (int i = 0; i < 10; i++) {

				/*
				 * Quero executar esse envio com um tempo de parada, ou com um tempo determinado
				 */

				System.out.println("Executando envio de nota fiscal ao destinatario " + (i + 1));

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			/* Fim do codigo em paralelo */

		}
	};

}
