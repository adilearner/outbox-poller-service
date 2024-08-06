package com.javatechie.repository;

import com.javatechie.entity.Outbox;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OutboxRepository extends JpaRepository<Outbox,Long> {
    //this will return all unprocessed order
    List<Outbox> findByProcessedFalse();
}
