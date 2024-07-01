package com.wk.project.service;

import org.springframework.web.multipart.MultipartFile;

public interface ImporterService {
     void importMultipleData(MultipartFile file);
}
