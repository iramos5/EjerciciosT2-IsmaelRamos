package ejercicios;
import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		// Dada una hora por teclado, (horas, minutos y segundos) realiza un algoritmo que muestre la hora después de incrementarle un segundo

		//variables
		Scanner scan = new Scanner (System.in); //iniciar escaner
		int horas, minutos, segundos, segundos2, horaFinal; //variables
		
		//pedir datos
		System.out.println("Introduce las horas: "); //pedir horas
		horas = scan.nextInt(); //guardar horas
		System.out.println("Introduce los minutos: "); //pedir minutos
		minutos = scan.nextInt(); //guardar minutos
		System.out.println("Introduce los segundos: "); //pedir segundos
		segundos = scan.nextInt(); //guardar segundos
		
		// calcular hora
		horas = segundos / 3600; // los segundos entre 3600 nos dan la hora. 3600 viene de 60 * 60
		
		//mostrar resultado
		System.out.println(horas + " horas, " + minutos + " minutos y " );
	}

}
