package com.test.springvalidation.controllers;

import com.test.springvalidation.dtos.JogadorDTO;
import com.test.springvalidation.dtos.JogadorResponseDTO;
import com.test.springvalidation.entities.Jogador;
import com.test.springvalidation.repositories.JogadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/jogadores")
public class JogadorController {
    @Autowired
    private JogadorRepository jogadorRepository;
    private JogadorResponseDTO jogadorResponseDTO;

    @PostMapping("/criar")
    public String criarJogador(@RequestBody @Valid JogadorDTO request) {
        Jogador jogador = request.toEntity();
        jogadorRepository.save(jogador);
        return "Jogador Criado";
    }

    @GetMapping("/lista")
    public ResponseEntity<List<Jogador>> listAllJogador() {
        List<Jogador> jogadores = jogadorRepository.findAll();
        return ResponseEntity.ok().body(jogadores);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Jogador> findById(@PathVariable Long id) {
        Jogador jogador = jogadorRepository.findById(id).get();
        return ResponseEntity.ok().body(jogador);
    }
}
