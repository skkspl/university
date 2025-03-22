package org.example.entity;

public class ChatRoom {
    private int id;
    private int bookId;
    private String name;
    private String description;
    private int creatorId;

    public ChatRoom(int id, int bookId, String name, String description, int creatorId) {
        this.id = id;
        this.bookId = bookId;
        this.name = name;
        this.description = description;
        this.creatorId = creatorId;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public int getBookId() { return bookId; }
    public void setBookId(int bookId) { this.bookId = bookId; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public int getCreatorId() { return creatorId; }
    public void setCreatorId(int creatorId) { this.creatorId = creatorId; }
}
