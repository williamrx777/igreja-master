package com.rompendo.fe.controller;



import com.rompendo.fe.model.Igreja;
import com.rompendo.fe.repository.IgrejaRepository;

import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
    public ResponseEntity<Igreja> post(@RequestBody Igreja igreja){
        return ResponseEntity.status(HttpStatus.CREATED).body(igrejaRepository.save(igreja));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Igreja>> getOne(@PathVariable String id){
      return ResponseEntity.ok(igrejaRepository.findById(id));
    }

    @PutMapping
    public ResponseEntity<Igreja> put( @RequestBody Igreja igrejaExistente){
       return ResponseEntity.ok(igrejaRepository.save(igrejaExistente));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id){
        igrejaRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }



}
