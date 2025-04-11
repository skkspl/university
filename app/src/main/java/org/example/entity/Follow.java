package org.example.entity;

public class Follow {
    private Integer followerId;
    private Integer followedId;

    public Follow() {
    }

    // Getters and Setters
    public Integer getFollowerId() {
        return followerId;
    }

    public void setFollowerId(Integer followerId) {
        this.followerId = followerId;
    }

    public Integer getFollowedId() {
        return followedId;
    }

    public void setFollowedId(Integer followedId) {
        this.followedId = followedId;
    }
}
