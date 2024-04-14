package dev.mayank.BOOKMYSHOW.service;

import dev.mayank.BOOKMYSHOW.constant.ShowSeatStatus;
import dev.mayank.BOOKMYSHOW.models.ShowSeat;
import dev.mayank.BOOKMYSHOW.models.Ticket;
import dev.mayank.BOOKMYSHOW.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TicketService {
    @Autowired
    private TicketRepository ticketRepository;
    @Autowired
    private ShowSeatService showSeatService;

    public String greet()
    {
        return "HELLO WORLD FROM FIRST API";
    }

    @Transactional(isolation = Isolation.SERIALIZABLE)
    public Ticket bookTicket(List<Integer> showSeatIds, int userId) throws Exception {
        for (Integer showSeatId:showSeatIds)
        {
            ShowSeat showSeat = showSeatService.getShowSeatById(showSeatId);
            if(!showSeat.getShowSeatStatus().equals(ShowSeatStatus.AVAILABLE))
                throw new Exception("Seat is not available anymore");

        }

        for (Integer showSeatId:showSeatIds)
        {
            ShowSeat showSeat = showSeatService.getShowSeatById(showSeatId);
            showSeat.setShowSeatStatus(ShowSeatStatus.LOCKED);
            showSeatService.saveShowSeat(showSeat);
        }

        //write logic to initiate the payment flow
        startPayment(showSeatIds);
        return new Ticket();
    }

    public boolean startPayment(List<Integer> showSeatIds)
    {
        return true;
    }

}
