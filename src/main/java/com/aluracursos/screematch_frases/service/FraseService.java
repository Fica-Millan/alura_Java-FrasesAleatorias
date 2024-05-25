package com.aluracursos.screematch_frases.service;

import com.aluracursos.screematch_frases.model.Frase;
import com.aluracursos.screematch_frases.dto.FraseDTO;
import com.aluracursos.screematch_frases.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraseService {

    @Autowired
    private FraseRepository repository;

    public FraseDTO obtenerFraseAleatoria() {
        Frase frase = repository.obtenerFraseAleatoria();
        return new FraseDTO(frase.getFrase(), frase.getPersonaje(), frase.getTitulo(), frase.getPoster());
    }
}
