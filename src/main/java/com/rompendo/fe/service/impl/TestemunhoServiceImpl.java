package com.rompendo.fe.service.impl;

import com.rompendo.fe.dto.TestemunhoDTO;
import com.rompendo.fe.mapper.TestemunhoMapper;
import com.rompendo.fe.model.Testemunho;
import com.rompendo.fe.repository.TestemunhoRepository;
import com.rompendo.fe.service.TestemunhoService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class TestemunhoServiceImpl implements TestemunhoService {

   @Autowired
   private TestemunhoRepository repository;

   @Autowired
   private TestemunhoMapper testemunhoMapper;

    @Override
    public List<TestemunhoDTO> findAll() {
        return repository.findAll().stream().map(TestemunhoDTO::new).toList();
    }

    @Override
    public TestemunhoDTO post(TestemunhoDTO testemunhoDTO) {
        return testemunhoMapper.toDTO(repository.save(testemunhoMapper.toEntity(testemunhoDTO)));
    }

    @Override
    public TestemunhoDTO getOne(Long id) {
        return repository.findById(id).map(testemunhoMapper::toDTO).orElseThrow();
    }

    @Override
    public TestemunhoDTO update(Long id, TestemunhoDTO testemunhoDTO) {
      return repository.findById(id)
              .map(t -> {
                  t.setTitulo(testemunhoDTO.titulo());
                  t.setDescricao(testemunhoDTO.descricao());
                  return testemunhoMapper.toDTO(repository.save(t));
              }).orElseThrow();
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
