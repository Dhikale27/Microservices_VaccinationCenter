package com.practice.vaccination.center.repository;

import com.practice.vaccination.center.dto.VaccinationCenter;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VaccinationCenterRepository extends MongoRepository<VaccinationCenter, Integer> {
}
