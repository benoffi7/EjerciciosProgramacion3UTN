package ejercicio;

public class ElementoMultimedia extends Catalogo
{
	private String titulo;
	private int a�o;
	private int duracion; //En minutos
	private char loTengo;
	private String comentario;
	
	public ElementoMultimedia(String titulo, int a�o, int duracion, char loTengo, String comentario)
	{
		this.titulo = titulo;
		this.a�o = a�o;
		this.duracion = duracion;
		this.loTengo = loTengo;
		this.comentario = comentario;
	}
	
	public String imprimir()
	{
		return "[Titulo = " + titulo + " | a�o = " + a�o + ", duracion = " + duracion + " min. | �Lo tengo? = " + loTengo + " | comentario = " + comentario + "]";
	}

	public String getTitulo()
	{
		return titulo;
	}
	
	public void setTitulo(String titulo)
	{
		this.titulo = titulo;
	}
	
	public int getA�o() 
	{
		return a�o;
	}
	
	public void setA�o(int a�o)
	{
		this.a�o = a�o;
	}
	
	public int getDuracion()
	{
		return duracion;
	}
	
	public void setDuracion(int duracion)
	{
		this.duracion = duracion;
	}
	
	public char getLoTengo()
	{
		return loTengo;
	}
	
	public void setLoTengo(char loTengo)
	{
		this.loTengo = loTengo;
	}
	
	public String getComentario()
	{
		return comentario;
	}
	
	public void setComentario(String comentario)
	{
		this.comentario = comentario;
	}
}
