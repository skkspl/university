package org.example.entity;

public class Comment {
    private int id;
    private int postId;
    private int userId;
    private String text;
    private String creationDate;

    public Comment(int id, int postId, int userId, String text, String creationDate) {
        this.id = id;
        this.postId = postId;
        this.userId = userId;
        this.text = text;
        this.creationDate = creationDate;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public int getPostId() { return postId; }
    public void setPostId(int postId) { this.postId = postId; }
    public int getUserId() { return userId; }
    public void setUserId(int userId) { this.userId = userId; }
    public String getText() { return text; }
    public void setText(String text) { this.text = text; }
    public String getCreationDate() { return creationDate; }
    public void setCreationDate(String creationDate) { this.creationDate = creationDate; }
}
