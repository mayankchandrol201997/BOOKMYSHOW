package dev.mayank.BOOKMYSHOW.service;

import dev.mayank.BOOKMYSHOW.models.ShowSeat;
import dev.mayank.BOOKMYSHOW.repository.ShowSeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShowSeatService {
    @Autowired
    private ShowSeatRepository showSeatRepository;

    public ShowSeat getShowSeatById(int showSeatId)
    {
        ShowSeat showSeat = showSeatRepository.findById(showSeatId).get();
        return showSeat;
    }

    public ShowSeat saveShowSeat(ShowSeat showSeat)
    {
        return showSeatRepository.save(showSeat);
    }
}
