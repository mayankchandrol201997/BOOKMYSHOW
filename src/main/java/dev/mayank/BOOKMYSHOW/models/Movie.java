package dev.mayank.BOOKMYSHOW.models;


import dev.mayank.BOOKMYSHOW.constant.MovieFeatures;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity(name = "MOVIE")
public class Movie extends BaseModel{
    private String name;
    private String description;
    @ManyToMany
    private List<Actor> actors;
    @ElementCollection
    @Enumerated(EnumType.STRING)
    private List<MovieFeatures> movieFeatures;
}
