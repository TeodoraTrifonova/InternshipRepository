package com.example.demo.data.models;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class FootBallPlayer {
    @Setter(AccessLevel.PRIVATE)
    private int number;
    private String playerName;
    private String team;
}
