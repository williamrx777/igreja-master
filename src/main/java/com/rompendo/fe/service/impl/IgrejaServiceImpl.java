package com.rompendo.fe.service.impl;

import com.rompendo.fe.dto.IgrejaDTO;
import com.rompendo.fe.mapper.IgrejaMapper;
import com.rompendo.fe.repository.IgrejaRepository;
import com.rompendo.fe.repository.TestemunhoRepository;
import com.rompendo.fe.service.IgrejaService;
import com.rompendo.fe.service.TestemunhoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IgrejaServiceImpl implements IgrejaService {

  @Autowired
  private IgrejaRepository igrejaRepository;

  @Autowired
  private TestemunhoRepository testemunhoRepository;

  @Autowired
  private TestemunhoService testemunhoService;

  @Autowired
  private IgrejaMapper igrejaMapper;
    @Override
    public List<IgrejaDTO> findAll() {
        return igrejaRepository.findAll().stream().map(igrejaMapper::toDTO).toList();
    }

    @Override
    public IgrejaDTO post(IgrejaDTO igreja) {
        return igrejaMapper.toDTO(igrejaRepository.save(igrejaMapper.toEntity(igreja)));
    }

    @Override
    public IgrejaDTO getOne(Long id) {
        return igrejaRepository.findById(id).map(igrejaMapper::toDTO).orElseThrow();
    }

    @Override
    public IgrejaDTO update(Long id, IgrejaDTO igreja) {

        return igrejaRepository.findById(id)
                .map(i -> {
            i.setCulto(igreja.culto());
            i.setDataAtual(igreja.dataAtual());
            return igrejaMapper.toDTO(igrejaRepository.save(i));
        }).orElseThrow();
    }

    @Override
    public void delete(Long id) {
        igrejaRepository.deleteById(id);
    }





}
