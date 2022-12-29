package com.AxisSaral.service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;


import com.AxisSaral.model.Products;
import com.AxisSaral.repository.ProductsRepository;

@Service
public class ProductService {

	
	@Autowired
	private ProductsRepository docRepository;
	
	public Products saveFile(MultipartFile file) {
        String docname = file.getOriginalFilename();
        try {
        	Products doc = new Products(null, docname,file.getContentType(),docname, file.getBytes());
            return docRepository.save(doc);
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public Optional<Products> getFile(Long fileId) {
        return docRepository.findById(fileId);
    }
    public List<Products> getFiles(){
        return docRepository.findAll();
    }
}

