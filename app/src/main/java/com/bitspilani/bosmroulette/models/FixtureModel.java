package com.bitspilani.bosmroulette.models;

public class FixtureModel {
    private String college1,college2;
    private String timestamp;
    private String game;
    private String matchId;
    private int rank;

    public FixtureModel() {
    }

    public FixtureModel(String college1, String college2, String timestamp, String matchId,String game,int rank) {

        this.college1 = college1;
        this.college2 = college2;
        this.timestamp = timestamp;
        this.matchId = matchId;
        this.game = game;
        this.rank = rank;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getGame() {
        return game;
    }

    public void setGame(String game) {
        this.game = game;
    }

    public String getCollege1() {
        return college1;
    }

    public void setCollege1(String college1) {
        this.college1 = college1;
    }

    public String getCollege2() {
        return college2;
    }

    public void setCollege2(String college2) {
        this.college2 = college2;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getMatchId() {
        return matchId;
    }

    public void setMatchId(String matchId) {
        this.matchId = matchId;
    }
}
