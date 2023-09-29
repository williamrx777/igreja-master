package com.rompendo.fe.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.File;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

//@Document(collection = "igreja")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Igreja {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    @Column(columnDefinition = "TEXT")
    private String culto;
    private LocalDate dataAtual;

}
