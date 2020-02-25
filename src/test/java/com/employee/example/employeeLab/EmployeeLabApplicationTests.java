package com.employee.example.employeeLab;

import models.Department;
import models.Employee;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import repositories.DepartmentRepository;
import repositories.EmployeeRepository;

@SpringBootTest
class EmployeeLabApplicationTests {

	@Autowired
	DepartmentRepository departmentRepository;
	EmployeeRepository employeeRepository;

	Department department;
	Employee employee1;
	Employee employee2;

	@Before
	public void before() {
		department = new Department("Java");
		employee1 = new Employee(
				"Silvia",
				"Jones",
				"999",
				department
		);
		employee1 = new Employee(
				"Stephen",
				"Yollop",
				"998",
				department
		);
	}


	@Test
	void contextLoads() {
	}

	@Test
	public void createDepartment() {
		DepartmentRepository.save(employee1);
		DepartmentRepository.save(employee2);
	}

	@Test
	public void createEmployee() {

	}

}
