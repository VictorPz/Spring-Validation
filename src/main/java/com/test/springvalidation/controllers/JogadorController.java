package com.test.springvalidation.controllers;

import com.test.springvalidation.dtos.JogadorDTO;
import com.test.springvalidation.entities.Jogador;
import com.test.springvalidation.repositories.JogadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/jogadores")
public class JogadorController {
    @Autowired
    private JogadorRepository jogadorRepository;

    @PostMapping("/criar")
    public String criarJogador(@RequestBody @Valid JogadorDTO request) {
        Jogador jogador = request.toEntity();
        jogadorRepository.save(jogador);
        return "Jogador Criado. Id: " + jogador.getId();
    }
}
