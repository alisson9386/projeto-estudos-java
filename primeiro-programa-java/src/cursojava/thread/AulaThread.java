package cursojava.thread;

public class AulaThread {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		for(int i = 0; i <10; i++ ) {
			

			/*Quero executar esse envio com um tempo de parada, ou com um tempo determinado*/
			
			System.out.println("Executando envio de e-mail");
			
			 Thread.sleep(1000);
		}
		
		System.out.println("Fim do teste");
		
	}

}
