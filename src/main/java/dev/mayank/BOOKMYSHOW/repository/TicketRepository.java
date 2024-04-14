package dev.mayank.BOOKMYSHOW.repository;

import dev.mayank.BOOKMYSHOW.models.Theatre;
import dev.mayank.BOOKMYSHOW.models.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepository extends JpaRepository<Ticket,Integer> {
}
