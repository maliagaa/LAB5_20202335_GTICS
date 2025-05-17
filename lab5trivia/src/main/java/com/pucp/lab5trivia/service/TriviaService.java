package com.pucp.lab5trivia.service;

import com.pucp.lab5trivia.model.Pregunta;
import com.pucp.lab5trivia.repository.PreguntaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class TriviaService {

    @Autowired
    private PreguntaRepository preguntaRepository;

    public List<Pregunta> obtenerPreguntasAleatorias(int cantidad) {
        List<Pregunta> todas = preguntaRepository.findAll();
        Collections.shuffle(todas);
        return todas.subList(0, Math.min(cantidad, todas.size()));
    }
}
