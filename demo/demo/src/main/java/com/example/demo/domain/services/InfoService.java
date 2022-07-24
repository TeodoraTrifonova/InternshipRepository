package com.example.demo.domain.services;

import com.example.demo.data.models.FootBallPlayer;
import com.example.demo.data.models.League;
import com.example.demo.data.models.Team;
import com.example.demo.data.services.AddService;
import org.apache.logging.log4j.util.PropertySource;
import org.springframework.stereotype.Service;

import java.util.AbstractMap;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class InfoService {

    private List<FootBallPlayer> footballers;
    private List<Team> teams;
    private List<League> leagues;

    private final AddService addService;

    public InfoService(AddService addService) {
        this.addService = addService;
        this.footballers = addService.getPlayers();
        this.teams = addService.getTeams();
        this.leagues = addService.getLeagues();
    }

    public void firstTask() {
        //        1. vsichki futbolisti ot PSG, sorted by number
        footballers
                .stream()
                .filter(player -> player.getTeam().equals("PSG"))
                .sorted(Comparator.comparingInt(FootBallPlayer::getNumber))
                .forEach(System.out::println);
    }

    public void secondTask() {
        //        2. vsichki futbolisti sortirani po otbor(1) po nomer(2)
        footballers
                .stream()
                .sorted(Comparator.comparing(FootBallPlayer::getTeam)
                        .thenComparing(FootBallPlayer::getNumber))
                .forEach(System.out::println);
    }

    public void thirdTask() {
        //        3. vsichki futbolisti ot ispanskata liga
        teams
                .stream()
                .filter(team -> team.getLeague().equals("Premiera Division"))
                .map(team -> {
                    return footballers
                            .stream()
                            .filter(player -> player.getTeam().equals(team.getTeamName()))
                            .collect(Collectors.toList());
                })
                .flatMap(List::stream)
                .forEach(System.out::println);
    }

    public void forthTask() {
        //        4. razpechatvame ligite - obshtiq budget na otborite v ligata
        teams
                .stream()
                .map(team -> {
                    Double leagueBudget = teams
                            .stream()
                            .filter(subteam -> subteam.getLeague().equals(team.getLeague()))
                            .map(Team::getBudget)
                            .reduce(0.0, Double::sum);

                    return new AbstractMap.SimpleEntry<>(team.getLeague(), leagueBudget);
                })
                .distinct()
                .forEach(System.out::println);
    }

    public void fifthTask() {
        //5. string koito sydyrja
        // -> TEAM:Barca Player1 -Name -Nomer, Player2 -Name -Nomer, Player /ENDTEAM TEAM:Real...
        teams
                .stream()
                .map(team -> {
                    List<FootBallPlayer> teamPlayers = footballers
                            .stream()
                            .filter(footballer -> footballer.getTeam().equals(team.getTeamName()))
                            .toList();

                    return team.getTeamName().concat(" - ").concat(
                            teamPlayers
                                    .stream()
                                    .map(player -> player.getPlayerName().concat(", ").concat(String.valueOf(player.getNumber())))
                                    .collect(Collectors.joining("; "))
                    );
                })
                .forEach(System.out::println);


    }

    public void sixthTask() {
        //        6. vsichki futbolisti sortirani po dyrjava
        footballers
                .stream()
                .map(player ->
                        {
                            return teams
                                    .stream()
                                    .filter(team -> team.getTeamName().equals(player.getTeam()))
                                    .map(team -> {
                                                return leagues
                                                        .stream()
                                                        .filter(league -> league.getLeagueName().equals(team.getLeague()))
                                                        .map(league -> new AbstractMap.SimpleEntry<>(league.getCountry(), player.getPlayerName()))
                                                        .collect(Collectors.toList());
                                            }
                                    )
                                    .flatMap(List::stream)
                                    .collect(Collectors.toList());
                        }
                )
                .flatMap(List::stream)
                .sorted(java.util.Map.Entry.comparingByKey())
                .forEach(System.out::println);
    }

    public void seventhTask() {
        teams
                .stream()
                .map(team -> {
                    Double leagueBudget = teams
                            .stream()
                            .filter(subteam -> subteam.getLeague().equals(team.getLeague()))
                            .map(Team::getBudget)
                            .reduce(0.0, Double::sum);

                    return new AbstractMap.SimpleEntry<>(team.getLeague(), leagueBudget);
                })
                .distinct()
                .max(Comparator.comparingDouble(AbstractMap.SimpleEntry::getValue))
                .ifPresent(System.out::println);
    }

    public void eightTask() {
        //        8. print all leagues -average budget and sort by average budget DESC
        teams
                .stream()
                .map(team -> {
                    Double leagueBudget = teams
                            .stream()
                            .filter(subteam -> subteam.getLeague().equals(team.getLeague()))
                            .collect(Collectors.averagingDouble(Team::getBudget));

                    return new AbstractMap.SimpleEntry<>(team.getLeague(), leagueBudget);
                })
                .distinct()
                .sorted((entry1, entry2) -> {
                    if (entry2.getValue() - entry1.getValue() < 0) {
                        return -1;
                    } else if (entry2.getValue() - entry1.getValue() > 0) {
                        return 1;
                    }
                    return 0;
                })
                .forEach(System.out::println);
    }

    public void ninthTask() {
        //        9. pechata samo futbolistite koito imat ednakvi nomera
        footballers.stream()
                .filter(footballer ->
                                footballers
                                        .stream()
                                        .filter(subfootballer -> subfootballer != footballer)
//                                .noneMatch(subfootballer ->
//                                        subfootballer.getPlayerName().equals(footballer.getPlayerName())
//                                                && subfootballer.getTeam().equals(footballer.getTeam())
//                                                && subfootballer.getNumber() == footballer.getNumber())
//
                                .anyMatch(subfootballer ->
                                        subfootballer.getPlayerName().equals(footballer.getPlayerName()))
                )
                .forEach(System.out::println);

    }

}
