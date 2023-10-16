package com.wk.project.drm;

import cn.net.drm.edi.client.DrmAgent;
import cn.net.drm.edi.exception.DrmException;
import cn.net.drm.io.IOUtils;
import org.junit.Test;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StreamTest {

    private static final String EXCEL = ".xlsx";
    private static final String DOCX = ".docx";
    private static final String DOC = ".doc";
    private static final String PDF = ".pdf";
    private static final String PNG = ".png";
    @Test
    public void testVerifyApiKey() throws DrmException {
        System.out.println(DrmAgent.getInstance().verifyApiKey("d26720bad600fffc2ee5794f6f01ae8d1"));
    }

    /**
     * 加密
     * @throws DrmException
     */
    @Test
    public void testEncryptBasicInputStream() throws DrmException {
        InputStream fis = null;
        OutputStream fos = null;
        try {
            long start = System.currentTimeMillis();
            fis = new FileInputStream(new File("d:\\加密解密区\\LONGI开发平台说明V1.1（汇总）.docx"));
            BufferedInputStream bis = new BufferedInputStream(fis);
            byte[] header = new byte[256];

            bis.mark(256);
            bis.read(header);
            bis.reset();

            boolean isEncryptFile = DrmAgent.getInstance().isEncrypted(header);

            if (!isEncryptFile) {
                fis = DrmAgent.getInstance().encryptBasicStream(bis, "test", 5);
            }
            fos = new FileOutputStream("d:\\LONGI开发平台说明V1.1（汇总）-enc.docx");
            int len = 0;
            byte[] buffer = new byte[4096];
            while ((len = fis.read(buffer)) > 0) {
                fos.write(buffer, 0, len);
            }
            System.out.println("used:" + (System.currentTimeMillis() - start));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            IOUtils.closeQuietly(fis);
            IOUtils.closeQuietly(fos);
        }
    }

    /**
     * 解密
     * @throws DrmException
     */
    @Test
    public void testDecryptInputStream() throws DrmException {
        InputStream fis = null;
        OutputStream fos = null;
        try {
            long start = System.currentTimeMillis();
            String fileName = "扩展";
            String fileType = EXCEL;
            String pathName = "D:\\加密解密区\\";
            String dateStr = new SimpleDateFormat("yyyyMMdd").format(new Date());

            fis = new FileInputStream(new File(pathName +fileName +fileType));

            BufferedInputStream bis = new BufferedInputStream(fis);
            byte[] header = new byte[256];

            bis.mark(256);
            bis.read(header);
            bis.reset();

            boolean isEncryptFile = DrmAgent.getInstance().isEncrypted(header);

            if (isEncryptFile) {
                fis = DrmAgent.getInstance().decrypt(bis);
            }
//            fos = new FileOutputStream(pathName +fileName +"-decode"+fileType);
            fos = new FileOutputStream(pathName +fileName + "_" + dateStr + "." + fileType);
            int len = 0;
            byte[] buffer = new byte[4096];
            while ((len = fis.read(buffer)) > 0) {
                fos.write(buffer, 0, len);
            }
            System.out.println("used:" + (System.currentTimeMillis() - start));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            IOUtils.closeQuietly(fis);
            IOUtils.closeQuietly(fos);
        }
    }
}
