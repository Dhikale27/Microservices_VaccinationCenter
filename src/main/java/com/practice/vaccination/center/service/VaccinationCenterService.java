package com.practice.vaccination.center.service;

import com.practice.vaccination.center.dto.Citizen;
import com.practice.vaccination.center.feign.CitizenFeignClint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VaccinationCenterService {

    @Autowired
    CitizenFeignClint citizenFeignClint;

    public List<Citizen> getCitizenByCenter(Integer id){
        //get citizen by feign client
        List<Citizen> citizenByCenter = citizenFeignClint.getCitizenByCenter(id);
        return citizenByCenter;
    }
}
