package main.java.udemy.generics;

import java.util.ArrayList;
import java.util.List;

public class LeagueTable<T>{
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
}
