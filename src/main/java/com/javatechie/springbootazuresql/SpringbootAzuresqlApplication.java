package com.javatechie.springbootazuresql;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@RestController
public class SpringbootAzuresqlApplication {

	@Autowired
	public EmployeeRepository repository;

	@PostMapping("/employee")
	public Employee addEmployee(@RequestBody Employee employee) {
		return repository.save(employee);
	}

	@GetMapping("/employees")
	public List<Employee> getEmployees() {
		return repository.findAll();
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootAzuresqlApplication.class, args);
	}

}
