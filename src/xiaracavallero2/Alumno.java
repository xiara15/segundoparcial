package xiaracavallero2;

import java.util.ArrayList;

public class Alumno extends Persona{

	private int legajo;
	private ArrayList<Carrera> carreras;

	public Alumno(int dni, String nombre, String apellido, int legajo){
		super(dni, nombre, apellido);
		this.legajo = legajo;
        this.carreras = new ArrayList<> ();
        
	}

	 public int getLegajo() {
		return legajo;
	}

	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}

	public ArrayList<Carrera> getCarreras() {
		return carreras;
	}

	public void setCarreras(ArrayList<Carrera> carreras) {
		this.carreras = carreras;
	}




	public ArrayList<Carrera> getCarrera()
	    {
	        return getCarrera();
	    }
	
	
public void verCronogramaCarrera ()
{
	System.out.println("Cronograma de carreras para el alumno " + nombre + ":");

}



@Override
public void verDatos() 
{
	
	
	
}
	

	
	
	

}
