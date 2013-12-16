package tutorialesJava;

public class Main {
	
	public static void main(String[] args) {
		
		Vehiculo v = new Vehiculo();
		Auto a = new Auto();
		
		System.out.println("Vehiculo: " + v.obtenerColor());
		
		v.setColor("Azul");
		
		System.out.println("Vehiculo: " + v.obtenerColor());
		
		System.out.println("Auto: " + a.obtenerColor());
		
	}

}
