package pruebaCron;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Inicio");

		JobDetail jobTareas = new JobDetail();
		
		jobTareas.setName("ProteccionWSS");		
		jobTareas.setJobClass(Trabajo.class);
		
		
		CronTrigger trigger = new CronTrigger();
		
		trigger.setName("ProteccionTriggerWSS");
		trigger.setCronExpression("0/120 * * * * ?");
		
		// schedule it
		Scheduler scheduler = new StdSchedulerFactory().getScheduler();
		
		scheduler.start();
		scheduler.scheduleJob(jobTareas, trigger);

	}

}
