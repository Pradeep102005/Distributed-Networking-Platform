package com.codingshuttle.linkedInProject.uploader_service.service;

import com.google.cloud.storage.BlobInfo;
import com.google.cloud.storage.Storage;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.UUID;

//@Service
@RequiredArgsConstructor
public class GoogleCloudStorageUploaderService implements UploaderService{

    private final Storage storage;

    @Value("${gcloud.storage-bucket-name}")
    private String bucketName;

    @Override
    public String upload(MultipartFile file) {
        String fileName = UUID.randomUUID() + "-" + file.getOriginalFilename();
        BlobInfo blobInfo = BlobInfo.newBuilder(bucketName, fileName).build();
        try {
            storage.create(blobInfo, file.getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return String.format("https://storage.googleapis.com/%s/%s", bucketName, fileName);
    }
}
