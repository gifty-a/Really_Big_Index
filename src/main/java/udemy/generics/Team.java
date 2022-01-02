package main.java.udemy.generics;

import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>> {
    private String teamNm;
    int gamesPlayed;
    int gamesWon;
    int gamesLost;
    int gamesTied;
    ArrayList<T> members;

    public Team(String teamNm) {
        this.teamNm = teamNm;
        this.gamesPlayed = 0;
        this.gamesWon = 0;
        this.gamesLost = 0;
        this.gamesTied = 0;
        this.members = new ArrayList<>();
    }

    public String getTeamNm() {
        return teamNm;
    }

    public void setTeamNm(String teamNm) {
        this.teamNm = teamNm;
    }

    public int getGamesPlayed() {
        return gamesPlayed;
    }

    public void setGamesPlayed(int gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    public int getGamesWon() {
        return gamesWon;
    }

    public void setGamesWon(int gamesWon) {
        this.gamesWon = gamesWon;
    }

    public int getGamesLost() {
        return gamesLost;
    }

    public void setGamesLost(int gamesLost) {
        this.gamesLost = gamesLost;
    }

    public int getGamesTied() {
        return gamesTied;
    }

    public void setGamesTied(int gamesTied) {
        this.gamesTied = gamesTied;
    }

    public ArrayList<T> getMembers() {
        return members;
    }

    public boolean addTeamMate(T teamMate) {
        if (this.members.contains(teamMate)) {
            System.out.println(teamMate.getPlayerNm() + "Already plays for this team");
            return false;
        } else {
            this.members.add(teamMate);
            teamMate.printPlayerStats();
            return true;
        }
    }

    public int getNumOfPlayers() {
        return this.members.size();
    }

    public void matchResult(Team<T> opponent, int ourScore, int opponentScore) {
        String message;
        if (ourScore > opponentScore) {
            gamesWon++;
            message = " beat ";
        } else if (ourScore < opponentScore) {
            gamesLost++;
            message = " lost to ";
        } else {
            gamesTied++;
            message = " drew with ";
        }
        gamesPlayed++;
        System.out.println(this.getTeamNm() + message + opponent.getTeamNm());
    }

    public int ranking() {
        return (gamesWon * 2) + gamesTied;
    }

    public String getTeamDetails() {
        return "Team Name : " + getTeamNm() + "\n" +
                "Team Size : " + getNumOfPlayers() + "\n" +
                "Ranking : " + ranking();
    }

    @Override
    public int compareTo(Team<T> team) {
        if (this.ranking() > team.ranking()) return -1;
        else if (this.ranking() < team.ranking()) return 1;
        else return 0;
    }
}
