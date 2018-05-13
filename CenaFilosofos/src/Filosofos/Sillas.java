package Filosofos;

public class Sillas {
	private int sillaLibre=4;

	public synchronized void cogerSilla(int i)throws InterruptedException{
		while(sillaLibre==0)
			wait();
			System.out.println("Filosofo "+ i +" se sienta en su silla");
			sillaLibre--;
	}
	public synchronized void soltarSilla(int i){
		sillaLibre++;
		System.out.println("Filosofo "+ i +" esta satisfecho");
		notify();
	}
		
	}


