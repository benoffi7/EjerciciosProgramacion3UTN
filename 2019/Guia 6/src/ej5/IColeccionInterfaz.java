package ej5;

public interface IColeccionInterfaz<T> {
	/**
	 * 
	 * @return devuelve true si la colecci�n est� vac�a y false en caso contrario.
	 */
	boolean estaVacia(); 
	/**
	 * 
	 * @return devuelve y elimina el primer elemento de la colecci�n.
	 */
	T extraer();
	/**
	 * devuelve el primer elemento de la colecci�n.
	 */
	T primero(); 
	/**
	 *  a�ade un objeto por el extremo que corresponda, 
	 *  y devuelve true si se ha a�adido y false en caso contrario.
	 */
	boolean agregar(T elemento);

}
