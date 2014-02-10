package com.msh.bean;


import java.util.List;

public class Article {
    private String title;
    private User user;
    private List<Comment> comments;

    public Article() {}

    public Article(String title, User user, List<Comment> comments) {
        this.title = title;
        this.user = user;
        this.comments = comments;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Article{" +
                "title='" + title + '\'' +
                ", user=" + user +
                ", comments=" + comments +
                '}';
    }
}
