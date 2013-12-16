package com.prueba;

import javax.ejb.Remote;
import javax.ejb.Stateless;

@Remote
@Stateless
public class PrimerEJB implements InterfaceEJB {
	
	String estado = "";
	boolean inicio = false;
	
	public String proteccion(String comando) {
		
		try {

			if (!comando.equalsIgnoreCase(null)) {
				
				if(comando.equalsIgnoreCase("start")){
					if(inicio){
						estado = "El servicio se esta ejecutando actualmente";
					}else{
						inicio = true;
						estado = "Iniciando";
					}
					
					
				}else if(comando.equalsIgnoreCase("status")){
					
					if(inicio){
						estado = "Se esta ejecutando";
					}else{
						estado= "No se ha iniciado";
					}
					
				}else if(comando.equalsIgnoreCase("stop")){
					if(inicio){
						inicio = false;
						estado = "Se ha detenido";
						
					}else{
						estado= "Actualmente no se esta ejecutando";
					}
				}else{
					estado = comando + " Comando Invalido: (start/status/stop)";
				}
				
				return estado;
				
			} else {
				estado = "Debe Ingresar (start/status/stop)";
				return estado;
			}

		} catch (Exception e) {
			estado += "ERROR : " + e;
			return estado;
		}
	}
}
