package paquete;
import java.util.Scanner;
import java.lang.Math;

public class MAIN {

	    private static Scanner scan;
		public static void main(String[] args) 
	    {
	    	char control='s';
	    	while(control=='s')
	    	{
	    	System.out.println("Trabajo Practico N�1 \n Ingrese numero de ejercicio: ");
	    	scan = new Scanner(System.in);
	    	int ejer = scan.nextInt();
	    	int n;
	    	boolean rta;
	    	
	    	switch(ejer)
	    	{
		    	case(1):
		    		//Ejercicio n�1: Calcular el promedio de un arreglo
		    		int[] arreglo = { 1, 2, 3, 5, 5 };
		    		float prom = promedioArrayInt(arreglo);
		    		System.out.println("Ejercicio 1: Promedio del total del arreglo :" +prom);
		    		break;
		    	
		    	case(2):
		    		//Ejercicio n�2: Calcular si un n�mero es par o no. 
		    		int num = 2;
		    		rta=numeroParOimpar(num);
		    		if(rta)
		    		{
		    			System.out.println("Ejercicio 2: Es par el numero: " +num);
		    		}
		    		else System.out.println("Ejercicio 2: Es impar el numero: " +num);
		    		break;	
		    		
		    	case(3):
		    		//Ejercicio n�3: Mostrar los primeros 100 n�meros primos.
		    		System.out.println("Ejercicio 3: Numeros primos antes de 100: ");
		    		prim100numPrimos(2,0);
		    		break;
		    		
		    	case(4):
		    		//Ejercicio n�4: Mostrar los primeros n n�meros primos.
		    		System.out.println("Ejercicio 4: Ingrese un numero mayor a cero: ");
		    		n = scan.nextInt();
		    		System.out.println("Los primeros " + n + " numeros primos");
	    			primNnumPrimos(2,0,n);
	    			break;
	    			
		    	case(6):
		    		//Ejercicio n�6: Ingresar un n�mero o tantos como quiera el usuario y revisar si es primo
		    		while(control=='s')
		    		{
		    			System.out.println("Ingrese un numero:");
			    		n = scan.nextInt();
			    		rta = esPrimo(n);
			    		if( rta ) System.out.println("El numero ES primo");
			    		else System.out.println("El numero NO ES primo");
			    		System.out.println("Para ingresar otro numero presione s :");
			    		control = scan.next().charAt(0);
		    		}
		    		break;
		    		
		    	case (7):
		    		//Ejercicio n�7: Encontrar la suma de los primeros 10 n�meros naturales.
		    		n= totalNaturales(10);
		    		System.out.println("El total de los primeros 10 numeros naturales es: " + n);
		    		break;
		    		
		    	case (8):
		    		//Ejercicio n�8: Sumar (en cantidad, no acumular) cu�ntos n�meros positivos ingresa un usuario. 
		    		int cantidad=cantidadDingresos();
		    		System.out.println("Cantidad de numeros pares ingresados: " +cantidad);
		    		break;
		    	
		    	case (9):
		    		//Ejercicio n�9: Revisar si un a�o es bisiesto o no.
		    		int a�o=365;
		    		boolean rtta = true;
		    		rtta= bisiestoOno(a�o);
		    		if(rtta)
		    		{
		    			System.out.println("El a�o es bisiesto");
		    		}
		    		else System.out.println("El a�o NO es bisiesto");
		    		break;
		    	
		    	case (10):
		    		//Ejercicio n�10: Encontrar el valor ASCII de un car�cter.
		    		System.out.println("Ingrese un caracter:");
		    		char caracter = scan.next().charAt(0);
		    		int ascii = asciiDcaracter(caracter) ;
		    		System.out.println("El valo ASCII del caracter " +caracter+ " es " +ascii);
		    		break;
		    		
		    	case(11):
		    		//Ejercicio n�11: Multiplicar dos n�meros. 
		    		System.out.println("A continuacion ingrese los dos numeros a multiplicar: ");
		    		int multiplo1= scan.nextInt();
		    		System.out.println(" - ");
		    		int multiplo2= scan.nextInt();
		    		float producto= multiplicar2num((float)multiplo1,(float)multiplo2);
		    		System.out.println("El producto de la multiplicacion entre "+multiplo1+ " y " +multiplo2+ " es " +producto);
		    		break;
		    	
		    	case(12):
		    		//Realizar un programa que le pregunte al usuario que �rea desea calcular. Las opciones son: rect�ngulo, cuadrado, triangulo y circulo.
		    		System.out.println("Que area desea calcular?  1-rectangulo  2-cuadrado  3-triangulo  4-circulo");
		    		int opcion=scan.nextInt();
		    		switch(opcion)
		    		{
		    			case(1):
		    				System.out.println("Ingrese la altura del rectangulo en centimetros: ");
		    				int h= scan.nextInt();
		    				System.out.println("la base: ");
		    				int b= scan.nextInt();
		    				System.out.println("El Area del rectangulo es : " +multiplicar2num((float)h,(float)b)+ "cm2");
		    				break;
		    				
		    			case(2):
		    				System.out.println("Ingrese la medida del lado del cuadrado en centimetros: ");
		    				int l = scan.nextInt();
		    				System.out.println("El area del cuadrado es : " +multiplicar2num((float)l,(float)l)+ "cm2");
		    				break;
		    				
		    			case(3):
		    				System.out.println("Ingrese la altura del triangulo: ");
		    				int a=scan.nextInt();
		    				System.out.println("la base: ");
		    				float base=scan.nextInt();
		    				System.out.println("El area de su triangulo es : " + (multiplicar2num((float)a,(float)base)/2) + " cm2 ");
		    				break;
		    				
		    			case(4):
		    				System.out.println("Ingrese el radio del circulo:");
		    				int r=scan.nextInt();
		    				float pi = (float)3.14;
		    				System.out.println("El area del circulo es: " + multiplicar2num( pi, (float)(r*r) ) + "cm2");
		    				break;
		    				
		    			default:
		    				System.out.println("Opcion incorrecta");
		    				break;
		    				
		    		}
		    		break;
		    		
		    	case(13):
		    		//Ejercicio n�13: Programa que lea un nombre y muestre por pantalla: �Buenos dias nombre_introducido�.
		    		System.out.println("Ingrese su nombre: ");
		    		Scanner scann = new Scanner(System.in);
		    		String nombre = scann.nextLine();
		    		scann.close();
			    	System.out.println("Buenos dias  " + nombre );
			    	break;
			    	
		    	case(14):
		    		//Ejercicio n�14: Escribir un programa que lea un n�mero entero por teclado y obtenga y muestre por pantalla el doble y el triple de ese n�mero.
		    		System.out.println("Ingrese un numero:");
		    		int numero = scan.nextInt();
		    		System.out.println("El doble de " +numero+ " es " +(numero*2)+ " , y el triple es " +(numero*3));
		    		break;
		    		
		    	case(15):
		    		//Ejercicio n�15: Programa que lea una cantidad de grados cent�grados y la pase a grados Fahrenheit. 
		    		//La f�rmula correspondiente para pasar de grados cent�grados a fahrenheit es:  F = 32 + ( 9 * C / 5)
		    		System.out.println("Ingrese los grados centigrados: ");
		    		float grados= scan.nextFloat();
		    		System.out.println(grados+ " es igual a " + centigradosAfarenheit(grados)+ " grados farenheit.");
		    		break;
		    		
		    	case(16):
		    		//Ejercicio n�16: Programa que lea por teclado el valor del radio de una circunferencia y
		    		//calcula y muestra por pantalla la longitud y el �rea de la circunferencia. Investigar el 
		    		//uso de la librer�a Math.Longitud de la circunferencia = 2*PI*Radio, Area de la circunferencia = PI*Radio^2
		    		System.out.println("Ingrese el radio de la circunferencia: ");
		    		float radio = scan.nextFloat();
		    		double pi= Math.PI;
		    		System.out.println("La longitud de la circunferencia es : " +(2*pi*radio) + " , y el Area es : " +( pi*Math.pow(radio,2))  );
		    		break;
		    		
		    	case(17):
		    		//Ejercicio n�17: Programa que pase una velocidad en Km/h a m/s. La velocidad se lee por teclado.
		    		System.out.println("Ingrese la velocidad en Km/h : ");
		    		float km=scan.nextFloat();
		    		System.out.println(+km+ " Km/h es igual a " +(km*0.2777778)+ " m/s");
		    		break;
		    	
		    	case(18):
		    		//Ejercicio n�18: Programa lea la longitud de los catetos de un tri�ngulo rect�ngulo y 
		    		//calcule la longitud de la hipotenusa seg�n el teorema de Pit�goras.
		    		System.out.println("Ingrese la longitud de los catetos en centimetros: ");
		    		float c1=scan.nextFloat();
		    		System.out.println("-");
		    		float c2=scan.nextFloat();
		    		System.out.println("La hipotenusa del triangulo es: " + hipotenusaTrianguloRec(c1,c2));
		    		break;
		    		
		    	case(19):
		    		//Ejercicio n�19: Programa lea 30 temperaturas correspondientes a un mes y 
		    		//calcule el maximo, el minimo y el promedio.
		    		float[] gradosXmes = { 12,13,14,15,16,17,13,14,15,24,34,24,22,35,36,12,13,14,15,16,17,13,14,15,24,34,24,22,35,36};
		    		int cant=30;
		    		System.out.println("La temperatura minima del mes es: "+ minimo(gradosXmes,cant));
		    		System.out.println("La temperatura maxima del mes es: "+ maximo(gradosXmes,cant));
		    		System.out.println("El promedio de temperaturas del mes es : " + promedioArrayFloat(gradosXmes));
		    		break;
		    	
		    	case(20):
		    		//Ejercicio n�20:Pide por teclado dos n�meros y genera 10 n�meros aleatorios entre esos
		    		//n�meros. Usa el m�todo Math.random para generar un n�mero entero aleatorio .
		    		System.out.println("Ingrese el inicio y el tope de busqueda de numeros random: ");
		    		int inicio=scan.nextInt();
		    		int tope=scan.nextInt();
		    		System.out.println("Los diez numero random son:");
		    		for(int i=1; i<11;i++)
					{
						System.out.println(i+" - " + Math.floor(Math.random()*(tope-inicio-1) + inicio));
					}
		    		break;

		    	case(21):
		    		//Ejercicio n�21:  Crea una aplicaci�n que nos pida un d�a de la semana y que 
		    		//nos diga si es un d�a laboral o no. Usa un switch para ello.
		    		diaLaboralOno();
		    		break;
		    	
		    	case(22):
		    		//Ejercicio n�22: Pide por teclado un n�mero entero positivo (debemos controlarlo) y 
		    		//muestra  el n�mero de cifras que tiene. Por ejemplo: si introducimos 1250, nos muestre 
		    		//que tiene 4 cifras. Tendremos que controlar si tiene una o m�s cifras, al mostrar el mensaje.
		    		System.out.println("Ingrese un numero positivo: ");
		    		int numm=scan.nextInt();
		    		while(numm % 2 != 0)
		    		{
		    			System.out.println("Ingrese un numero POSITIVO: ");
		    			numm=scan.nextInt();
		    		}
		    		System.out.println("El numero que ingreso tiene " +(int)(Math.log10(numm)+1)+ " cifras");
		    		break;
		    		
		    	case(23):
		    		//Ejercicio n�23:  Crea una aplicaci�n llamada CalculadoraPolacaInversaApp, nos pedir� 2 operandos (int) 
		    		//y un signo aritm�tico (String), seg�n este �ltimo se realizar� la operaci�n correspondiente. Al final 
		    		//mostrara el resultado en un cuadro de di�logo.
		    		//Los signos aritm�ticos disponibles son:
		    			//+: suma los dos operandos.
		    			//-: resta los operandos.
		    			//*: multiplica los operandos.
		    			///: divide los operandos, este debe dar un resultado con decimales (double)
		    			//^:  1� operando como base y 2� como exponente.
		    			//%:  m�dulo, resto de la divisi�n entre operando1 y operando2.
		    		Scanner scaner = new Scanner(System.in);
		    		int asciii;
		    		char signo1;
		    		int n2;
		    		int n1;
		    		String signo;
		    		while(control=='s')
		    		{
		    		System.out.println("Ingrese la operacion: (signos disponibles: +,-,*,/,^,% ). Ingrese el primer numero, ENTER, el signo, ENTER, el segundo numero, ENTER:");
		    		n1=scan.nextInt();
		    		//scan.nextInt();
		    		signo = scaner.nextLine();
		    		signo1= signo.charAt(0);
		    		asciii=(int)signo1;
		    		n2=scan.nextInt();
		    		//scan.nextInt();
		    		switch(asciii)
		    		{
		    			case(43):
		    				System.out.println(n1+ " + " +n2+ " = "+ (n1+n2));
		    				break;
		    				
		    			case(45):
		    				System.out.println(n1+ " - " +n2+ " = "+ (n1-n2));
		    				break;
		    				
		    			case(42):
		    				System.out.println(n1+ " * " +n2+ " = "+ (n1*n2));
		    				break;
		    				
		    			case(47):
		    				System.out.println(n1+ " / " +n2+ " = "+ (double)((float)n1/(float)n2));
		    				break;
		    				
		    			case(94):
		    				System.out.println(n1+ " ^ " +n2+ " = "+ (n1^n2));
		    				break;
		    				
		    			case(37):
		    				System.out.println(n1+ " % " +n2+ " = "+ (n1%n2));
		    				break;
		    				
		    			default:
		    				System.out.println("No es una operacion valida");
		    				break;
		    		}
		    		System.out.println("Para continuar calculando ingrese 's' :");
		    		control= scaner.next().charAt(0);
		    		
		    		}
		    		scaner.close();
		    		break;
		    		
		    	case(24):
		    		//Ejercicio n�23: Pide por teclado el nombre, edad y salario y muestra el salario
					//Si es menor de 16 no tiene edad para trabajar
					//Entre 19 y 50 a�os el salario es un 5 por ciento m�s
					//Entre 51 y 60 a�os el salario es un 10 por ciento m�s
					//Si es mayor de 60 el salario es un 15 por ciento m�s
		    		System.out.println("Ingrese su nombre, edad y salario: ");
		    	Scanner datos = new Scanner(System.in);
		    		String nom= datos.nextLine();
		    		 int edad= datos.nextInt();
		    		int salario=datos.nextInt();
		    		if(edad<16) System.out.println("Usted no tiene edad para trabajar.");
		    		if(edad>15 && edad<19) System.out.println(nom +" Su salario es : " + salario);
		    		if(edad>18 && edad<51) System.out.println(nom +" Su salario es : "+ (salario + ((salario/100)*5)));
		    		if(edad>50 && edad<61) System.out.println(nom+" Su salario es : "+ (salario + ((salario/100)*10)));
		    		if(edad>60) System.out.println(nom +" Su salario es : "+ (salario + ((salario/100)*15)));
		    		break;
		    		
	    	}	  	
	    	System.out.println("Para ver otro ejercicio presione 's': ");
	    	control=  scan.next().charAt(0);
	    }
	    scan.close();
	   	System.out.println("FIN DE LA GUIA INTERACTIVA :)");
	    	
	}
		
	public static float promedioArrayInt (int[] array)
	{
		int i=0, suma=0, cant=array.length;
		while(i<cant)
		{
			suma = suma + array[i];
			i++;
		}
		return (float)suma/(float)cant;
	
	}
	public static float promedioArrayFloat (float[] array)
	{
		int i=0, cant=array.length;
		float suma=0;
		while(i<cant)
		{
			suma = suma + array[i];
			i++;
		}
		return (float)suma/(float)cant;
	
	}
	public static boolean numeroParOimpar (int num)//retorna true si es par, false si es impar;
	{
		boolean rta= true;
		if(num%2 != 0) 
		{
			rta=false;
		}
		return rta;
	}
	public static void prim100numPrimos(int dos, int cont)//ingreso el dos por parametro, y el 0 en contador
	{
		int div=1, primo=1;
		if( cont<=100  ) // el tope de busqueda es 100
		{
			while( ++div<dos && primo==1) // mientras div no sea igual a dos y siga siendo primo
				{
					if( dos % div == 0 ) primo=0; // cuando un numero no lo haga primo corta el while
				}
			if(primo==1) 
				{
					System.out.println(" -  " +dos);//lo printea si es primo
					cont++;
				}
			prim100numPrimos(++dos, cont);//recursividad.
		}
		
	}
	public static void primNnumPrimos(int dos, int cont, int n)
	{
		int div=1, primo=1;
		if( cont<n  ) // el tope de busqueda es 100
		{
			while( ++div<dos && primo==1) // mientras div no sea igual a dos y siga siendo primo
				{
					if( dos % div == 0 ) primo=0; // cuando un numero no lo haga primo corta el while
				}
			if(primo==1) 
				{
					System.out.println(" -  " +dos);//lo printea si es primo
					cont++;
				}
			primNnumPrimos(++dos, cont, n);//recursividad.
		}
	}
	public static boolean esPrimo (int n)
	{
		boolean rta=false;
		if(n>1)
		{
			rta=true;
			int div=1;
			while( ++div<n && rta==true) 
			{
				if( n % div == 0 ) rta=false; 
			}
		}
		return rta;
	}	
	public static int totalNaturales (int n)
	{
		int total=0;
		for(int i=0; i<n;i++)
		{
			total = total+i;
		}
		return total;
	}
	public static int cantidadDingresos()
	{
		int cantidad=0;
		int num;
		Scanner scann = new Scanner(System.in);
		char control= 's';
		while(control=='s')
		{
			System.out.println("Ingrese un numero: ");
			num = scann.nextInt();
			if(num % 2 == 0)
			{
				cantidad++;
			}
			System.out.println("Para continuar ingresando numeros presione 's' : ");
			control=scann.next().charAt(0);
		}
		scann.close();
		return cantidad;
	}
	public static boolean bisiestoOno(int a�o)
	{
		boolean rta=true;
		if(a�o==365)
		{
			rta=false;
		}
		return rta;
	}
	public static int asciiDcaracter(char caracter)
	{
		return (int)caracter;
	}
	public static float multiplicar2num(float multiplo1, float multiplo2)
	{
		return (float)(multiplo1 * multiplo2);
	}
	public static float centigradosAfarenheit(float grados)
	{
		return (float) (32 + ( 9 * grados / 5));
	}
	public static double hipotenusaTrianguloRec (float cateto1, float cateto2)
	{
		return Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
	}
	public static float maximo (float[] numero, int cant)
	{
		float aux = numero[0];
		for(int i=0; i<cant;i++)
		{
			if (aux<numero[i]) aux=numero[i];
		}
		return aux;
	}
	public static float minimo (float[] numero, int cant)
	{
		float aux = numero[0];
		for(int i=0; i<cant;i++)
		{
			if (aux>numero[i]) aux=numero[i];
		}
		return aux;
	}
	public static void diaLaboralOno ()
	{
	
		Scanner scan = new Scanner (System.in);
			System.out.println("Ingrese el numero del dia que desea saber si es laboral:");
			System.out.println("1. Domingo");
			System.out.println("2. Lunes");
			System.out.println("3. Martes");
			System.out.println("4. Miercoles");
			System.out.println("5. Jueves");
			System.out.println("6. Viernes");
			System.out.println("7. Sabado");
			int nro = scan.nextInt();
			System.out.println("");
			switch (nro)
			{
				case 1:
					System.out.println("No es un dia laboral.");
					break;
				case 2:
					System.out.println("Es un dia laboral.");
					break;
				case 3:
					System.out.println("Es un dia laboral.");
					break;
				case 4:
					System.out.println("Es un dia laboral.");
					break;
				case 5:
					System.out.println("Es un dia laboral.");
					break;
				case 6:
					System.out.println("Es un dia laboral.");
					break;
				case 7:
					System.out.println("No un dia laboral.");
					break;
				default:
					System.out.println("Opcion incorrecta.");
					break;
			}
			System.out.println("");
		scan.close();
	}
}




