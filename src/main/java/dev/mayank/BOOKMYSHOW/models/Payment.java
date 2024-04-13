package dev.mayank.BOOKMYSHOW.models;

import dev.mayank.BOOKMYSHOW.constant.PaymentMode;
import dev.mayank.BOOKMYSHOW.constant.PaymentStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Setter
@Getter
public class Payment extends BaseModel{
    private double amount;
    private LocalDateTime paymentTime;
    @ManyToOne
    private Ticket ticket;
    private String referenceId;
    @Enumerated(EnumType.STRING)
    private PaymentStatus paymentStatus;
    @Enumerated(EnumType.STRING)
    private PaymentMode paymentMode;
}
