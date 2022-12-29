package com.AxisSaral.service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.AxisSaral.model.Image;
import com.AxisSaral.repository.ImageRepository;

@Service
public class ImageService {

	@Autowired
	private ImageRepository docRepository;
	
	public Image saveFile(MultipartFile file) {
        String docname = file.getOriginalFilename();
        try {
        	Image doc = new Image(null, docname,file.getContentType(),docname, file.getBytes());
            return docRepository.save(doc);
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public Optional<Image> getFile(Long fileId) {
        return docRepository.findById(fileId);
    }
    public List<Image> getFiles(){
        return docRepository.findAll();
    }
}
