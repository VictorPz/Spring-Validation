package com.test.springvalidation.dtos;

import com.test.springvalidation.entities.Jogador;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class JogadorResponseDTO {

    private String name;
    private Integer age;

    public JogadorResponseDTO(Jogador jogador) {
        this.name = jogador.getName();
        this.age = jogador.getAge();
    }

//    public List<JogadorResponseDTO> toList(List<Jogador> lista) {
//        List<JogadorResponseDTO> listResponse = new ArrayList<>();
//        lista.stream().map()
//    }
}
