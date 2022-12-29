package com.AxisSaral.service;

import java.util.List;

import com.AxisSaral.model.Register;


public interface RegisterService {

	public Register save(Register register);
	public List<Register> getprofile();
	public List<Register> getAll();

}
