package ejercicios;
import java.util.Scanner;

/*pruebas
 * horas = 2, minutos = 2, segundos = 2 --> 2 horas, 2 minutos y 3 segundos
 * horas = 2, minutos = 80, segundos = 2 --> 3 horas, 21 minutos y 3 segundos
 * horas = 2, minutos = 20, segundos = 80 --> 3 horas, 21 minutos y 3 segundos
 */

public class Ejercicio07 {

	public static void main(String[] args) {
		// Dada una hora por teclado, (horas, minutos y segundos) realiza un algoritmo que muestre la hora después de incrementarle un segundo

		//variables
		Scanner scan = new Scanner (System.in); //iniciar escaner
		int horas, minutos, segundos, horaFinal; //variables
		
		//pedir datos
		System.out.println("Introduce las horas: "); //pedir horas
		horas = scan.nextInt(); //guardar horas
		System.out.println("Introduce los minutos: "); //pedir minutos
		minutos = scan.nextInt(); //guardar minutos
		System.out.println("Introduce los segundos: "); //pedir segundos
		segundos = scan.nextInt(); //guardar segundos
		
		// sumar 1 segundo
		
		segundos = segundos + 1;
		
		if (segundos > 59) {
			minutos++;
			
			if(minutos>59) {
				horas++;
				minutos = minutos - 59;
			}
			else {
				System.out.println(horas+" horas, "+minutos+" minutos y "+segundos+" segundos");
			}
		}
		else if (minutos > 59) { //////////////////////////////////////////////////////////////////////////////////////////////
			horas++;
			minutos = minutos - 59;
			System.out.println(horas+" horas, "+minutos+" minutos y "+segundos+" segundos");
			
		}
		else {
			System.out.println(horas+" horas, "+minutos+" minutos y "+segundos+" segundos"); ////////////////////////////////////////////////
		}
		
		
	}

}
