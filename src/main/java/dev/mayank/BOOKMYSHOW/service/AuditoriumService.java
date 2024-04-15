package dev.mayank.BOOKMYSHOW.service;

import dev.mayank.BOOKMYSHOW.constant.AuditoriumFeatures;
import dev.mayank.BOOKMYSHOW.models.Auditorium;
import dev.mayank.BOOKMYSHOW.models.Theatre;
import dev.mayank.BOOKMYSHOW.repository.AuditoriumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuditoriumService {
    @Autowired
    private AuditoriumRepository auditoriumRepository;
    @Autowired
    private TheatreService theatreService;

    public Auditorium saveAuditorium(String name, int capacity, int theatreId)
    {
       Theatre theatre = theatreService.getTheatreById(theatreId);
       Auditorium newAuditorium = new Auditorium();
       newAuditorium.setName(name);
       newAuditorium.setCapacity(capacity);
       //newAuditorium.setAuditoriumFeatures(auditoriumFeatures);
       Auditorium savedAuditorium = auditoriumRepository.save(newAuditorium);
       theatre.getAuditoriums().add(savedAuditorium);
       theatreService.saveTheatre(theatre);
       return savedAuditorium;
    }
}
