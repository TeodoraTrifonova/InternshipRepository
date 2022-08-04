package com.example.demo.data.services;

import com.example.demo.data.models.FootBallPlayer;
import com.example.demo.data.models.League;
import com.example.demo.data.models.Team;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Primary
public class AddServiceImpl implements AddService {

    @Override
    public List<FootBallPlayer> getPlayers() {
        List<FootBallPlayer> players=new ArrayList<>();
        players.add(FootBallPlayer.builder()
                .number(10)
                .playerName("Messi")
                .team("PSG")
                .build());
        players.add(FootBallPlayer.builder()
                .number(7)
                .playerName("Ronaldo")
                .team("Manchester United")
                .build());
        players.add(FootBallPlayer.builder()
                .number(5)
                .playerName("Benzema")
                .team("Real Madrid")
                .build());
        players.add(FootBallPlayer.builder()
                .number(66)
                .playerName("Mbappe")
                .team("PSG")
                .build());
        players.add(FootBallPlayer.builder()
                .number(54)
                .playerName("Modric")
                .team("Atletico Madrid")
                .build());
        players.add(FootBallPlayer.builder()
                .number(8)
                .playerName("Suarez")
                .team("Manchester City")
                .build());
        players.add(FootBallPlayer.builder()
                .number(66)
                .playerName("Aguero")
                .team("Bayern Munchen")
                .build());
        players.add(FootBallPlayer.builder()
                .number(85)
                .playerName("Ter Stegen")
                .team("Barcelona")
                .build());
        players.add(FootBallPlayer.builder()
                .number(44)
                .playerName("Neuer")
                .team("Juventus")
                .build());
        players.add(FootBallPlayer.builder()
                .number(39)
                .playerName("Kaka")
                .team("Real Madrid")
                .build());
        players.add(FootBallPlayer.builder()
                .number(70)
                .playerName("Ronaldhinio")
                .team("Juventus")
                .build());
        players.add(FootBallPlayer.builder()
                .number(69)
                .playerName("Bojinkata")
                .team("PSG")
                .build());
        players.add(FootBallPlayer.builder()
                .number(74)
                .playerName("Pesho")
                .team("PSG")
                .build());
        players.add(FootBallPlayer.builder()
                .number(75)
                .playerName("Pesho")
                .team("Juventus")
                .build());

        return players;
    }

    @Override
    public List<Team> getTeams() {
        List<Team> teams=new ArrayList<>();
        teams.add(Team.builder()
                .teamName("Barcelona")
                .budget(2.0)
                .league("Premiera Division")
                .build());
        teams.add(Team.builder()
                .teamName("PSG")
                .budget(2.0)
                .league("Pyrva liga France")
                .build());
        teams.add(Team.builder()
                .teamName("Real Madrid")
                .budget(2.0)
                .league("Premiera Division")
                .build());
        teams.add(Team.builder()
                .teamName("Atletico Madrid")
                .budget(3.0)
                .league("Premiera Division")
                .build());
        teams.add(Team.builder()
                .teamName("Manchester United")
                .budget(3.0)
                .league("Premier League")
                .build());
        teams.add(Team.builder()
                .teamName("Manchester City")
                .budget(3.0)
                .league("Premier League")
                .build());
        teams.add(Team.builder()
                .teamName("Juventus")
                .budget(5.0)
                .league("Seria A")
                .build());

        return teams;
    }

    @Override
    public List<League> getLeagues() {
        List<League> leagues=new ArrayList<>();
        leagues.add(League.builder()
                .country("Italy")
                .leagueName("Seria A")
                .build());
        leagues.add(League.builder()
                .country("UK")
                .leagueName("Premier League")
                .build());
        leagues.add(League.builder()
                .country("Spain")
                .leagueName("Premiera Division")
                .build());
        leagues.add(League.builder()
                .country("France")
                .leagueName("Pyrva liga France")
                .build());
        return leagues;
    }
}
