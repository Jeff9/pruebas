package objects;

public class ServicioCrearObjeto {
	
	private static ServicioCrearObjeto instance = null;
	
	private ServicioCrearObjeto(){		
	}
	
	public static ServicioCrearObjeto obtenerServicio(){
		if(instance == null){
			instance = new ServicioCrearObjeto();
		}		
		return instance;		
	}
	
	public InterfaceObjecto obtenerInterface(){
		
		return null; //new Pelota();
		
	}

}
