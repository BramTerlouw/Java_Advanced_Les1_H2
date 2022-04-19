package nl.inholland.INF2aLes1H2;

import nl.inholland.INF2aLes1H2.model.Person;
import nl.inholland.INF2aLes1H2.repository.PersonRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Inf2aLes1H2Application {

	public static void main(String[] args) {

		ConfigurableApplicationContext configurableApplicationContext =
				SpringApplication.run(Inf2aLes1H2Application.class, args);

		PersonRepository personRepository =
				configurableApplicationContext.getBean(PersonRepository.class);

		Person myPerson = new Person("Bram", "Terlouw");
		personRepository.save(myPerson);
	}

}
