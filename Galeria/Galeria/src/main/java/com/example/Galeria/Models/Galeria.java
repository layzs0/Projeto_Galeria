package com.example.Galeria.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
public class Galeria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank(message = "Insira o Nome")
    private String nome;

    @NotNull(message = "Insira a Categoria")
    private String categoria;

    @NotBlank(message = "Insira a Descrição")
    private String Descricao;


    public Galeria(long id, String nome, String categoria, String descricao) {
        this.id = id;
        this.nome = nome;
        this.categoria = categoria;
        Descricao = descricao;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public @NotBlank(message = "Insira o Nome") String getNome() {
        return nome;
    }

    public void setNome(@NotBlank(message = "Insira o Nome") String nome) {
        this.nome = nome;
    }

    public @NotNull(message = "Insira a Categoria") String getCategoria() {
        return categoria;
    }

    public void setCategoria(@NotNull(message = "Insira a Categoria") String categoria) {
        this.categoria = categoria;
    }

    public @NotBlank(message = "Insira a Descrição") String getDescricao() {
        return Descricao;
    }

    public void setDescricao(@NotBlank(message = "Insira a Descrição") String descricao) {
        Descricao = descricao;
    }
}

