package com.constest.ContestAPI.dto;

public class OverAllLeaderBoardDTO {
    private String userId;
    private int overAllPoints;
    private String id;
    private int rank;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getOverAllPoints() {
        return overAllPoints;
    }

    public void setOverAllPoints(int overAllPoints) {
        this.overAllPoints = overAllPoints;
    }

    @Override
    public String toString() {
        return "OverAllLeaderBoardDTO{" +
                "userId='" + userId + '\'' +
                ", overAllPoints=" + overAllPoints +
                ", id='" + id + '\'' +
                ", rank=" + rank +
                '}';
    }
}
