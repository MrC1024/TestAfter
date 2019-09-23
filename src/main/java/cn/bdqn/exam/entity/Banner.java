package cn.bdqn.exam.entity;

import org.springframework.web.multipart.MultipartFile;

import java.awt.image.MultiPixelPackedSampleModel;
import java.net.MulticastSocket;

public class Banner {
    private Integer banId;
    private String banPath;
    private String banName;
    private MultipartFile file;
    private  Integer ifSel;

    public Integer getIfSel() {
        return ifSel;
    }

    public void setIfSel(Integer ifSel) {
        this.ifSel = ifSel;
    }

    public Integer getBanId() {
        return banId;
    }

    public void setBanId(Integer banId) {
        this.banId = banId;
    }

    public String getBanPath() {
        return banPath;
    }

    public void setBanPath(String banPath) {
        this.banPath = banPath;
    }

    public String getBanName() {
        return banName;
    }

    public void setBanName(String banName) {
        this.banName = banName;
    }

    public MultipartFile getFile() {
        return file;
    }

    public void setFile(MultipartFile file) {
        this.file = file;
    }
}