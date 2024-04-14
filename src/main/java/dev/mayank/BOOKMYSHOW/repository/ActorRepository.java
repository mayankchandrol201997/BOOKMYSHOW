package dev.mayank.BOOKMYSHOW.repository;

import dev.mayank.BOOKMYSHOW.models.Actor;
import dev.mayank.BOOKMYSHOW.models.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActorRepository extends JpaRepository<Actor,Integer> {
}
