package net.codejava;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class DemoServicePropertiesExample {
	
	//@Scheduled(cron="*/5 * * * * ?")
    public void demoServiceMethod()
    {
        System.out.println("Method executed at every 5 seconds. Current time is :: "+ new Date());
    }

}
