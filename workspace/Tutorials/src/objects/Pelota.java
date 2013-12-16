package objects;

public abstract class Pelota implements InterfaceObjecto {	
	float peso = 254;
	float rad = 32;
	

	public Pelota(){		
		peso = 254;
		rad = 32;		
	}
	
	public Pelota(float peso, float radio){
		this.peso = peso;
		this.rad = radio;		
		
	}
	
	public float obtenerPeso(){
		
		return peso;
		
	}

}
