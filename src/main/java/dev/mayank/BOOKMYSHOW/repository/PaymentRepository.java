package dev.mayank.BOOKMYSHOW.repository;

import dev.mayank.BOOKMYSHOW.models.Payment;
import dev.mayank.BOOKMYSHOW.models.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends JpaRepository<Payment,Integer> {
}
