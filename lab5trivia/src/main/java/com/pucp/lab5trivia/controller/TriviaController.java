package com.pucp.lab5trivia.controller;

import com.pucp.lab5trivia.model.Pregunta;
import com.pucp.lab5trivia.service.TriviaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class TriviaController {

    @Autowired
    private TriviaService triviaService;

    @GetMapping("/user/trivia")
    public String mostrarTrivia(Model model) {
        List<Pregunta> preguntas = triviaService.obtenerPreguntasAleatorias(5);
        model.addAttribute("preguntas", preguntas);
        return "trivia";
    }
}
