package CenaFilosofos;

public class Principal {
	public static void main(String[] args) {
		Sillas s = new Sillas();
		TenedorC[] tenedores = new TenedorC[5];
		for(int i= 1;i<tenedores.length;i++) {
			tenedores[i]= new TenedorC(i);
		}
		
		Filosofo[] filosofos = new Filosofo[5];
		for(int i= 1;i<filosofos.length;i++) {
			filosofos[i]= new Filosofo(i,tenedores[i],tenedores[(i+1)%5],s);
		}
		
		for(int i= 1;i< filosofos.length;i++) {
			 filosofos[i].start(); 
		}
	}
}

