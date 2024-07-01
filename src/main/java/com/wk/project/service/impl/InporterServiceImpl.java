package com.wk.project.service.impl;

import com.longi.msp.common.utils.FileContentTypeUtil;
import com.longi.msp.common.utils.FileNameUtils;
import com.wk.project.service.ImporterService;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;

/**
*@Auther weikai2
*@Date 2023/12/19
*@Description
*
**/
public class InporterServiceImpl implements ImporterService {


    @Override
    public void importMultipleData(MultipartFile file) {


        try {
            InputStream is = file.getInputStream();

            String fileType = FileContentTypeUtil.getMimeType(is);

            System.out.println(fileType);













        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}


