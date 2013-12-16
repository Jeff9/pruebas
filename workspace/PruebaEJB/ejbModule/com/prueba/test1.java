package com.prueba;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class test1 {

	@Before
	public void setUp() throws Exception {
	}

	  @Test
	    public void testSaludaConNombre() {
	        PrimerEJB ejb = new PrimerEJB();
	        assertEquals("Hola usuario", ejb.proteccion("usuario"));
	    }
	    
	    @Test
	    public void testSaludaConOtroNombre() {
	        PrimerEJB ejb = new PrimerEJB();
	        assertEquals("Hola Pedro", ejb.proteccion("Pedro"));
	    }
	    
	    @Test
	    public void testSaludaConNull() {
	        PrimerEJB ejb = new PrimerEJB();
	        assertEquals("Hola desconocido", ejb.proteccion(null));
	    }

}
