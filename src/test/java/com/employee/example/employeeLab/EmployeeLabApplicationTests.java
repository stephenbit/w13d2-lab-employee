package com.employee.example.employeeLab;

import com.employee.example.employeeLab.models.Department;
import com.employee.example.employeeLab.models.Employee;
import com.employee.example.employeeLab.models.Project;
import com.employee.example.employeeLab.repositories.DepartmentRepository;
import com.employee.example.employeeLab.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class EmployeeLabApplicationTests {

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	EmployeeRepository employeeRepository;

	Department department;
	Employee employee1;
	Project project;

	@Test
	void contextLoads() {
	}

	@Test
	public void createDepartment() {
		department = new Department("Bean");
		departmentRepository.save(department);
	}

	@Test
	public void createProject() {
		project = new Project("Bean Project", 123, );
		departmentRepository.save(department);
	}

	@Test
	public void createEmployee() {
		department = new Department("Bean");
		employee1 = new Employee(
				"Silvia",
				"Jones",
				"999",
				department
		);
		departmentRepository.save(department);
		employeeRepository.save(employee1);
	}

}
