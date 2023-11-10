package com.uilangage.langcine.ticket;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/langcine")
public class TicketController {

	@GetMapping("/ticketing-view")
	public String ticketMain() {
		return "ticket/ticketing";
	}
	
	
}
