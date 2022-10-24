package ejercicios;
import java.util.Scanner;

/*pruebas
 * distancia = 200, estancia = 2 --> El billete de tren le costaría 500.0€
 * distancia = 800, estancia = 7 --> El billete de tren le costaría 2000.0€
 * distancia = 801, estancia = 8 --> El billete de tren le costaría 1401.75€
 */

public class Ejercicio08 {

	public static void main(String[] args) {
		/* Determinar el precio de un billete de tren, conociendo la distancia a recorrer, 
		 * y sabiendo que si el número de días de estancia es superior a 7 y la distancia superior 
		 * a 800 km el billete tiene una reducción del 30%. El precio por kilómetro es de 2,5€. 
		 * La distancia a recorrer y el número de días de estancia los debes solicitar al usuario por teclado.
		 */
		
		//variables
		Scanner scan = new Scanner (System.in); //iniciar escaner
		double precioKm=2.5, distancia, precioBillete, descuento, precioDescuento; //variables
		int estancia; //variable
		
		//solicitar datos
		System.out.println("Introduce la distancia a recorrer: "); //pedir distancia
		distancia = scan.nextDouble(); //guardar distancia
		System.out.println("Introduce el número de días de estancia: "); //pedir dias estancia
		estancia = scan.nextInt(); //guardar estancia
		
		//calcular precio billete
		if (estancia > 7 && distancia > 800) { //si la estancia es mayor a 7 dias y la distancia mas de 800 km
			precioBillete = precioKm*distancia; // cálculo de precio billete sin descuento
			descuento = (precioBillete * 30)/100; // descuento que se aplica
			precioDescuento = precioBillete - descuento; // precio final con descuento
			System.out.println("El billete de tren le costaría " +precioDescuento+"€"); //respuesta al usuario
		}
		else {
			precioBillete = precioKm*distancia; // cálculo de precio billete sin descuento
			System.out.println("El billete de tren le costaría " +precioBillete+"€"); //respuesta al usuario
		}

		scan.close(); //cierre escaner

	}

}
