package com.codingshuttle.linkedInProject.postsService.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@FeignClient(name = "uploader-service", path = "/uploads/file")
public interface UploaderServiceClient {

    @PostMapping
    ResponseEntity<String> uploadFile(@RequestParam MultipartFile file);
}
