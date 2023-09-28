package com.rompendo.fe.controller;

import com.rompendo.fe.dto.TestemunhoDTO;
import com.rompendo.fe.model.Testemunho;
import com.rompendo.fe.service.TestemunhoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/testemunhos")
public class TestemunhoController {

    @Autowired
    private TestemunhoService service;
    @GetMapping
    public ResponseEntity<List<TestemunhoDTO>> findAll(){
        var lista = service.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(lista);
    }

    @PostMapping
    public ResponseEntity<TestemunhoDTO> post(@RequestBody TestemunhoDTO testemunho){
        service.post(testemunho);
        return ResponseEntity.status(HttpStatus.CREATED).body(testemunho);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TestemunhoDTO> getOne(@PathVariable Long id){
        return ResponseEntity.ok(service.getOne(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<TestemunhoDTO> update(@PathVariable Long id, @RequestBody TestemunhoDTO testemunho){

        return ResponseEntity.ok(service.update(id, testemunho));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        service.delete(id);
        return  ResponseEntity.noContent().build();
    }

}
