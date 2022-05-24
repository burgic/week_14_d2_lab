package com.codeclan.example.Employee.One.To.Many;

import models.Department;
import models.Employee;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import repositories.DepartmentRepository;
import repositories.EmployeeRepository;
import repositories.ProjectRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
class EmployeeOneToManyApplicationTests {

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	ProjectRepository projectRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployeeAndDepartment() {
		Department department = new Department("Staples");
		departmentRepository.save(department);

		Employee employee = new Employee("Judith", "Sparrow", 13, department);
		departmentRepository.save(department);

	}

}
