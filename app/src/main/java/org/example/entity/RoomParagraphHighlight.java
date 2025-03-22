package org.example.entity;

public class RoomParagraphHighlight {
    private int roomId;
    private int paragraphId;
    private int userId;
    private String color;

    public RoomParagraphHighlight(int roomId, int paragraphId, int userId, String color) {
        this.roomId = roomId;
        this.paragraphId = paragraphId;
        this.userId = userId;
        this.color = color;
    }

    // Getters and Setters
    public int getRoomId() { return roomId; }
    public void setRoomId(int roomId) { this.roomId = roomId; }
    public int getParagraphId() { return paragraphId; }
    public void setParagraphId(int paragraphId) { this.paragraphId = paragraphId; }
    public int getUserId() { return userId; }
    public void setUserId(int userId) { this.userId = userId; }
    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
}
