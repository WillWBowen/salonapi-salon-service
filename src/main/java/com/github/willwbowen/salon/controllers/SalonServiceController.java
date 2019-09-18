package com.github.willwbowen.salon.controllers;

import com.github.willwbowen.salon.model.Salon;
import com.github.willwbowen.salon.services.SalonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="v1/salons")
public class SalonServiceController {
    @Autowired
    SalonService salonService;

    @GetMapping()
    public Iterable<Salon> getAllSalons() {
        return salonService.getAllSalons();
    }

    @GetMapping("/{salonId}")
    public Salon getSalon(@PathVariable("salonId") String salonId) {
        return salonService.getSalon(salonId).orElse(null);
    }

    @PutMapping("/{salonId}")
    public void updateSalon(@PathVariable("salonId") String salonId, @RequestBody Salon salon) {
        salonService.updateSalon(salon);
    }

    @PostMapping()
    public void saveSalon(@RequestBody Salon salon) {
        salonService.saveSalon(salon);
    }

    @DeleteMapping("/{salonId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteSalon(@PathVariable("salonId") String salonId, @RequestBody Salon salon) {
        salonService.deleteSalon(salon);
    }
}
