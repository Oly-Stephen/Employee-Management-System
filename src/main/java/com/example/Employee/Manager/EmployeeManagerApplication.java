package com.example.Employee.Manager;

import com.example.Employee.Manager.entity.Employee;
import com.example.Employee.Manager.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeManagerApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagerApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
//		Employee employee1 = new Employee("Oly Stephen", "Male", "oly@gmail.com", "Developer", 1234567890L);
//		employeeRepository.save(employee1);

//		Employee employee2 = new Employee("Micheal Prof", "Male", "prof@gmail.com", "Hacker", 1234567890L);
//		employeeRepository.save(employee2);
//
//		Employee employee3 = new Employee("Charlotte Kamari", "Female", "kamari@gmail.com", "Sales", 1234567890L);
//		employeeRepository.save(employee3);
	}
}