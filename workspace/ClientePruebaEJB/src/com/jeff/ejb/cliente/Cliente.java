package com.jeff.ejb.cliente;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.prueba.InterfaceEJB;

public class Cliente {
	
		 private static final String JNDI_PRIMER_EJB = "/PrimerEJB/remote";

		    public static void main(String[] args) throws NamingException {
		        Properties properties = new Properties();
		        properties.put("java.naming.factory.initial", "org.jnp.interfaces.NamingContextFactory");
		        properties.put("java.naming.factory.url.pkgs", "org.jboss.naming:org.jnp.interfaces");
		        properties.put("java.naming.provider.url", "jnp://localhost:1099");
		        Context context = new InitialContext(properties);
		        
		        InterfaceEJB bean = (InterfaceEJB) context.lookup(JNDI_PRIMER_EJB);
		        String respuesta = bean.proteccion("start");
		        System.out.println(respuesta);
		    }
	}
