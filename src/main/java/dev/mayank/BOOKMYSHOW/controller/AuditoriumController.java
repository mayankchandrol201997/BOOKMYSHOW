package dev.mayank.BOOKMYSHOW.controller;

import dev.mayank.BOOKMYSHOW.constant.AuditoriumFeatures;
import dev.mayank.BOOKMYSHOW.dto.AuditoriumRequestDTO;
import dev.mayank.BOOKMYSHOW.dto.TheatreRequestDTO;
import dev.mayank.BOOKMYSHOW.models.Auditorium;
import dev.mayank.BOOKMYSHOW.models.Theatre;
import dev.mayank.BOOKMYSHOW.service.AuditoriumService;
import dev.mayank.BOOKMYSHOW.service.TheatreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AuditoriumController {

    @Autowired
    private AuditoriumService auditoriumService;

    @PostMapping("/auditorium")
    public ResponseEntity saveTheatre(@RequestBody AuditoriumRequestDTO auditoriumRequestDTO)
    {

            try {
                String name = auditoriumRequestDTO.getName();
                Integer capacity = auditoriumRequestDTO.getCapacity();
                Integer theatreId = auditoriumRequestDTO.getTheatreId();

                if (null==name || name.isEmpty()||name.isBlank()){
                throw new Exception("Invalid name");}

                if (null==capacity){
                    throw new Exception("Invalid auditorium capacity");}

                Auditorium savedAuditorium = auditoriumService.saveAuditorium(name,capacity,theatreId);
                return ResponseEntity.ok(savedAuditorium);

            } catch (Exception e) {
                e.printStackTrace();
            }
        return null;
    }
}
