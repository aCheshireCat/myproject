package com.wk.project.zip.service.impl;

import cn.net.drm.edi.exception.DrmException;
import com.wk.project.zip.service.ImportService;
import in.org.apache.commons.compress.archivers.ArchiveEntry;
import in.org.apache.commons.compress.archivers.zip.ZipArchiveInputStream;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;


@Service
@Slf4j
public class ImportServiceImpl implements ImportService {
    @Override
    @SneakyThrows(value = Exception.class)
    public void importData(MultipartFile file) {

        try{
            List<InputStream> inputStreamList = uncompressFile(file);
            



        } catch (Exception e) {
            log.error("读取文件流失败", e);
            throw new Exception("读取文件流失败", e);
        }
    }



    @SneakyThrows(value = IOException.class)
    private List<InputStream> uncompressFile(MultipartFile file) {

        List<InputStream> inputStreamList = new ArrayList<>();

        try( ZipArchiveInputStream zipInputStream = new ZipArchiveInputStream(file.getInputStream())) {
            ArchiveEntry archiveEntry;
            while((archiveEntry=zipInputStream.getNextEntry())!= null && !archiveEntry.isDirectory()){
                String fileName = archiveEntry.getName();
                log.info("archiveEntry = "+archiveEntry);
                log.debug("archiveEntry.isDirectory() = "+archiveEntry.isDirectory());


                ByteArrayOutputStream bos = new ByteArrayOutputStream();
                byte[] buffer = new byte[1024];
                int len;
                while((len = zipInputStream.read(buffer))>0 ){
                    bos.write(buffer,0,len);
                }
                log.debug("解压文件["+fileName + "]:" + bos.size());

                inputStreamList.add(new ByteArrayInputStream(bos.toByteArray()));
                bos.flush();
                bos.close();
            }
        } catch (IOException e) {
            throw new IOException("文件解压失败："+e.getMessage(), e);
        }

        return inputStreamList;
    }



}
