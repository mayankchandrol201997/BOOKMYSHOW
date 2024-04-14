package dev.mayank.BOOKMYSHOW.controller;

import dev.mayank.BOOKMYSHOW.dto.BookTicketRequestDTO;
import dev.mayank.BOOKMYSHOW.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TicketController {
    @Autowired
    private TicketService ticketService;

    @GetMapping("/hello")
    public ResponseEntity greet() {
        String response = ticketService.greet();
        return ResponseEntity.ok(response);
    }

    @PostMapping("/ticket")
    public ResponseEntity bookTicket(@RequestBody BookTicketRequestDTO bookTicketRequestDTO)
    {
        try {
            List<Integer> showSeatIds = bookTicketRequestDTO.getShowSeatIds();
            Integer userId = bookTicketRequestDTO.getUserId();
            if (null == showSeatIds || showSeatIds.isEmpty())
                throw new Exception("Invalid show seat id");

            if (null == userId)
                throw new Exception("Invalid user id");

            return ResponseEntity.ok(ticketService.bookTicket(showSeatIds,userId));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }
}

