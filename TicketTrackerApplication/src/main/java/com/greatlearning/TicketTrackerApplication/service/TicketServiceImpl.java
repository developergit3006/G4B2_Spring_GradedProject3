package com.greatlearning.TicketTrackerApplication.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.TicketTrackerApplication.entity.Ticket;
import com.greatlearning.TicketTrackerApplication.repository.TicketRepository;

@Service
public class TicketServiceImpl implements TicketService {

	@Autowired
	TicketRepository ticketRepository;

	@Override
	public Ticket createTicket(Ticket ticket) {
		return ticketRepository.save(ticket);
	}

	@Override
	public List<Ticket> getAllTicket() {
		return ticketRepository.findAll();
	}

	@Override
	public Ticket getTicketById(Integer id) {
		return ticketRepository.findById(id).get();
	}

	@Override
	public Ticket updateTicket(Integer id, Ticket ticket) {
		if (ticketRepository.existsById(id)) {
			ticket.setId(id);
			return ticketRepository.save(ticket);
		} else {
			return null;
		}
	}

	@Override
	public void deleteTicket(Integer id) {
		// TODO Auto-generated method stub
		ticketRepository.deleteById(id);
	}

	@Override
	public List<Ticket> searchTickets(String query) {
		return ticketRepository.findByTitleContainingOrDescriptionContaining(query, query);
	}

	@Override
	public Optional<Ticket> getTicketByTheId(Integer id) {
		return ticketRepository.findById(id);
	}
}
