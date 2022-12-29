package com.AxisSaral.controller;

import java.util.List;

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

import com.AxisSaral.model.Image;
import com.AxisSaral.repository.ImageRepository;
import com.AxisSaral.service.ImageService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/image")
public class ImageController {
	
	@Autowired
    private ImageRepository ImageRepo;

    @Autowired
    private ImageService docStorageService;

    @PostMapping("/uploadFiles")
    public String uploadMultipleFiles(@RequestParam("file") MultipartFile file) {

            docStorageService.saveFile(file);

        return "successfully uploaded:/";
    }

    @PostMapping("/upload")
    public Image addImage(@RequestBody Image Image){
        return ImageRepo.save(Image);
    }

    @GetMapping("/downloadFile/{fileId}")
    public ResponseEntity<ByteArrayResource> downloadFile(@PathVariable Long fileId){
        Image doc = docStorageService.getFile(fileId).get();
        return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType(doc.getDocType()))
                .header(HttpHeaders.CONTENT_DISPOSITION,"attachment:filename=\""+doc.getDocName()+"\"")
                .body(new ByteArrayResource(doc.getData()));
    }
    

    @GetMapping("/view/{id}")
    public Image viewImage(@PathVariable Long id){
        List<Image> blob = ImageRepo.findAll();
        return blob.stream().filter(b -> b.getId().equals(id)).findAny().orElse(null);
    }
}

