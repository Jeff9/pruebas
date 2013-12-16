package pruebaCron;

import org.quartz.CronTrigger;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.impl.StdSchedulerFactory;

public class Main {

	public static void main(String[] args) {
		try {
			
			System.out.println("Inicio");

			JobDetail jobTareas = new JobDetail();
			
			jobTareas.setName("ProteccionWSS");		
			jobTareas.setJobClass(Trabajo.class);
			
			
			CronTrigger trigger = new CronTrigger();
			
			trigger.setName("ProteccionTriggerWSS");
			trigger.setCronExpression("0/10 * * * * ?");
			
			// schedule it
			Scheduler scheduler = new StdSchedulerFactory().getScheduler();
			
			scheduler.start();
			scheduler.scheduleJob(jobTareas, trigger);
			
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
