package com.AxisSaral.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AxisSaral.model.Project;
import com.AxisSaral.model.Register;
import com.AxisSaral.repository.ProjectRepository;
import com.AxisSaral.repository.RegisterRepository;

@Service
public class ProjectServiceImpl implements ProjectService{

	
	@Autowired
	private ProjectRepository projectRepository;
	
	public Project save(Project project) {
		return projectRepository.save(project);
	}
	
	public List<Project> getprofile() {
		return projectRepository.findAll();
	}

	@Override
	public List<Project> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
