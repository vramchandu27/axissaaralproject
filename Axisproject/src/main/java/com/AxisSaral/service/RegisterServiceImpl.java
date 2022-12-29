package com.AxisSaral.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AxisSaral.model.Register;
import com.AxisSaral.repository.RegisterRepository;



@Service
public class RegisterServiceImpl implements RegisterService{

	@Autowired
	private RegisterRepository registerRepository;
	
	public Register save(Register register) {
		return registerRepository.save(register);
	}
	
	public List<Register> getprofile() {
		return registerRepository.findAll();
	}

	@Override
	public List<Register> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
