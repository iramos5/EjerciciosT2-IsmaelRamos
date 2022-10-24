package ejercicios;
import java.util.Scanner;

/*pruebas
 * numDni = 29617303 --> 29617303L
 * numDni = 12345678 --> 12345678Z
 */


public class Ejercicio02 {

	public static void main(String[] args) {
		/* El DNI consta de un entero de 8 dígitos seguido de una letra que se obtiene a partir del número de la siguiente forma:
		 * letra = número DNI módulo 23
		 */

		//variables
		Scanner scan = new Scanner (System.in); //inicio del escáner
		int numDni, modulo; //variables - numDni --> numero del DNI sin la letra - modulo --> casilla que corresponde a la letra
		
		//introducir DNI
		System.out.println("Introduce los 8 digitos de tu DNI"); //pedir DNI
		numDni = scan.nextInt(); //guardar numero del dni
		
		//calcular modulo
		modulo = numDni%23; // para averiguar el modulo dividimos el numero del DNI entre 23 y el resto que nos da es el modulo basicamente
		
		//letra correspondiente
		switch (modulo) { // con un switch tenemos los 22 casos teniendo en cuenta el numero del resto que hemos obtenido para el modulo
			case 0:
				System.out.println(numDni+"T");
				break;
			case 1:
				System.out.println(numDni+"R");
				break;
			case 2:
				System.out.println(numDni+"W");
				break;
			case 3:
				System.out.println(numDni+"A");
				break;
			case 4:
				System.out.println(numDni+"G");
				break;
			case 5:
				System.out.println(numDni+"M");
				break;
			case 6:
				System.out.println(numDni+"Y");
				break;
			case 7:
				System.out.println(numDni+"F");
				break;
			case 8:
				System.out.println(numDni+"P");
				break;
			case 9:
				System.out.println(numDni+"D");
				break;
			case 10:
				System.out.println(numDni+"X");
				break;
			case 11:
				System.out.println(numDni+"B");
				break;
			case 12:
				System.out.println(numDni+"N");
				break;
			case 13:
				System.out.println(numDni+"J");
				break;
			case 14:
				System.out.println(numDni+"Z");
				break;
			case 15:
				System.out.println(numDni+"S");
				break;
			case 16:
				System.out.println(numDni+"Q");
				break;
			case 17:
				System.out.println(numDni+"V");
				break;
			case 18:
				System.out.println(numDni+"H");
				break;
			case 19:
				System.out.println(numDni+"L");
				break;
			case 20:
				System.out.println(numDni+"C");
				break;
			case 21:
				System.out.println(numDni+"K");
				break;
			case 22:
				System.out.println(numDni+"E");
				break;
		}
		
		
		scan.close(); // cierre escaner

	}

}
