package demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import demo.beans.Laptop;
import demo.beans.Specification;
import demo.controller.BeanConfiguration;
import demo.repository.LaptopRepository;

@SpringBootApplication
public class Wk8SpringLaptopsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Wk8SpringLaptopsApplication.class, args);
	}
	
	@Autowired
	LaptopRepository repo;

	@Override
	public void run(String... args) throws Exception {
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		// Managed by Spring
		Laptop laptop1 = appContext.getBean("laptop", Laptop.class);
		laptop1.setModel("XPS 13");
		repo.save(laptop1);
				
		// Not managed by Spring
		Laptop l = new Laptop("Dell", "XSP 15");
		Specification s = new Specification("i7-11800H", "Windows 11 Home", "NVIDIA GeForce RTX 3050 Ti", 16, 512);
		l.setSpecification(s);
		repo.save(l);
				
		List<Laptop> allMyContacts = repo.findAll();
		for(Laptop people: allMyContacts) {
			System.out.println(people.toString());
		}
				
		((AbstractApplicationContext) appContext).close();
		
	}

}
