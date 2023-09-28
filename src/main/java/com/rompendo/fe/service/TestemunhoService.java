package com.rompendo.fe.service;

import com.rompendo.fe.dto.TestemunhoDTO;
import com.rompendo.fe.model.Testemunho;

import java.util.List;
import java.util.Optional;

public interface TestemunhoService {

    List<TestemunhoDTO> findAll();
    TestemunhoDTO post(TestemunhoDTO testemunhoDTO);

    TestemunhoDTO getOne(Long id);

    TestemunhoDTO update(Long id, TestemunhoDTO testemunhoDTO);

    void delete(Long id);


}
