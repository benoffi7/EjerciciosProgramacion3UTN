package Ejercicios;

import java.util.Scanner;


public class Ejercicio23 {
	public static Scanner scan;

	public static void menuCalculadora (String opcion) {
		scan = new Scanner(System.in);
		switch (opcion) {
		
		case "+":
			int num1Suma=0, num2Suma=0, rtaSuma=0;
			System.out.println("Ingrese los n�meros que desea sumar: ");
			System.out.println("Primer n�mero: ");
			num1Suma=scan.nextInt();
			System.out.println("Segundo n�mero: ");
			num2Suma=scan.nextInt();
			rtaSuma=num1Suma+num2Suma;
			System.out.println(num1Suma + " + " + num2Suma + " = " + rtaSuma);
			break;
			
		case "-":
			int num1Resta=0, num2Resta=0, rtaResta=0;
			System.out.println("Ingrese los n�meros que desea restar: ");
			System.out.println("Primer n�mero: ");
			num1Resta=scan.nextInt();
			System.out.println("Segundo n�mero: ");
			num2Resta=scan.nextInt();
			rtaResta=num1Resta-num2Resta;
			System.out.println(num1Resta + " - " + num2Resta + " = " + rtaResta);
			break;
			
		case "*":
			int num1Multiplicacion=0, num2Multiplicacion=0, rtaMultiplicacion=0;
			System.out.println("Ingrese los n�meros que desea multiplicar: ");
			System.out.println("Primer n�mero: ");
			num1Multiplicacion=scan.nextInt();
			System.out.println("Segundo n�mero: ");
			num2Multiplicacion=scan.nextInt();
			rtaMultiplicacion=num1Multiplicacion*num2Multiplicacion;
			System.out.println(num1Multiplicacion + " * " + num2Multiplicacion + " = " + rtaMultiplicacion);
			break;
			
		case "/":
			float num1Division=0, num2Division=0, rtaDivision=0; 
			System.out.println("Ingrese los n�meros que desea dividir: ");
			System.out.println("Primer n�mero: ");
			num1Division=scan.nextInt();
			System.out.println("Segundo n�mero: ");
			num2Division=scan.nextInt();
			rtaDivision=(float) (num1Division/num2Division);
			System.out.println(num1Division + " / " + num2Division + " = " + rtaDivision);
			break;
			
		case "^":
			int num1Potencia=0, num2Potencia=0, rtaPotencia=0;
			System.out.println("Ingrese el n�mero que desea utilizar como base: ");
			num1Potencia=scan.nextInt();
			System.out.println("Ingrese el n�mero que desea utilizar como exponente: ");
			num2Potencia=scan.nextInt();
			rtaPotencia= (int) Math.pow(num1Potencia, num2Potencia);
			System.out.println(num1Potencia + " ^ " + num2Potencia + " = " + rtaPotencia);
			break;
			
		case "%":
			int num1Mod=0, num2Mod=0, rtaMod=0;
			System.out.println("Ingrese los n�meros de los cuales desea saber el resto de la divisi�n entre los mismos: ");
			System.out.println("Primer n�mero: ");
			num1Mod=scan.nextInt();
			System.out.println("Segundo n�mero: ");
			num2Mod=scan.nextInt();
			rtaMod=num1Mod%num2Mod;
			System.out.println(num1Mod + " % " + num2Mod + " = " + rtaMod);
			break;
			
		default:
			System.out.println("Opci�n inv�lida.");
			System.out.println("Ingrese una opci�n nuevamente: ");
			opcion=scan.next();
			Ejercicio23.menuCalculadora(opcion);
			break;
		
		}
	}
}
