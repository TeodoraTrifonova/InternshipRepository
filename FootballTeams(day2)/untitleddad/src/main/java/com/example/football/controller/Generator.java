package main.java.com.example.football.controller;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Generator {

    public static ArrayList<Teams> GenerateTeams() {
        ArrayList<Teams> teams = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Teams team = new Teams("FirstName" + i, "LastName" + i, "Number" + i, "Team" + i);
            teams.add(team);
        }
        return teams;
    }

}

