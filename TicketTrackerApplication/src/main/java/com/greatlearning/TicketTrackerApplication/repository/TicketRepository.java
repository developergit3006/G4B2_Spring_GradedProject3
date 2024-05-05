package com.greatlearning.TicketTrackerApplication.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.TicketTrackerApplication.entity.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Integer> {
	List<Ticket> findByTitleContainingOrDescriptionContaining(String query, String query2);
}
