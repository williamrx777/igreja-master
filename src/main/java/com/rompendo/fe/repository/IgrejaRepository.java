package com.rompendo.fe.repository;

import com.rompendo.fe.model.Igreja;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IgrejaRepository extends MongoRepository<Igreja, String> {
}
