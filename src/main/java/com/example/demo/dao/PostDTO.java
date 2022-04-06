package com.example.demo.dao;

public class PostDTO {
    private int id;
    private int userid;
    private String title;
    private String body ;

    @Override
    public String toString() {
        return "PostDTO{" +
                "id=" + id +
                ", userid=" + userid +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public PostDTO() {
    }

    public PostDTO(int id, int userid, String title, String body) {
        this.id = id;
        this.userid = userid;
        this.title = title;
        this.body = body;
    }
}
