 package com.AxisSaral.service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.AxisSaral.model.Newsfeed;

import com.AxisSaral.repository.NewsfeedRepository;



@Service
public class NewsfeedService {

	@Autowired
	private NewsfeedRepository docRepository;
	
	public Newsfeed saveFile(MultipartFile file) {
        String docname = file.getOriginalFilename();
        try {
        	Newsfeed doc = new Newsfeed(null, docname,file.getContentType(),docname, file.getBytes());
            return docRepository.save(doc);
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public Optional<Newsfeed> getFile(Long fileId) {
        return docRepository.findById(fileId);
    }
    public List<Newsfeed> getFiles(){
        return docRepository.findAll();
    }
	public Optional<Newsfeed> getAll(Long fileId) {
		// TODO Auto-generated method stub
		return null;
	}
}

