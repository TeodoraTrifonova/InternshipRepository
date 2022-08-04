package com.example.demo.data.models;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class League {
    @Setter(AccessLevel.PRIVATE)
    private String leagueName;
    private String country;
}
