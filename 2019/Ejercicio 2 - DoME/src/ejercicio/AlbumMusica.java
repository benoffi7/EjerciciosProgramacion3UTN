package ejercicio;

public class AlbumMusica extends ElementoMultimedia
{
	private String banda;
	private int numeroDeCanciones;
	
	public AlbumMusica(String titulo, int a�o, int duracion, String loTengo, String comentario, String banda, int numeroDeCanciones)
	{
		super(titulo, a�o, duracion, loTengo, comentario);
		setBanda(banda);
		setNumeroDeCanciones(numeroDeCanciones);
	}

	@Override //Es �nicamente una indicaci�n de intenciones al compilador. Si no pones Override, seguir� sobrecargando 
	//y seguir� usando ese y no el del padre. La anotaci�n no afecta para nada al hecho de sobrecargar, es simplemente
	//pedirle al compilador que te avise si te equivocaste al sobrecargar y en realidad no est�s sobrecargando nada.
	public String imprimir()
	{
		return "[Album de musica]" + super.imprimir() + " | Banda = " + getBanda() + " | Numero de canciones = " + getNumeroDeCanciones() + "]\n";
	}

	public void setBanda(String banda)
	{
		this.banda = banda;
	}
	
	public void setNumeroDeCanciones(int numeroDeCanciones)
	{
		this.numeroDeCanciones = numeroDeCanciones;
	}

	public String getBanda()
	{
		return banda;
	}

	public int getNumeroDeCanciones()
	{
		return numeroDeCanciones;
	}
}