package Ejercicios;

public class Ejercicio21 {

	public static void menuDiaLaboral(String dia) {
		switch (dia) {

		case "lunes":
			System.out.println("D�a laboral");
			break;
		case "martes":
			System.out.println("D�a laboral");
			break;
		case "miercoles":
			System.out.println("D�a laboral");
			break;
		case "jueves":
			System.out.println("D�a laboral");
			break;
		case "viernes":
			System.out.println("D�a laboral");
			break;
		case "sabado":
			System.out.println("D�a no laboral");
			break;
		case "domingo":
			System.out.println("D�a no laboral");
			break;
		default:
			System.out.println("D�a no v�lido");
			break;
		}
	}
}
