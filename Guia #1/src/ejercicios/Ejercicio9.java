package ejercicios;

import java.util.Scanner;

public class Ejercicio9{
	static Scanner scan;
	public static void a�oBiciesto(){
		
	scan = new Scanner(System.in);
	
	int a�o=0;
	char control;
	do
		{
	System.out.println("ingrese el a�o a verificar");
	a�o=scan.nextInt();
	if(a�o%4==0)
	{
		System.out.println("el a�o es biciesto ");
	}
	else
	{
		System.out.println("el a�o no es biciesto");
	}
	System.out.println("Desea ingresar otro a�o?");
	control = scan.next().charAt(0);
		}
while (control=='s');
}
	}
