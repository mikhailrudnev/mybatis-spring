package com.msh.bean;

public class Comment {
    private String description;

    public Comment() {}

    public Comment(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "description='" + description + '\'' +
                '}';
    }
}
