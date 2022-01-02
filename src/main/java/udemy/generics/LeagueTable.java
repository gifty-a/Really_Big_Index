package main.java.udemy.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeagueTable<T extends Team>{
    private List<T> teams;
    private String leagueName;
    public LeagueTable(String leagueName) {
        this.leagueName = leagueName;
        teams = new ArrayList<>();
    }


    public boolean addTeam(T t) {
        if (!teams.isEmpty()){
            if (teams.contains(t)) {
                System.out.println("The league already contains this team");
                return false;
            }
        }
        teams.add(t);
        return true;
    }

    public void showLeagueTable() {
        Collections.sort(teams);
        for (T t: teams
             ) {
            System.out.println(t.getTeamDetails());
        }
    }
}
