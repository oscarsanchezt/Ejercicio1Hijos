
public class EjercicioHilos extends Thread {
	int numero;

	public EjercicioHilos(int numero) {
		this.numero = numero;
	}

	@Override
	public void run() {
		if (numero % 2 == 0) {
			System.out.println("El " + numero + " es Primo");
		} else {
			System.out.println("El " + numero + " No es Primo");
		}
	}
}
