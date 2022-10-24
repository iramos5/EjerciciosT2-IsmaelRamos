package ejercicios;
import java.util.Scanner;

/*pruebas
 * horas = 2, minutos = 5, segundos = 80 --> Tenemos 2 horas, 6 minutos y 22 segundos
 * horas = 2, minutos = 80, segundos = 20 --> Tenemos 2 horas, 80 minutos y 21 segundos
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
		
		segundos = segundos + 1; //sumamos un segundo
		
		if (segundos>59) { //si los segundos superan 59
			minutos = segundos/60 + minutos; //calculamos minutos
			segundos = segundos-59; //calculamos segundos que quedan
			System.out.println("Tenemos "+horas+" horas, "+minutos+" minutos y "+segundos+" segundos"); //respuesta
		}
		
		else if (minutos > 59) { //sino si los minutos superan 59
			horas = minutos/60 + horas; //calculamos horas
			minutos = minutos - 59; //calculamos minutos que quedan
			System.out.println("Tenemos "+horas+" horas, "+minutos+" minutos y "+segundos+" segundos"); //respuesta
			
		}
		else { //sino
			System.out.println(horas+" horas, "+minutos+" minutos y "+segundos+" segundos"); //respuesta si ni minutos ni segundos superan 59
			
		}
		
		
		scan.close(); // cierre escaner  
	}

}
