package com.rompendo.fe.service;

import com.rompendo.fe.dto.IgrejaDTO;
import com.rompendo.fe.model.Igreja;

import java.util.List;
import java.util.Optional;

public interface IgrejaService {

    List<IgrejaDTO> findAll();

    IgrejaDTO post(IgrejaDTO igreja);

    IgrejaDTO getOne(Long id);

    IgrejaDTO update(Long id, IgrejaDTO igreja);

    void delete(Long id);

}
