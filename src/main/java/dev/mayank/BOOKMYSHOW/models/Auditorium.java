package dev.mayank.BOOKMYSHOW.models;

import dev.mayank.BOOKMYSHOW.constant.AuditoriumFeatures;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Auditorium extends BaseModel{
    private String name;
    private int capacity;
    @OneToMany
    private List<Seat> seats;
    @OneToMany
    private List<MovieShow> movieShows;
    @Enumerated(EnumType.STRING)
    @ElementCollection
    private List<AuditoriumFeatures> auditoriumFeatures;
}
