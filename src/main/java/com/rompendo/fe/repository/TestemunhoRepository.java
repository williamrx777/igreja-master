package com.rompendo.fe.repository;

import com.rompendo.fe.model.Testemunho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Repository;

@Repository
public interface TestemunhoRepository extends MongoRepository<Testemunho, String> {

}

