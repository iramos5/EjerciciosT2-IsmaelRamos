package ejercicios;
import java.util.Scanner;

/*pruebas
 * ¿Cuánto es 85+87? --> 5 --> El resultado es incorrecto
 * ¿Cuánto es 56+71? --> 127 --> El resultado es correcto !!
 */

public class Ejercicio06 {

	public static void main(String[] args) {
		/* Realiza el “juego de la suma”, que consiste en que aparezcan dos números aleatorios (comprendidos entre 1 y 99) 
		 * que el usuario tiene que sumar. La aplicación debe indicar si el resultado de la operación es correcto o incorrecto. 
		 * Para calcular números aleatorios debes usar la función Math.random(), que devuelve un número aleatorio comprendido entre 0 y 1.
		 */

		//variables
		Scanner scan = new Scanner (System.in); //inicio del escaner
		int num1, num2, sumaUsu, sumaReal; //variables
		
		//números aleatorios
		num1 = (int) (Math.random() * (100 - 1)+1); //numero aleatorio 1
		num2 = (int) (Math.random() * (100 - 1)+1); //numero aleatorio 2
		
		//pregunta al usuario
		System.out.println("¿Cuánto es " + num1 + "+" + num2 + "?"); //preguntar suma al usuario
		sumaUsu = scan.nextInt(); //guardar suma del usuario
		
		
		//comprobar respuesta del usuario
		sumaReal = num1+num2; //suma real de los numeros aleatorios
		if(sumaReal == sumaUsu) { // si la suma real y la suma del usuario son iguales
			System.out.println("El resultado es correcto !!"); // es correcto
		}
		else { //sino
			System.out.println("El resultado es incorrecto"); // es incorrecto
		}

		// cierre escáner
		scan.close();
		
	}

}
