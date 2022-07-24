package com.example.demo.data.models;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Team {
    @Setter(AccessLevel.PRIVATE)
    private String teamName;
    private Double budget;
    private String league;
}
