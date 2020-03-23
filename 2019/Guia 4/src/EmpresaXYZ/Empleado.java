package EmpresaXYZ;

public abstract class Empleado extends Persona
{
	private int a�o;
	private float salarioBase;
	
	
	//Constructores
	public Empleado()
	{
		super();
		setA�o(0);
		setSalarioBase(0);
	}

	public Empleado(String nombre, String apellido, String dni, int a�o, float salarioBase)
	{
		super(nombre, apellido, dni);
		setA�o(a�o);
		setSalarioBase(salarioBase);
	}
	
	//Setters
	private void setA�o(int a�o) 
	{			
		this.a�o = a�o;
	}


	public void setSalarioBase(float salarioBase) 
	{
		this.salarioBase = salarioBase;
	}
	
	
	//Getters
	public int getA�o() 
	{
		return a�o;
	}

	public float getSalarioBase() 
	{
		return salarioBase;
	}
	
	
	//Metodos
	
	@Override
	public String toString()
	{
		return super.toString() +"\nA�o de ingreso: "+ getA�o() + "\nSalario Base: " + getSalarioBase();
	}
	
	abstract public float obtenerSalario();
}
