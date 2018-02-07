package nl.pa3bmg.els.bootstrap;

import java.util.Date;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import nl.pa3bmg.els.model.Status;
import nl.pa3bmg.els.repository.StatusRepository;

@Component
public class ElkBootstrap implements ApplicationListener<ContextRefreshedEvent>{
	
	StatusRepository statusRepository;
	
	public ElkBootstrap(StatusRepository statusRepository) {
		this.statusRepository = statusRepository;
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent arg0) {
		System.out.println("ElkBootstrap");
		Status s1 = new Status("RT-TTN9999", "10.99.9.99",0,1,1,"Test123");
		s1.setTimeStamp((new Date().getTime()));
		statusRepository.save(s1);
		Status s2 = new Status("RT-TTN9998", "10.99.9.98",0,1,1,"Test123");
		s2.setTimeStamp((new Date().getTime()));
		statusRepository.save(s2);
		Status s3 = new Status("RT-TTN9998", "10.99.9.97",0,1,1,"Test123");
		s3.setTimeStamp((new Date().getTime()));
		statusRepository.save(s3);
	}

}
