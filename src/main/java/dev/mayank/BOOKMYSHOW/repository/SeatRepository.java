package dev.mayank.BOOKMYSHOW.repository;

import dev.mayank.BOOKMYSHOW.models.Seat;
import dev.mayank.BOOKMYSHOW.models.Theatre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeatRepository extends JpaRepository<Seat,Integer> {
}
