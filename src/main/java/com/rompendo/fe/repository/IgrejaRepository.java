package com.rompendo.fe.repository;

import com.rompendo.fe.model.Igreja;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface IgrejaRepository extends JpaRepository<Igreja, UUID> {
}
