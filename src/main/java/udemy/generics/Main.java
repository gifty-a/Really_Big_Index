package main.java.udemy.generics;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        LeagueTable<Team<Player>> leagueTable = new LeagueTable<>("Premier League");
        Team<Player> team1 = createTeam();
        team1.addTeamMate(createPlayer());
        System.out.println(team1.getTeamDetails());
//        team1.addTeamMate(createPlayer());
//        team1.addTeamMate(createPlayer());
//        team1.addTeamMate(createPlayer());
//        team1.addTeamMate(createPlayer());
//        Team<Player> team2 = createTeam();
//        team2.addTeamMate(new Player("Josh",21,"Ghana",9.9,34,33,1,0));
//        team2.addTeamMate(createPlayer());
//        leagueTable.addTeam(team2);
//        leagueTable.addTeam(team1);
//        leagueTable.addTeam(new Team<>("King Faisal"));
//        leagueTable.addTeam(createTeam());
//        leagueTable.addTeam(createTeam());
    }

    public static void printMenu() {
        System.out.println("Please select from option 1-3");
        selectedOption(scanner.nextInt());
    }

    public static void selectedOption(int option) {
        switch (option) {
            case 1 :
                createPlayer();
                break;
            case 2:
                createTeam();
                break;
            case 3:
                createLeague();
                break;
            default:
                printMenu();
        }
    }

    private static Team<Player> createTeam() {
        System.out.println("Please enter the Team Name");
        String teamNm = scanner.nextLine();
        return new Team<>(teamNm);
    }

    public static Player createPlayer() {
        System.out.println("Please enter the Player Name");
        String playerName = scanner.nextLine();
        System.out.println("Please enter the Player Age");
        int playerAge = scanner.nextInt();
        System.out.println("Please enter Player's country");
        String country = scanner.nextLine();
        scanner.nextLine();
        System.out.println("done");
        return new Player(playerName,playerAge,country);
    }

    public static LeagueTable<Team<Player>> createLeague() {
        System.out.println("Please enter the league name");
        String leagueName = scanner.nextLine();
        return new LeagueTable<>(leagueName);
    }
}
