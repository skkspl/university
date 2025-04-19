package org.example.entity;

public class ChatRoomParticipant {
    private Integer roomId;
    private Integer userId;
    private String joinDate;

    public ChatRoomParticipant() {
    }


    // Getters and Setters
    public int getRoomId() { return roomId; }
    public void setRoomId(int roomId) { this.roomId = roomId; }
    public int getUserId() { return userId; }
    public void setUserId(int userId) { this.userId = userId; }
    public String getJoinDate() { return joinDate; }
    public void setJoinDate(String joinDate) { this.joinDate = joinDate; }
}
