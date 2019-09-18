package com.github.willwbowen.salon.services;

import com.github.willwbowen.salon.model.Salon;
import com.github.willwbowen.salon.repository.SalonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class SalonService {
    @Autowired
    private SalonRepository salonRepository;

    public Iterable<Salon> getAllSalons() {
        return salonRepository.findAll();
    }

    public Optional<Salon> getSalon(String salonId) {
        return salonRepository.findById(salonId);
    }

    public void saveSalon(Salon salon) {
        salon.setSalonId(UUID.randomUUID().toString());
        salonRepository.save(salon);
    }

    public void updateSalon(Salon salon) {
        salonRepository.save(salon);
    }

    public void deleteSalon(Salon salon) {
        salonRepository.delete(salon);
    }
}
