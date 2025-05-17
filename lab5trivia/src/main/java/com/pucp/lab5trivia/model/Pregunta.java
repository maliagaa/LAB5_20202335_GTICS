package com.pucp.lab5trivia.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "pregunta")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pregunta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String texto;

    private String opcionA;
    private String opcionB;
    private String opcionC;
    private String opcionD;

    private String respuestaCorrecta;
}
