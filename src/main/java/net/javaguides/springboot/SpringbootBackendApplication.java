package net.javaguides.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.javaguides.springboot.repository.EmployeeRepository;
import net.javaguides.springboot.entity.Employee;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
		Employee employee1 = Employee.builder()
		.firstName("Matt")
		.lastName("Kopelowitz")
		.email("mkopelowitz@test.com")
		.build();

		Employee employee2 = Employee.builder()
		.firstName("Tony")
		.lastName("Stark")
		.email("tony@avengers.com")
		.build();

		Employee employee3 = Employee.builder()
		.firstName("John")
		.lastName("Smith")
		.email("john@smith.com")
		.build();

		employeeRepository.save(employee1);
		employeeRepository.save(employee2);
		employeeRepository.save(employee3);
	}

}
