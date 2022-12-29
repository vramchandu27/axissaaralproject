package com.AxisSaral.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AxisSaral.model.Project;
import com.AxisSaral.service.ProjectService;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/project")
public class ProjectController {

	@Autowired
	ProjectService projectService;
	
	@PostMapping("/submitproject")
	private String add(@RequestBody Project project) {
		projectService.save(project);
		return "Project Uploaded successful";
	}
	
	@GetMapping("/getAllprojects")
    public List<Project> list(){
        return projectService.getAll();
    }
}
