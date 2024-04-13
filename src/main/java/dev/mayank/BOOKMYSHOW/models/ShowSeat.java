package dev.mayank.BOOKMYSHOW.models;

import dev.mayank.BOOKMYSHOW.constant.ShowSeatStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class ShowSeat extends BaseModel{
    @ManyToOne
    private MovieShow movieShow;
    @Enumerated(EnumType.STRING)
    private ShowSeatStatus showSeatStatus;
    @ManyToOne
    private Seat seat;
    private int price;
}
