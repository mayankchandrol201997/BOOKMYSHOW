package dev.mayank.BOOKMYSHOW.controller;

import dev.mayank.BOOKMYSHOW.dto.TheatreRequestDTO;
import dev.mayank.BOOKMYSHOW.models.Theatre;
import dev.mayank.BOOKMYSHOW.service.TheatreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class TheatreController {

    @Autowired
    private TheatreService theatreService;

    @PostMapping("/theatre")
    public ResponseEntity saveTheatre(@RequestBody TheatreRequestDTO theatreRequestDTO)
    {

            try {
                String address = theatreRequestDTO.getAddress();
                String name = theatreRequestDTO.getName();
                Integer cityId = theatreRequestDTO.getCityId();

                if (null==address || address.isEmpty()||address.isBlank()){
                throw new Exception("Invalid address");}

                if (null==name || name.isEmpty()||name.isBlank()){
                    throw new Exception("Invalid theatre name");}

                Theatre savedTheatre = theatreService.saveTheatre(name,address,cityId);
                return ResponseEntity.ok(savedTheatre);

            } catch (Exception e) {
                e.printStackTrace();
            }
        return null;
    }

    @GetMapping("/theatre/{id}")
    public ResponseEntity saveTheatre(@PathVariable("id") int id)
    {
            Theatre theatre = theatreService.getTheatreById(id);
            return ResponseEntity.ok(theatre);
    }
}
