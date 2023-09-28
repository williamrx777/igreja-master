package com.rompendo.fe.mapper;

import com.rompendo.fe.dto.IgrejaDTO;
import com.rompendo.fe.model.Igreja;
import org.springframework.stereotype.Component;

@Component
public class IgrejaMapper {

    public IgrejaDTO toDTO(Igreja igreja){
        return new IgrejaDTO(igreja.getCulto(),igreja.getDataAtual());
    }

    public Igreja toEntity(IgrejaDTO igrejaDTO){
        Igreja igreja = new Igreja();
        igreja.setCulto(igrejaDTO.culto());
        igreja.setDataAtual(igrejaDTO.dataAtual());
        return igreja;
    }

}
