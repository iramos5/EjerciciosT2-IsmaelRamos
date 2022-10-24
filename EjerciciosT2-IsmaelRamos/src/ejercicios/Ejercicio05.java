package ejercicios;
import java.util.Scanner;

/*pruebas
 * numero: 5 --> El valor absoluto de 5 es: 5
 * numero: -5 --> El valor absoluto de -5 es: 5
 */

public class Ejercicio05 {

	public static void main(String[] args) {
		// Utiliza un operador ternario para calcular el valor absoluto de un número que se solicita al usuario por teclado.

		//variables
		Scanner scan = new Scanner (System.in); //inicio del escaner
		int num, vAbs; //num: numero que se solicita al usuario por teclado y vAbs: valor absoluto
		
		//pedir numero
		System.out.println("Introduce un numero: "); //pedir numero
		num = scan.nextInt(); //guardar numero
		
		//calcular valor absoluto
		vAbs = num > 0 ? num : -num; // el valor absoluto del numero
		
		//mostrar respuesta
		System.out.println("El valor absoluto de " +num+ " es: "+vAbs); //mostrar solucion
		
		scan.close(); //cierre escaner
	}
	
	
	

}
