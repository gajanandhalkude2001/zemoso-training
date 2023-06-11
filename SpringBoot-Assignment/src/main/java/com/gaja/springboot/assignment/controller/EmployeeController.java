package com.gaja.springboot.assignment.controller;

import java.util.List;
import java.util.stream.Collectors;

import com.gaja.springboot.assignment.entity.Project;
import com.gaja.springboot.assignment.service.ProjectService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.gaja.springboot.assignment.entity.Employee;
import com.gaja.springboot.assignment.service.EmployeeService;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

	private EmployeeService employeeService;
	private ProjectService projectService;

	public EmployeeController(EmployeeService theEmployeeService,ProjectService projectService)
	{
		super();
		this.employeeService = theEmployeeService;
		this.projectService=projectService;
	}

	// add mapping for "/list"

	@GetMapping("/list")
	public String listEmployees(Model theModel) {

		// get employees from db
		List<Employee> theEmployees = employeeService.findAll();
		// add to the spring model
		theModel.addAttribute("employees", theEmployees);

		return "employees/list-employees";
	}
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {

		// create model attribute to bind form data
		Employee theEmployee = new Employee();
		List<Project> theProjects = projectService.findAll();

		theModel.addAttribute("employee", theEmployee);
		theModel.addAttribute("project", theProjects);

		return "employees/employee-form";
	}
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("employeeId") int theId,
									Model theModel) {

		Employee theEmployee = employeeService.findById(theId);
		List<Project> allProjects = projectService.findAll();

		theModel.addAttribute("employee", theEmployee);
		theModel.addAttribute("project", allProjects);

		// send over to our form
		return "employees/employee-form";
	}

@PostMapping("/save")
public String saveEmployee(@ModelAttribute("employee") Employee theEmployee,
						   @RequestParam("projectId") int projectId) {

	Project theProject = projectService.findById(projectId);
	theEmployee.setProject(theProject);

	employeeService.save(theEmployee);

	return "redirect:/employees/list";
}
	@GetMapping("/delete")
	public String delete(@RequestParam("employeeId") int theId){
		employeeService.deleteById(theId);
		return "redirect:/employees/list";
	}

}












