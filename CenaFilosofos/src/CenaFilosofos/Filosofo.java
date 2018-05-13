package CenaFilosofos;

public class Filosofo extends Thread{
	private int id;
	private TenedorC left,rigth;
	private Sillas s;
	
	public Filosofo(int id,TenedorC left,TenedorC rigth, Sillas s) {
		this.id=id;
		this.left=left;
		this.rigth=rigth;
		this.s=s;
	}
	
	public void run() {
		while(true) {
			try {
				s.cogerSilla(id);
				rigth.cogeTenedor(id);
				left.cogeTenedor(id);
				System.out.println("Filosofo "+ id +" esta comiendoooo");
				
				left.sueltaTenedor(id);
				rigth.sueltaTenedor(id);
				s.soltarSilla(id);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
