package org.example.entity;

public class Post {
    private int id;
    private int userId;
    private int bookId;
    private String text;
    private String creationDate;

    public Post(int id, int userId, int bookId, String text, String creationDate) {
        this.id = id;
        this.userId = userId;
        this.bookId = bookId;
        this.text = text;
        this.creationDate = creationDate;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public int getUserId() { return userId; }
    public void setUserId(int userId) { this.userId = userId; }
    public int getBookId() { return bookId; }
    public void setBookId(int bookId) { this.bookId = bookId; }
    public String getText() { return text; }
    public void setText(String text) { this.text = text; }
    public String getCreationDate() { return creationDate; }
    public void setCreationDate(String creationDate) { this.creationDate = creationDate; }
}
