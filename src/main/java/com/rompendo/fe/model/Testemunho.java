package com.rompendo.fe.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "testemunhos")
@Table(name = "testemunhos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Testemunho {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String descricao;

}
