package com.green.day24;

public class BoardEntity {
    private int iboard;
    private String title;
    private String ctnts;
    private String writer;
    private String createdAt;
    private String updatedAt;



    public int getIboard() {
        return iboard;
    }

    public void setIboard(int iboard) {
        this.iboard = iboard;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCtnts() {
        return ctnts;
    }

    public void setCtnts(String ctnts) {
        this.ctnts = ctnts;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String cratedAt) {
        this.createdAt = cratedAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }
    public String toString() {
        return String.format("%d,%s,%s,%s,%s", iboard,title,ctnts,writer,createdAt);
    }
}


/* 생성자
public class BoardEntity2 {
    private int iboard;
    private String title;
    private String ctnts;
    private String writer;
    private String cratedAt;
    private String updatedAt;

    BoardEntity2(String title, String ctnts, String writer) {

        this.title = title;
        this.ctnts = ctnts;
        this.writer = writer;
    }
}*/
