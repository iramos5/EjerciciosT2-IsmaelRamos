package ejercicios;
import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		/* En una granja se compra diariamente una cantidad de comida para los animales. 
		 * Los animales son todos de la misma especie y sabemos que cada animal come los mismos kilos de comida de media diariamente. 
		 * Diseña un programa que solicite al usuario los valores anteriores (cantidad de comida comprada, número de animales y kilos 
		 * de comida que comen todos los animales en total), y determine si disponemos de alimento suficiente para cada animal. 
		 * En caso negativo, ha de calcular cuál es la ración que corresponde a cada uno de los animales. 
		 * Nota: Evita que la aplicación realice divisiones por cero.
		 */
		
		//variables
		Scanner scan = new Scanner (System.in); //inicio del escáner
		int cantComida, numAnimales, kilosTotal, comidaDisponible;
		
		//pedir datos
		System.out.println("Introduce la cantidad de comida comprada: ");
		cantComida = scan.nextInt();
		System.out.println("Introduce el número de animales: ");
		numAnimales = scan.nextInt();
		System.out.println("Introduce los kilos que comen los animales en total: ");
		kilosTotal = scan.nextInt();
		
		//disponemos de comida?
		comidaDisponible= cantComida / numAnimales;
		kilosTotal = numAnimales;
		
		if (comidaDisponible >= kilosTotal) {
			
		}
		
		
		
		
	}

}
