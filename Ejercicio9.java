import java.util.*;
public class Ejercicio9{
	public static void main(String[] args) {
		int temp = 0;
		int contador = 0;
		int t1 = 0;
		int t2 = 0;
		int prom;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("Ingrese la temperatura 1");
			t1 = scan.nextInt();
			if (t1 >= 5 & t1 <=15) {
				temp = temp + t1;
				contador++;
			}
			System.out.println("Ingrese la temperatura 2");
			t2 = scan.nextInt();
			if (t2 >= 5 & t2 <= 15) {
				temp = temp + t2;
				contador++;
			}
		} while (t1 != 0);
		prom = temp/contador;
		System.out.println("El promedio de las temperaturas entre 5° y 15° es de " + prom);
	}
}