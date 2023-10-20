package com.rompendo.fe.repository;

import com.rompendo.fe.model.Testemunho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TestemunhoRepository extends JpaRepository<Testemunho, UUID> {

}

