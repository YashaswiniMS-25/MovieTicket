package com.wolken.wolkenapp.controller;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wolken.wolkenapp.dto.MovieDTO;

@Component
@RequestMapping("/")
public class TicketController {
	
	@RequestMapping("/book.do")
	public String bookTicket(@ModelAttribute MovieDTO moviedto, HttpServletRequest req) {
		String name = moviedto.getMovieName();
		req.setAttribute("movieName", name);
		return "final.jsp";
	}
}
