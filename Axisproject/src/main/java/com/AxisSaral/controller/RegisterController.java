package com.AxisSaral.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AxisSaral.model.Register;
import com.AxisSaral.service.RegisterService;



@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/signup")
public class RegisterController {

	@Autowired
	RegisterService registerService;
	
	@PostMapping("/submit")
	private String add(@RequestBody Register register) {
		registerService.save(register);
		return "Registration successful";
	}
	
	@GetMapping("/getall")
    public List<Register> list(){
        return registerService.getAll();
    }
}
