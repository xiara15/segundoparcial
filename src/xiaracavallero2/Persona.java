package xiaracavallero2;

public abstract class  Persona 
{
	private int dni;
	public String nombre;
	private String apellido;
	
public Persona (int dni, String nombre, String apellido) 
{
	this.dni = dni;
	this.nombre = nombre;
	this.apellido = apellido;
}

public int getDni()
{
	return dni;
}

public void setDni(int dni) 
{
	this.dni = dni;
}

public String getNombre() 
{
	return nombre;
}

public void setNombre(String nombre) 
{
	this.nombre = nombre;
}


public String getApellido()
{
	return apellido;
}


public void setApellido(String apellido) 
{
	this.apellido = apellido;
}


public abstract void verDatos();

	
	
	
	

}
