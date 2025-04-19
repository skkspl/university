package org.library.entity;

public class Note {
    private Integer id;
    private Integer paragraphId;
    private Integer userId;
    private String text;
    private String creationDate;

    public Note() {
    }


    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public int getParagraphId() { return paragraphId; }
    public void setParagraphId(int paragraphId) { this.paragraphId = paragraphId; }
    public int getUserId() { return userId; }
    public void setUserId(int userId) { this.userId = userId; }
    public String getText() { return text; }
    public void setText(String text) { this.text = text; }
    public String getCreationDate() { return creationDate; }
    public void setCreationDate(String creationDate) { this.creationDate = creationDate; }
}
