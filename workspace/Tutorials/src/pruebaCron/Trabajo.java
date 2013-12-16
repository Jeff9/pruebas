package pruebaCron;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class Trabajo implements Job{
	int i=0;

	
	@Override
	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		System.out.println("Ejecucion:"  + i++); 
		
	}
	
}
