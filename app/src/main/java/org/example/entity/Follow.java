package org.example.entity;

public class Follow {
    private int followerId;
    private int followedId;

    public Follow(int followerId, int followedId) {
        this.followerId = followerId;
        this.followedId = followedId;
    }

    // Getters and Setters
    public int getFollowerId() { return followerId; }
    public void setFollowerId(int followerId) { this.followerId = followerId; }
    public int getFollowedId() { return followedId; }
    public void setFollowedId(int followedId) { this.followedId = followedId; }
}
