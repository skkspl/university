package org.library.entity;

public class Follow {
    private Integer followerId;
    private Integer followedId;

    public Follow() {
    }


    // Getters and Setters
    public int getFollowerId() { return followerId; }
    public void setFollowerId(int followerId) { this.followerId = followerId; }
    public int getFollowedId() { return followedId; }
    public void setFollowedId(int followedId) { this.followedId = followedId; }
}
