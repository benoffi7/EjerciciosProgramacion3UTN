package ejercicio;

public class Pelicula extends ElementoMultimedia
{
	private String director;
	
	public Pelicula(String titulo, int a�o, int duracion, String loTengo, String comentario, String director)
	{
		super(titulo, a�o, duracion, loTengo, comentario);
		setDirector(director);
	}

	@Override //Es �nicamente una indicaci�n de intenciones al compilador. Si no pones Override, seguir� sobrecargando 
	//y seguir� usando ese y no el del padre. La anotaci�n no afecta para nada al hecho de sobrecargar, es simplemente
	//pedirle al compilador que te avise si te equivocaste al sobrecargar y en realidad no est�s sobrecargando nada.
	public String imprimir()
	{
		return "[Pelicula]" + super.imprimir() + " | Director = " + getDirector() + "]\n";
	}

	public String getDirector()
	{
		return director;
	}

	public void setDirector(String director)
	{
		this.director = director;
	}
}