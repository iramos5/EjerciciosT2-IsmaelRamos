package ejercicios;
import java.util.Scanner;

/*pruebas
 * num = 5 --> El número es capicúa
 * num = 18 --> El número no es capicúa
 * num = 55 --> El número es capicúa
 * num = 112 --> El número no es capicúa
 * num = 121 --> El número es capicúa
 * num = 1234 --> El número no es capicúa
 * num = 1221 --> El número es capicúa
 * num = -1 --> El número no se encuentra entre 0 y 9999
 * num = 10000 --> El número no se encuentra entre 0 y 9999
 */

public class Ejercicio01 {

	public static void main(String[] args) {
		/* Escribe una aplicación que solicite al usuario un número comprendido entre 0 y 9999. 
		 * La aplicación tendrá que indicar si el número introducido es capicúa.
		 */

		//variables
		Scanner scan = new Scanner (System.in); //inicio del escáner
		int num, unidades, decenas, centenas, millar; //variables 
		/*num (numero introducido por el usuario)
		 * unidades (posicion de las unidades)
		 * decenas (posicion de las decenas)
		 * centenas (posicion de las centenas)
		 * millar (posicion de los millares)
		 */
		
		//introducir datos
		System.out.println("Introduce un número entre 0 y 9999: "); //pedir al usuario un número
		num = scan.nextInt(); //guardar el número
		
		//comprobar si el número es capicúa
		if (num>=0 && num<=9999) { // si el numero esta entre 0 y 9999
			
			if (num>=0 && num <=9) { // si esta entre 0 y 9
				System.out.println("El número es capicúa"); //respuesta
			}
			
			else if (num>=10 && num<=99) { //sino si el numero esta entre 10 y 99
				unidades = num%10; //posicion unidades
				decenas = num/10; //posicion decenas
				if(unidades == decenas) { // si las unidades y las decenas son iguales
					System.out.println("El número es capicúa"); //respuesta
				}
				else { //sino
					System.out.println("El número no es capicúa"); //respuesta
				}
			}
			
			else if (num>=100 && num<=999) { //sino si el numero esta entre 100 y 999
				unidades = num%10; //posicion unidades
				centenas = num/100; //posicion centenas
				if(unidades==centenas) { //si las unidades son iguales que las centenas
					System.out.println("El número es capicúa"); //respuesta
				}
				else { //sino
					System.out.println("El número no es capicúa"); //respuesta
				}
			}
			
			else if (num>=1000 && num<=9999) { //sino si el numero esta entre 1000 y 9999
				unidades = num%10; //posicion unidades
				decenas = (num/10)%10; //posicion decenas
				centenas = (num/100)%10; //posicion centenas
				millar = (num/1000)%10; //posicion millar
				if(unidades==millar && decenas==centenas) { //si las unidades y los millares son iguales Y las decenas y las centenas tambien
					System.out.println("El número es capicúa");//respuesta
				}
				else { //sino
					System.out.println("El número no es capicúa");//respuesta
				}
			}
			
		}
		else { //sino
			System.out.println("El número no se encuentra entre 0 y 9999"); //el numero introducido esta fuera del rango
		}
		
		
		scan.close(); // cierre escaner
		
		
	}

}
