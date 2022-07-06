package main.java.com.example.football.controller;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;

public class Teams {
    private String fname;
    private String lname;
    private String num;
    private String team;

    public Teams() {
    }

    public Teams(String fname, String lname, String num, String team) {
        this.fname = fname;
        this.lname = lname;
        this.num = num;
        this.team = team;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teams teams = (Teams) o;
        return Objects.equals(fname, teams.fname) && Objects.equals(lname, teams.lname) && Objects.equals(num, teams.num) && Objects.equals(team, teams.team);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fname, lname, num, team);
    }

    @Override
    public String toString() {
        return fname + '.' + lname + '.' + num + '.' + team + "\n";
    }


}
