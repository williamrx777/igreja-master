package com.rompendo.fe.controller;



import com.rompendo.fe.dto.IgrejaRecord;
import com.rompendo.fe.model.Igreja;
import com.rompendo.fe.repository.IgrejaRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/igreja")
public class IgrejaController {


    private final IgrejaRepository igrejaRepository;

    public IgrejaController(IgrejaRepository igrejaRepository) {
        this.igrejaRepository = igrejaRepository;

    }


    @GetMapping
    public ResponseEntity<List<Igreja>> findAll(){
        return ResponseEntity.ok(igrejaRepository.findAll());
    }

    @PostMapping
    public ResponseEntity<Igreja> post(@RequestBody IgrejaRecord igreja){
        var igrejaNovo = new Igreja();
        BeanUtils.copyProperties(igreja, igrejaNovo);
        return ResponseEntity.status(HttpStatus.CREATED).body(igrejaRepository.save(igrejaNovo));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Igreja> getOne(@PathVariable UUID id){
        Optional<Igreja> igreja = igrejaRepository.findById(id);
        if (igreja.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }else{
            return ResponseEntity.status(HttpStatus.OK).body(igreja.get());
        }

    }

    @PutMapping("/{id}")
    public ResponseEntity<Igreja> put(@PathVariable UUID id , @RequestBody IgrejaRecord igreja){
        Optional<Igreja> igreja0 = igrejaRepository.findById(id);
        if (igreja0.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }else{
            var igrejaAtualizada = igreja0.get();
            BeanUtils.copyProperties(igreja, igrejaAtualizada);
            return ResponseEntity.status(HttpStatus.OK).body(igrejaRepository.save(igrejaAtualizada));
        }

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable UUID id){
        igrejaRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }



}
