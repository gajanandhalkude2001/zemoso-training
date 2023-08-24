package com.gaja.springboot.assignment.controller;

import com.gaja.springboot.assignment.entity.Employee;
import com.gaja.springboot.assignment.entity.Project;
import com.gaja.springboot.assignment.service.EmployeeService;
import com.gaja.springboot.assignment.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/projects")
public class ProjectController {

    ProjectService projectService;
    EmployeeService employeeService;
    public ProjectController(ProjectService theProjectService,EmployeeService employeeService) {
        super();
        this.projectService = theProjectService;
        this.employeeService = employeeService;
    }
    @GetMapping("/list")
    public String projectsList(Model theModel)
    {
        List<Project> theProjects = projectService.findAll();
        theModel.addAttribute("projects" , theProjects);
        return "projects/list-projects";
    }
    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model theModel) {
        Project theProject = new Project();
        List<Employee> employees = employeeService.findAll();

        theModel.addAttribute("project", theProject);
        theModel.addAttribute("employees", employees);

        return "projects/project-form";
    }

@GetMapping("/showFormForUpdate")
public String showFormForUpdate(@RequestParam("projectId") int theId, Model theModel) {
    Project theProject = projectService.findById(theId);
    List<Employee> employees = employeeService.findAll();

    theModel.addAttribute("project", theProject);
    theModel.addAttribute("employees", employees);

    return "projects/project-form";
}

    @PostMapping("/save")
    public String save(@ModelAttribute("project") Project theProject) {
        projectService.save(theProject);
        return "redirect:/projects/list";
    }


    @GetMapping("/delete")
    public String delete(@RequestParam("projectId") int theId){
        projectService.deleteById(theId);
        return "redirect:/projects/list";
    }
}
