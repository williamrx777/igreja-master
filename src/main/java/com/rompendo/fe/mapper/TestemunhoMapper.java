package com.rompendo.fe.mapper;

import com.rompendo.fe.dto.TestemunhoDTO;
import com.rompendo.fe.model.Testemunho;
import org.springframework.stereotype.Component;

@Component
public class TestemunhoMapper {


    public TestemunhoDTO toDTO(Testemunho testemunho){
        return new TestemunhoDTO(testemunho.getTitulo(),testemunho.getDescricao());
    }

    public Testemunho toEntity(TestemunhoDTO testemunhoDTO){
        Testemunho testemunho = new Testemunho();
        testemunho.setTitulo(testemunhoDTO.titulo());
        testemunho.setDescricao(testemunhoDTO.descricao());
        return testemunho;
    }

}
