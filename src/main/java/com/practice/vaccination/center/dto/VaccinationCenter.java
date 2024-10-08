package com.practice.vaccination.center.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class VaccinationCenter {

	@Id
	private Integer id;
	
	private String centerName;
	
	private String centerAddress;
	

}