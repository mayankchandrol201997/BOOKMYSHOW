package dev.mayank.BOOKMYSHOW.models;

import dev.mayank.BOOKMYSHOW.constant.SeatStatus;
import dev.mayank.BOOKMYSHOW.constant.SeatType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Seat extends BaseModel{
    private String seatNumber;
    @Enumerated(EnumType.STRING)
    private SeatType seatType;
    private int rowNum;
    private int colNumb;
    @Enumerated(EnumType.STRING)
    private SeatStatus seatStatus;
}
