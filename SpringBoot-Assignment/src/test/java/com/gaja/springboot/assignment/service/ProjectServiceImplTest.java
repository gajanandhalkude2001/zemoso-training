package com.gaja.springboot.assignment.service;
import com.gaja.springboot.assignment.dao.ProjectRepository;
import com.gaja.springboot.assignment.entity.Project;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

class ProjectServiceImplTest {

    @Mock
    private ProjectRepository projectRepository;

    @InjectMocks
    private ProjectServiceImpl projectService;

    @BeforeEach
    void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testFindAll() {
        // Create a list of projects for testing
        List<Project> projects = new ArrayList<>();
        projects.add(new Project(1, "Project 1"));
        projects.add(new Project(2, "Project 2"));

        // Stub the behavior of projectRepository.findAll() method
        when(projectRepository.findAll()).thenReturn(projects);

        // Call the method under test
        List<Project> result = projectService.findAll();

        // Verify the result
        assertEquals(projects, result);
        verify(projectRepository, times(1)).findAll();
    }

    @Test
    void testFindById() {
        int projectId = 1;
        Project project = new Project(projectId, "Project 1");

        // Stub the behavior of projectRepository.findById() method
        when(projectRepository.findById(projectId)).thenReturn(Optional.of(project));

        // Call the method under test
        Project result = projectService.findById(projectId);

        // Verify the result
        assertEquals(project, result);
        verify(projectRepository, times(1)).findById(projectId);
    }

    @Test
    void testFindById_NotFound() {
        int projectId = 1;

        // Stub the behavior of projectRepository.findById() method
        when(projectRepository.findById(projectId)).thenReturn(Optional.empty());

        // Call the method under test and assert that it throws a RuntimeException
        assertThrows(RuntimeException.class, () -> projectService.findById(projectId));

        verify(projectRepository, times(1)).findById(projectId);
    }

    @Test
    void testSave() {
        Project project = new Project(1, "Project 1");

        // Call the method under test
        projectService.save(project);

        // Verify that projectRepository.save() method is called once
        verify(projectRepository, times(1)).save(project);
    }

    @Test
    void testDeleteById() {
        int projectId = 1;

        // Call the method under test
        projectService.deleteById(projectId);

        // Verify that projectRepository.deleteById() method is called once
        verify(projectRepository, times(1)).deleteById(projectId);
    }
}
