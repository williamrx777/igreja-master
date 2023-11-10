package com.rompendo.fe.model;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;
import java.util.UUID;


@Entity
@Data
public class Igreja {
    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;
    @Column(unique = true, columnDefinition = "TEXT")
    private String culto;
    private LocalDate dataAtual;

}
