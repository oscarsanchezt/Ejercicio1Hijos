import java.time.Instant;

public class EjercicioHilos extends Thread {
	int numero;

	public EjercicioHilos(int numero) {
		this.numero = numero;
	}

	public void run() {
		// Tiempo de inicio
		Instant start = Instant.now(); 

		if (esPrimo(numero)) {
			System.out.println("El " + numero + " es Primo");
		} else {
			System.out.println("El " + numero + " No es Primo");
		}
		
		// Tiempo de finalización
		Instant end = Instant.now(); 
		long millis = end.toEpochMilli() - start.toEpochMilli();

		System.out.println("Milisegundos: " + millis);
	}

	private boolean esPrimo(int num) {
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i * i <= num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
