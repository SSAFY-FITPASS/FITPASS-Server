package com.ssafy.fitpass.photo;

public class Photo {
    private int id;
    private String uploadFileName, storeFileName, saveFolder;

    public Photo() {}

    public Photo(String uploadFileName, String storeFileName, String saveFolder) {
        setSaveFolder(saveFolder);
        setStoreFileName(storeFileName);
        setUploadFileName(uploadFileName);
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUploadFileName(String uploadFileName) {
        this.uploadFileName = uploadFileName;
    }

    public void setStoreFileName(String storeFileName) {
        this.storeFileName = storeFileName;
    }

    public void setSaveFolder(String saveFolder) {
        this.saveFolder = saveFolder;
    }

    public int getId() {
        return id;
    }

    public String getUploadFileName() {
        return uploadFileName;
    }

    public String getStoreFileName() {
        return storeFileName;
    }

    public String getSaveFolder() {
        return saveFolder;
    }

    @Override
    public String toString() {
        return "Photo{" +
                "id=" + id +
                ", uploadFileName='" + uploadFileName + '\'' +
                ", storeFileName='" + storeFileName + '\'' +
                ", saveFolder='" + saveFolder + '\'' +
                '}';
    }
}