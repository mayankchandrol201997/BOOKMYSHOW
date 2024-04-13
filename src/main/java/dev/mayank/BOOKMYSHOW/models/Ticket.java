package dev.mayank.BOOKMYSHOW.models;

import dev.mayank.BOOKMYSHOW.constant.TicketStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Setter
@Getter
public class Ticket extends BaseModel{
    private LocalDateTime bookingTime;
    @OneToMany
    private List<ShowSeat> showSeats;
    @ManyToOne
    private MovieShow movieShow;
    private double totalAmount;
    @Enumerated(EnumType.STRING)
    private TicketStatus ticketStatus;
}
