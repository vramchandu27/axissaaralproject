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

import com.AxisSaral.model.Products;
import com.AxisSaral.repository.ProductsRepository;
import com.AxisSaral.service.ProductService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/image")
public class ProductController {

	@Autowired
    private ProductsRepository Prodrepo;

    @Autowired
    private ProductService docStorageService;

    @PostMapping("/uploadProducts")
    public String uploadMultipleFiles(@RequestParam("file") MultipartFile file){

            docStorageService.saveFile(file);

        return "successfully uploaded:/";
    }

    @PostMapping("/uploadp")
    public Products addProducts(@RequestBody Products Products){
        return Prodrepo.save(Products);
    }

    @GetMapping("/downloadProducts/{fileId}")
    public ResponseEntity<ByteArrayResource> downloadFile(@PathVariable Long fileId){
        Products doc = docStorageService.getFile(fileId).get();
        return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType(doc.getProdtype()))
                .header(HttpHeaders.CONTENT_DISPOSITION,"attachment:filename=\""+doc.getProdname()+"\"")
                .body(new ByteArrayResource(doc.getData()));
    }
}

//    @GetMapping("/view/{id}")
//    public Products viewImage(@PathVariable Long id){
//        List<Products> blob = Prodrepo.findAll();
//        return blob.stream().filter(b -> b.getId().equals(id)).findAny().orElse(null);
//    }
//}

