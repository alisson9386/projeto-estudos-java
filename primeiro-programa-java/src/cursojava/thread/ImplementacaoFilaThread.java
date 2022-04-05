package cursojava.thread;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ImplementacaoFilaThread extends Thread {
	
	private static ConcurrentLinkedQueue<ObjetoFilaThread> pilha_fila = new ConcurrentLinkedQueue<ObjetoFilaThread>();
	
	public static void add(ObjetoFilaThread objetoFilaThread) {
		pilha_fila.add(objetoFilaThread);
	}
	
	@Override
	public void run() {
		
		System.out.println("Fila rodando");
		
		
		while (true) {
		
		@SuppressWarnings("rawtypes")
		Iterator iteracao = pilha_fila.iterator();
		
		synchronized (pilha_fila) { /*Bloqueia o acesso a essa lista por outros processos*/
			
			while(iteracao.hasNext()) { /*Irá processar enquanto conter dados*/
				
				ObjetoFilaThread processar = (ObjetoFilaThread) iteracao.next();
				
				/*Coloca os processos*/
				System.out.println("------------------------------");
				
				System.out.println(processar.getEmail());
				System.out.println(processar.getNome());
				
				iteracao.remove();
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}			
		}
		
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
		}

}
