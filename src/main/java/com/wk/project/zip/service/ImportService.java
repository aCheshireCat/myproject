package com.wk.project.zip.service;

import org.springframework.web.multipart.MultipartFile;

public interface ImportService {


    void importData(MultipartFile file);
}
