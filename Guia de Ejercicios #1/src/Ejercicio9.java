import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int anio;

		System.out.println("Ingrese un a�o: ");
		anio = scan.nextInt();
		if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0)))
			System.out.println("El a�o es bisiesto");
		else
			System.out.println("El a�o no es bisiesto");
		scan.close();

	}

}
