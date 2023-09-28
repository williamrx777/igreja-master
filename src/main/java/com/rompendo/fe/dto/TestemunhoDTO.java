package com.rompendo.fe.dto;

import com.rompendo.fe.model.Testemunho;

public record TestemunhoDTO(String titulo, String descricao) {

    public TestemunhoDTO(Testemunho testemunho){
        this(testemunho.getTitulo(), testemunho.getDescricao());
    }

}
