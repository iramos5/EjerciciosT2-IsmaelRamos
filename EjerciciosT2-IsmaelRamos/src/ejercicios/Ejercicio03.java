package ejercicios;
import java.util.Scanner;

/*pruebas
 * comidaComprada = 10, numAnimales = 5, kilosTotal = 50 --> No disponemos de comida para todos los animales. De los 10kg de comida que hemos comprado, le corresponden 2kg a cada animal
 * comidaComprada = 10, numAnimales = 0, kilosTotal = 50 --> No puede haber 0 animales
 * comidaComprada = 10, numAnimales = 5, kilosTotal = 10 --> Disponemos de comida suficiente para los animales
 */


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
		int comidaComprada, numAnimales, kilosTotal, racion; /*variables. comidaComprada es la comida comprada, numAnimales el numero de animales, 
		kilosTotal los kilos que comen en total los animales y racion lo que le corresponderia a cada animal si hubiera de menos
		*/
		
		//pedir datos
		System.out.println("Introduce la cantidad de comida comprada: "); //pedir comida comprada
		comidaComprada = scan.nextInt(); //guardar comida comprada
		System.out.println("Introduce el número de animales: "); //pedir numero de animales
		numAnimales = scan.nextInt(); //guardar numero de animales
		System.out.println("Introduce los kilos que comen los animales en total: "); //pedir kilos que comen en total
		kilosTotal = scan.nextInt(); //guardar kilos que comen en total
		
		//disponemos de comida?
		if(numAnimales==0) { //si hay cero animales
			System.out.println("No puede haber 0 animales"); //respuesta
		}
		
		else if (comidaComprada >= kilosTotal) { //sino si la comida comprada es mayor o igual a los kilos necesarios
			System.out.println("Disponemos de comida suficiente para los animales"); //respuesta
		}
		else if (comidaComprada < kilosTotal) { //sino si la comida comprada es menor a los kilos necesarios
			System.out.println("No disponemos de comida para todos los animales"); //respuesta
			racion = comidaComprada/numAnimales; // se calcula la racion correspondiente para cada animal 
			System.out.println("De los "+comidaComprada+"kg de comida que hemos comprado, le corresponden "+racion+"kg a cada animal");//respuesta
		}
		
		
		scan.close(); // cierre escaner
		
	}

}
