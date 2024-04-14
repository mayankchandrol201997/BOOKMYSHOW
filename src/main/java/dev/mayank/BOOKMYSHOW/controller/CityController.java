package dev.mayank.BOOKMYSHOW.controller;

import dev.mayank.BOOKMYSHOW.dto.CityRequestDTO;
import dev.mayank.BOOKMYSHOW.models.City;
import dev.mayank.BOOKMYSHOW.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CityController {
    @Autowired
    private CityService cityService;

    @PostMapping("/city")
    public ResponseEntity createCity(@RequestBody CityRequestDTO cityRequestDTO) {
        try {
            String cityName = cityRequestDTO.getName();
            if (cityName.isBlank() || cityName.isEmpty()) {
                throw new Exception("City name is invalid.");
            }
            City savedCity = cityService.saveCity(cityName);
            return ResponseEntity.ok(savedCity);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @DeleteMapping("/city/{id}")
    public ResponseEntity deleteCity(@PathVariable("id") int cityId) {

            boolean isDeleted = cityService.deleteCity(cityId);
            return ResponseEntity.ok(isDeleted);
    }

    @GetMapping("/city/{name}")
    public ResponseEntity getCityByName(@PathVariable("name") String cityName) {

        City city = cityService.getCityByName(cityName);
        return ResponseEntity.ok(city);
    }
}
