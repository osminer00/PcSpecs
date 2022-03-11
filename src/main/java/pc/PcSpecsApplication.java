package pc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import pc.beans.Hardware;
import pc.controller.BeanConfiguration;
import pc.repository.HardwareRepository;
import pc.UserInput;

@SpringBootApplication
public class PcSpecsApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(PcSpecsApplication.class, args);
		
	}
	
	@Autowired
	HardwareRepository hr;
	
	
	@Override
	public void run(String... args) throws Exception{
		ApplicationContext ac = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		Hardware h1 = ac.getBean("hardware", Hardware.class);
		hr.save(h1);
		UserInput u = new UserInput();
		
		//User Input through command line
		System.out.println("Enter a Graphics Card (GPU): ");
		String gpu = u.inputString();
		System.out.println("Enter a Processor (CPU): ");
		String cpu= u.inputString();
		System.out.println("Enter your total amount of Memory (gb): ");
		int memory = u.inputInt();
		System.out.println("Enter your total amount of Storage (gb): ");
		int storage = u.inputInt();;
		
		Hardware h2 = new Hardware(gpu, cpu, memory, storage);
		hr.save(h2);
		
		List<Hardware> pcs = hr.findAll();
		
		for(Hardware i: pcs) {
			System.out.println(i.toString());
		}
		((AbstractApplicationContext) ac).close();
	}
	
}
