package com.pucp.lab5trivia.repository;

import com.pucp.lab5trivia.model.Pregunta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PreguntaRepository extends JpaRepository<Pregunta, Long> {
}
