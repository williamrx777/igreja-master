package com.rompendo.fe.controller;


import com.rompendo.fe.model.Testemunho;
import com.rompendo.fe.repository.TestemunhoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/testemunhos")

public class TestemunhoController {


    private final TestemunhoRepository testemunhoRepository;

    public TestemunhoController(TestemunhoRepository testemunhoRepository) {
        this.testemunhoRepository = testemunhoRepository;
    }


    @GetMapping
    public ResponseEntity<List<Testemunho>> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(testemunhoRepository.findAll());
    }

    @PostMapping
    public ResponseEntity<Testemunho> post(@RequestBody Testemunho testemunho){
        return ResponseEntity.status(HttpStatus.CREATED).body(testemunhoRepository.save(testemunho));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Testemunho>> getOne(@PathVariable UUID id){
        return ResponseEntity.ok(testemunhoRepository.findById(id));
    }

    @PutMapping
    public ResponseEntity<Testemunho> update( @RequestBody Testemunho testemunho){
        return ResponseEntity.ok(testemunhoRepository.save(testemunho));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable UUID id){
        testemunhoRepository.deleteById(id);
        return  ResponseEntity.noContent().build();
    }

}
