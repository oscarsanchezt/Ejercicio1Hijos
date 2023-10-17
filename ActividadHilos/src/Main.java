import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero[] = new int[3];
        Date date = new Date();
		// for lectura
		for (int i = 0; i < 3; i++) {
			System.out.print((i + 1) + ") " + "Numero: ");
			numero[i] = sc.nextInt();
		}
		// Creamos 3 hilos
		for (int i = 0; i < 3; i++) {
			EjercicioHilos hilos = new EjercicioHilos(numero[i]);
			hilos.start();
		}
        System.out.println("Milisegundos: " + date.getTime());
		sc.close();
	}
}
