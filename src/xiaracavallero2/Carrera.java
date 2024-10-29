package xiaracavallero2;

import java.util.ArrayList;

public class Carrera {
	
	private int codigo; 
	private String titulo; 
	private double cuotaMensual;
    private ArrayList<Materia> materias = new ArrayList<>();
   
 public Carrera(int codigo, String titulo, double cuotaMensual, ArrayList<Materia> materias) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.cuotaMensual = cuotaMensual;
		this.materias = materias;
	}

public  Carrera (int codigo, String titulo, double cuotaMensual) {
	 this.codigo = codigo;
     this.titulo = titulo;
     this.cuotaMensual = cuotaMensual;
     this.materias = new ArrayList<>();
 }
 
public int getCodigo() {
	return codigo;
}





public void setCodigo(int codigo) {
	this.codigo = codigo;
}

public String getTitulo() {
	return titulo;
}

public void setTitulo(String titulo) {
	this.titulo = titulo;
}

public double getCuotaMensual() {
	return cuotaMensual;
}

public void setCuotaMensual(double cuotaMensual) {
	this.cuotaMensual = cuotaMensual;
}

public ArrayList<Materia> getMaterias() {
	return materias;
}

public void setMaterias(ArrayList<Materia> materias) {
	this.materias = materias;
}

public  double cambiarValorCuota() {
	
	return 0;
	
	
}
	

public ArrayList <Alumno>verAlumnosInscriptos () 

{

    return new ArrayList<>();
	
}
	
	
	

}
