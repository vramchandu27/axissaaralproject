package com.AxisSaral.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.AxisSaral.model.Project;


@Repository
public interface ProjectRepository extends JpaRepository <Project, Long> {

}
