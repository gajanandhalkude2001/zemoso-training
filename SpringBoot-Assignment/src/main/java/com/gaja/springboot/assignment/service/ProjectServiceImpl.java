package com.gaja.springboot.assignment.service;

import com.gaja.springboot.assignment.dao.ProjectRepository;
import com.gaja.springboot.assignment.entity.Project;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProjectServiceImpl implements ProjectService {

    private ProjectRepository projectRepository;

//    @Autowired
    public ProjectServiceImpl(ProjectRepository theProjectRepository) {
        super();
        this.projectRepository = theProjectRepository;
    }

    @Override
    public List<Project> findAll() {
        return projectRepository.findAll();
    }

    @Override
    public Project findById(int theId) {
        Optional<Project> result = projectRepository.findById(theId);
        Project theProject  ;
        if (result.isPresent()) {
            theProject = result.get();
        }
        else {
            // we didn't find the employee
            throw new RuntimeException("Did not find Project id - " + theId);
        }
        return theProject;
    }

    @Override
    public void save(Project theProject) {
    projectRepository.save(theProject);
    }

    @Override
    public void deleteById(int theId) {
        projectRepository.deleteById(theId);
    }
}
