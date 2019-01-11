package co.com.samtel.schedule;

import javax.annotation.PostConstruct;
import javax.ejb.Schedule;
import javax.ejb.Singleton;
import javax.ejb.Startup;

@Startup
@Singleton
public class ScheduleTask {
	
	@PostConstruct
	public void init() {
		System.out.println(".:: Inicializando schedule para migración de tablas ::.");
	}
	
	@Schedule(second = "*/20", minute = "*", hour = "*", persistent = false)
	public void executeTask() {
		System.out.println("Ejecutando tarea");
	}
}
