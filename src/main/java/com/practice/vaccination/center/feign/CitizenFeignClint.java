package com.practice.vaccination.center.feign;


import com.practice.vaccination.center.dto.Citizen;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@FeignClient(name = "CITIZEN-SERVICE", url = "http://localhost:8081/", fallback = CitizenFeignClintFallback.class)
public interface CitizenFeignClint {
//    @RequestLine("GET /citizen/byCenter/{id}")
    @GetMapping("/citizen/byCenter/{id}")
    List<Citizen> getCitizenByCenter(@PathVariable(value = "id") Integer id);
}

@Component
class CitizenFeignClintFallback implements CitizenFeignClint{

    @Override
    public List<Citizen> getCitizenByCenter(Integer id) {
        return new ArrayList<>();
    }
}