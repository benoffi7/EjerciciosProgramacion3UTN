package paquete;

import java.util.Scanner;

public class Main {

	public static boolean revisarSiA�oBisiesto (int anio)
	{
		boolean control=false;
		if (anio % 4 == 0)
			control = true;
		return control;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Ingrese el a�o que quiere saber si es bisiesto o no: ");
		int anio = scan.nextInt();
		System.out.println("");
		if (revisarSiA�oBisiesto(anio))
			System.out.println("El a�o " + anio + " es bisiesto." );
		else
			System.out.println("El a�o " + anio + " no es bisiesto." );
		scan.close();
	}

}
