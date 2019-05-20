package ejercicio;

public class ElementoMultimedia extends Catalogo
{
	private static int idUltimoElemento=-1;
	private int idElemento;
	private String titulo;
	private int a�o;
	private int duracion; //En minutos
	private String loTengo; //s/n
	private String comentario;
	
	public ElementoMultimedia(String titulo, int a�o, int duracion, String loTengo, String comentario)
	{
		setIdElemento();
		setTitulo(titulo);
		setA�o(a�o);
		setDuracion(duracion);
		setLoTengo(loTengo);
		setComentario(comentario);
	}
	
	public int getIdElemento()
	{
		return idElemento;
	}

	public void setIdElemento()
	{
		idElemento = generarId();
	}
	
	private int generarId()
	{
		setIdUltimoElemento();
		return ElementoMultimedia.getIdUltimoElemento() + 1;
	}
	
	private static void setIdUltimoElemento()
	{
		ElementoMultimedia.idUltimoElemento = generarIdUltimoElemento();
	}
	
	private static int generarIdUltimoElemento()
	{
		return ElementoMultimedia.getIdUltimoElemento() + 1;
	}
	
	private static int getIdUltimoElemento()
	{
		return ElementoMultimedia.idUltimoElemento;
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
	
	public String getLoTengo()
	{
		return loTengo;
	}
	
	public void setLoTengo(String loTengo)
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

	public String imprimir()
	{
		return "[ID = " + getIdElemento() + " | Titulo = " + getTitulo() + " | A�o = " + getA�o() + " | Duracion = " + getDuracion() + " min. | �Lo tenes? = " + getLoTengo() + " | Comentario = " + getComentario();
	}
}