package tutorialesJava;

public class Vehiculo {
	
	protected String color;
	protected int ruedas;
	protected int puertas;
	protected String patente;
	
	public Vehiculo(String color, int ruedas, int puertas){		
		this.color = color;
		this.puertas = ruedas;
		this.ruedas = puertas;
		
	}
	
	public Vehiculo(){		
		this.color = "verde";
		this.puertas = 4;
		this.ruedas = 4;		
		
	}
	
	public int obtenerRuedas(){
		return ruedas;
	}
	
	public String obtenerColor(){
		return color;
	}
	
	public void setColor(String color){
		this.color = color;
	}
	
	public int obtenerPuertas(){
		return puertas;
	}
	
	

}
