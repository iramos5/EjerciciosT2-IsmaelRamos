package ejercicios;
import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		/* Escribe una aplicación que solicite al usuario un número comprendido entre 0 y 9999. 
		 * La aplicación tendrá que indicar si el número introducido es capicúa.
		 */

		//variables
		Scanner scan = new Scanner (System.in); //inicio del escáner
		int num;
		
		//introducir datos
		System.out.println("Introduce un número entre 0 y 9999: "); //pedir al usuario un número
		num = scan.nextInt(); //guardar el número
		
		//comprobar si el número es capicúa
		if (num>=0 && num<=9999) {
			if (num>=0 && num <=9) {
				
			}
			
		
			
		}
		else {
			System.out.println("El número no se encuentra entre 0 y 9999");
		}
		
		
	}

}
