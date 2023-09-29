package com.rompendo.fe.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
//@Document(collection = "testemunhos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Testemunho {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String titulo;
    private String descricao;

}
