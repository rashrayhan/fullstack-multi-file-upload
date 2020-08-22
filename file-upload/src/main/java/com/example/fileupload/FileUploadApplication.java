package com.example.fileupload;

import com.example.fileupload.service.FilesStorageService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;

@SpringBootApplication
public class FileUploadApplication implements CommandLineRunner {
  @Resource
  FilesStorageService storageService;


  public static void main(String[] args) {
		SpringApplication.run(FileUploadApplication.class, args);
	}

  @Override
  public void run(String... arg) throws Exception {
    storageService.deleteAll();
    storageService.init();
  }
}
