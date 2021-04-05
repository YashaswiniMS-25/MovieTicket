package com.wolken.wolkenapp.dto;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Component
public class MovieDTO {
	private String movieName;
	private String Timings;
	private int noOfTickets;

}
