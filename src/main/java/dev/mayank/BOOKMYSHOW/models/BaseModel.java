package dev.mayank.BOOKMYSHOW.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter
@Setter
@MappedSuperclass
public abstract class BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private int id;
    @Column(name = "CREATED_DATE")
    private LocalDateTime CreatedDate;
    @Column(name = "UPDATED_DATE")
    private LocalDateTime updatedDate;
    @Column(name = "CREATED_BY")
    private String CreatedBy;
    @Column(name = "UPDATED_BY")
    private String updatedBy;
}
