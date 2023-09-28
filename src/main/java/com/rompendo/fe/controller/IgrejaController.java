package com.rompendo.fe.controller;

import com.rompendo.fe.dto.IgrejaDTO;
import com.rompendo.fe.model.Igreja;
import com.rompendo.fe.service.IgrejaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/igreja")
public class IgrejaController {

    @Autowired
    private IgrejaService service;
    @GetMapping
    public ResponseEntity<List<IgrejaDTO>> findAll(){
        var lista = service.findAll();
        return ResponseEntity.ok(lista);
    }

    @PostMapping
    public ResponseEntity<IgrejaDTO> post(@RequestBody IgrejaDTO igreja){
        service.post(igreja);
        return ResponseEntity.status(HttpStatus.CREATED).body(igreja);
    }

    @GetMapping("/{id}")
    public ResponseEntity<IgrejaDTO> getOne(@PathVariable Long id){
      return ResponseEntity.ok(service.getOne(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<IgrejaDTO> put(@PathVariable Long id, @RequestBody IgrejaDTO igrejaExistente){

       return ResponseEntity.ok(service.update(id, igrejaExistente));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        service.delete(id);
        return ResponseEntity.noContent().build();
    }



}
