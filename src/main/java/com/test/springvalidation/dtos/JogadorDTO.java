package com.test.springvalidation.dtos;

import com.test.springvalidation.entities.Jogador;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

public class JogadorDTO {
    @NotBlank
    @Size(min = 3)
    private String name;
    @NotNull
    @Positive
    private Integer age;

    public Jogador toEntity() {
        return new Jogador(this.name, this.age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
