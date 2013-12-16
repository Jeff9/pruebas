package com.saludo;

import java.util.Properties;
import javax.naming.Context;
import javax.naming.InitialContext;
import com.saludo.HolaMundoRemote;

public class BeanCliente {

	public static void main(String ar[]) throws Exception{
		
		String JBOSS_CONTEXT="org.jboss.naming.remote.client.InitialContextFactory";; 
		
		Properties props = new Properties();
		
		props.put(Context.INITIAL_CONTEXT_FACTORY,JBOSS_CONTEXT);
		props.put(Context.PROVIDER_URL,"remote://localhost:4447");
		props.put(Context.SECURITY_PRINCIPAL,"clienteb");
		props.put(Context.SECURITY_CREDENTIALS, "123");
		
		System.out.println("INITIAL_CONTEXT_FACTORY" + Context.INITIAL_CONTEXT_FACTORY ); 
		
		Context context = new InitialContext(props);
		
		//HolaMundoRemote remote=(HolaMundoRemote)context.lookup("app/HolaMundoBean/HolaMundo!com.saludo.HolaMundoRemote");
		HolaMundoRemote remote=(HolaMundoRemote)context.lookup("//HolaMundoBean/HolaMundo!com.saludo.HolaMundoRemote");
		//ejb:app-name/module-name/distinctname/beanName!interfaceName
		
		String a = (String)remote.saludo("paco");
		
		System.out.println(a);
		
	}
	
}
