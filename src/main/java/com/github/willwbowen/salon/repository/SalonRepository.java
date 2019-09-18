package com.github.willwbowen.salon.repository;

import com.github.willwbowen.salon.model.Salon;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalonRepository extends CrudRepository<Salon, String> {
}
