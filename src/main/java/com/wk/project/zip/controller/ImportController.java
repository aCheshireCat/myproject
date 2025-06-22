package com.wk.project.zip.controller;

import com.wk.project.zip.service.ImportService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RequestMapping("/import")
@RestController("ImportController")
@Slf4j
public class ImportController {

    @Autowired
    private ImportService importService;
    @PostMapping("/importData")
    public String importData(@RequestParam("file") MultipartFile file) {
        importService.importData(file);
        return "ok";
    }
}
