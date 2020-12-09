package fp.daw.examen1ev;

import java.time.LocalDate;

public class Ejercicio2 {

	public static void main(String[] args) {

		LocalDate date = LocalDate.now();
		int year = date.getYear();	
		esBisiesto(year);
	}
	
	public static void esBisiesto (int year) {
		
		while (year % 4 == 0) {
			while (year % 100 != 0) {
				System.out.println("El año " + year + " es Bisiesto");
				break;
			}
			while (year % 400 == 0) {
				System.out.println("El año " + year + " es Bisiesto");
				break;
			}
			break;
		}
		while (year % 4 != 0) {
			System.out.println("El año " + year + " no es Bisiesto");
			break;
		}
	}

}
