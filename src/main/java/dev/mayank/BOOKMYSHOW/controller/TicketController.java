package dev.mayank.BOOKMYSHOW.controller;

import dev.mayank.BOOKMYSHOW.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketController {
    @Autowired
    private TicketService ticketService;

    @GetMapping("/hello")
    public ResponseEntity greet()
    {
        String response = ticketService.greet();
        return ResponseEntity.ok(response);
    }
}
