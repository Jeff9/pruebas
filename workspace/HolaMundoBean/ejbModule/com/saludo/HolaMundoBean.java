package com.saludo;

import java.rmi.RemoteException;

import javax.ejb.EJBException;
import javax.ejb.SessionBean;
import javax.ejb.SessionContext;

public class HolaMundoBean implements SessionBean {
	
	private static final long serialVersionUID = 1L;
	
	public String saludo(String nombre){
		
		System.out.println("Un cliente me ha invocado");
		
		return "hola " + nombre;
		
	}
	
	public void ejbCreate(){}

	public void ejbActivate() throws EJBException, RemoteException {}

	public void ejbPassivate() throws EJBException, RemoteException {}

	public void ejbRemove() throws EJBException, RemoteException {}

	@Override
	public void setSessionContext(SessionContext arg0) throws EJBException,	RemoteException {}



}
