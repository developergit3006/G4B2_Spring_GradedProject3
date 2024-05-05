package com.greatlearning.TicketTrackerApplication.service;

import java.util.List;
import java.util.Optional;

import com.greatlearning.TicketTrackerApplication.entity.Ticket;

public interface TicketService {
	Ticket createTicket(Ticket ticket);

	List<Ticket> getAllTicket();

	Ticket getTicketById(Integer id);

	Ticket updateTicket(Integer id, Ticket ticket);

	void deleteTicket(Integer id);

	List<Ticket> searchTickets(String query);

	Optional<Ticket> getTicketByTheId(Integer id);

}
