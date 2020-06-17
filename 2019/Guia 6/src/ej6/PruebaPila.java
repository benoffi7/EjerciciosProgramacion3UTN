package ej6;

import ej5.IColeccionInterfaz;

public class PruebaPila {
/*
 * rellenar(): recibe por par�metro un objeto de tipo ColeccionInterfaz,
 *			  y a�ade los n�meros del 1 al 10.
	imprimirYVaciar(): recibe por par�metro un objeto de tipo ColeccionInterfaz 
	y va extrayendo e imprimiendo los datos de la colecci�n hasta que se quede vac�a.

 */

	public static void rellenar(IColeccionInterfaz<Integer> c) {
		for(int i = 1; i<11;i++) {
			c.agregar(i);
		}
	}
	
	public static String imprimirYVaciar(IColeccionInterfaz<Integer> c) {
		StringBuilder datos = new StringBuilder();
		datos.append("TOPE--------------------\n");
		while(!c.estaVacia()) {			
			datos.append(c.extraer());
			datos.append("\n");
		}
		datos.append("BASE--------------------");
		return datos.toString();
	}
}
