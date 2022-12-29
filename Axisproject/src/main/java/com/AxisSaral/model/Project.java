package com.AxisSaral.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Project {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String projecttitle;
	private String projectdesc;
	private String projectmanager;
	private String projectdomain;
	private String empworking;
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Project(long id, String projecttitle, String projectdesc, String projectmanager, String projectdomain,
			String empworking) {
		super();
		this.id = id;
		this.projecttitle = projecttitle;
		this.projectdesc = projectdesc;
		this.projectmanager = projectmanager;
		this.projectdomain = projectdomain;
		this.empworking = empworking;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getProjecttitle() {
		return projecttitle;
	}
	public void setProjecttitle(String projecttitle) {
		this.projecttitle = projecttitle;
	}
	public String getProjectdesc() {
		return projectdesc;
	}
	public void setProjectdesc(String projectdesc) {
		this.projectdesc = projectdesc;
	}
	public String getProjectmanager() {
		return projectmanager;
	}
	public void setProjectmanager(String projectmanager) {
		this.projectmanager = projectmanager;
	}
	public String getProjectdomain() {
		return projectdomain;
	}
	public void setProjectdomain(String projectdomain) {
		this.projectdomain = projectdomain;
	}
	public String getEmpworking() {
		return empworking;
	}
	public void setEmpworking(String empworking) {
		this.empworking = empworking;
	}
	
	
}
