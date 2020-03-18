package ejercicio;

public class Pelicula extends ElementoMultimedia
{
	private String director;
	
	public Pelicula(String titulo, int a�o, int duracion, char loTengo, String comentario, String director)
	{
		super(titulo, a�o, duracion, loTengo, comentario);
		this.director = director;
	}

	@Override
	public String imprimir()
	{
		return "[Pelicula]" + super.imprimir() + " | director = " + director + "]\n";
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
