package dev.mayank.BOOKMYSHOW.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class BookTicketRequestDTO {
    List<Integer> showSeatIds;
    private Integer userId;
}
