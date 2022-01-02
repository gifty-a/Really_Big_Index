package main.java.udemy.generics;

public class Team<T extends Player> implements Comparable<Team<T>> {
    @Override
    public int compareTo(Team<T> o) {
        return 0;
    }
}
