package paquete;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Ingresar a�o");
		Scanner scan = new Scanner (System.in);
		int a�o = scan.nextInt();
		scan.close();
		
		int flag = comprobarBisiesto (a�o);
		if (flag==0) {
			System.out.println("El a�o " + a�o + " es bisiesto");
		}else {
			System.out.println("El a�o " + a�o + " no es bisiesto");
		}
	}
	
	public static int comprobarBisiesto (int a�o) {
		
		int res;
		res = a�o%4;
		
		return res;
	}

}
