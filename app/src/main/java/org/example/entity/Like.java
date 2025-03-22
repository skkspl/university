package org.example.entity;

public class Like {
    private int id;
    private int postId;
    private int userId;
    private String createdAt;

    public Like(int id, int postId, int userId, String createdAt) {
        this.id = id;
        this.postId = postId;
        this.userId = userId;
        this.createdAt = createdAt;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public int getPostId() { return postId; }
    public void setPostId(int postId) { this.postId = postId; }
    public int getUserId() { return userId; }
    public void setUserId(int userId) { this.userId = userId; }
    public String getCreatedAt() { return createdAt; }
    public void setCreatedAt(String createdAt) { this.createdAt = createdAt; }
}
