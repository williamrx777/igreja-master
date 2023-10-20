package com.rompendo.fe.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;


@Entity
@Data
public class Testemunho {
    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;
    @Column(unique = true)
    private String titulo;
    private String descricao;

}
