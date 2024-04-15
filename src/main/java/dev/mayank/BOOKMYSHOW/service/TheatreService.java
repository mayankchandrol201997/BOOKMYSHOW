package dev.mayank.BOOKMYSHOW.service;

import dev.mayank.BOOKMYSHOW.models.City;
import dev.mayank.BOOKMYSHOW.models.Theatre;
import dev.mayank.BOOKMYSHOW.repository.TheatreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TheatreService {
    @Autowired
    private TheatreRepository theatreRepository;
    @Autowired
    private CityService cityService;

    public Theatre saveTheatre(String name,String address,int cityId)
    {
       City city = cityService.getCityById(cityId);
       Theatre newTheatre = new Theatre();
       newTheatre.setName(name);
       newTheatre.setAddress(address);
       Theatre savedTheatre = theatreRepository.save(newTheatre);
       city.getTheatres().add(newTheatre);
       cityService.saveCity(city);
       return savedTheatre;
    }

    public Theatre getTheatreById(int theatreId) {
        return theatreRepository.findById(theatreId).get();
    }

    public Theatre saveTheatre(Theatre theatre) {
        return theatreRepository.save(theatre);
    }
}
