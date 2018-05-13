package CenaFilosofos;


public class TenedorC {
	private int id;
	private boolean tenedorlibre=true;

public TenedorC(int id) {
	this.id = id;
}
public synchronized void cogeTenedor(int i)throws InterruptedException{
	 while(!tenedorlibre)
		wait();
	System.out.println("Filosofo "+ i +" coge tenedor" +id);
	tenedorlibre=false; 
}
public synchronized void sueltaTenedor(int i){
	tenedorlibre = true;
	System.out.println("Filosofo "+ i +" suelta tenedor"+id);
	notify();
}
}