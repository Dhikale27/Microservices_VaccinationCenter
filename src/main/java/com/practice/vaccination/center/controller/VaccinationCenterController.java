package com.practice.vaccination.center.controller;

import com.practice.vaccination.center.dto.Citizen;
import com.practice.vaccination.center.dto.VaccinationCenter;
import com.practice.vaccination.center.repository.VaccinationCenterRepository;
import com.practice.vaccination.center.service.VaccinationCenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/center")
public class VaccinationCenterController {

    @Autowired
    VaccinationCenterRepository vaccinationCenterRepository;

    @Autowired
    VaccinationCenterService vaccinationCenterService;


    @PostMapping("/add")
    public VaccinationCenter addVaccinationCenter(@RequestBody VaccinationCenter vaccinationCenter){
        VaccinationCenter saved = vaccinationCenterRepository.save(vaccinationCenter);
        return saved;
    }

    @GetMapping("/{id}")
    public VaccinationCenter getVaccinationCenterById(@PathVariable("id") Integer id){
        VaccinationCenter vaccinationCenter = vaccinationCenterRepository.findById(id).get();
        return vaccinationCenter;
    }

    @GetMapping("/citizen/{id}")
    public List<Citizen> getPeopleByCenter(@PathVariable("id") Integer id){
        List<Citizen> citizenByCenter = vaccinationCenterService.getCitizenByCenter(id);
        return citizenByCenter;

    }
}
