package com.AxisSaral.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.AxisSaral.model.Newsfeed;
import com.AxisSaral.repository.NewsfeedRepository;
import com.AxisSaral.service.NewsfeedService;


@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/image")
public class NewsfeedController {

	@Autowired
    private NewsfeedRepository newsfeedrepo;

    @Autowired
    private NewsfeedService docStorageService;

    @PostMapping("/Newsfeed")
    public String uploadMultipleFiles(@RequestParam("file") MultipartFile file){

            docStorageService.saveFile(file);

        return "successfully uploaded:/";
    }

    @PostMapping("/News")
    public Newsfeed addNewsfeed(@RequestBody Newsfeed newsfeed){
        return newsfeedrepo.save(newsfeed);
    }

    @GetMapping("/downloadNewsfeed/{fileId}")
    public ResponseEntity<ByteArrayResource> downloadFile(@PathVariable Long fileId){
        Newsfeed doc = docStorageService.getFile(fileId).get();
        return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType(doc.getNewsfeedtype()))
                .header(HttpHeaders.CONTENT_DISPOSITION,"attachment:filename=\""+doc.getNewsfeedname()+"\"")
                .body(new ByteArrayResource(doc.getData()));
    }
    @GetMapping("/downloadNewsfeed/getFiles")
    public ResponseEntity<ByteArrayResource> downloadFiles(@PathVariable Long files){
        Newsfeed doc = docStorageService.getAll(files).get();
        return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType(doc.getNewsfeedtype()))
                .header(HttpHeaders.CONTENT_DISPOSITION,"attachment:filename=\""+doc.getNewsfeedname()+"\"")
                .body(new ByteArrayResource(doc.getData()));
    }
  
}

