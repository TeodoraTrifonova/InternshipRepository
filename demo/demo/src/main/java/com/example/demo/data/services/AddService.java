package com.example.demo.data.services;


import com.example.demo.data.models.FootBallPlayer;
import com.example.demo.data.models.League;
import com.example.demo.data.models.Team;

import java.util.List;


public interface AddService {
    List<FootBallPlayer> getPlayers();
    List<Team> getTeams();
    List<League> getLeagues();
}