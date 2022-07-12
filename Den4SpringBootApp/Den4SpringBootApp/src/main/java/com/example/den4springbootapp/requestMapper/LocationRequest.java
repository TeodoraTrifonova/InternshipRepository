package com.example.den4springbootapp.requestMapper;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Builder
@Getter
@Setter(AccessLevel.PRIVATE)
public class LocationRequest {
    private String label;
    private String lon;
    private String lat;
}
