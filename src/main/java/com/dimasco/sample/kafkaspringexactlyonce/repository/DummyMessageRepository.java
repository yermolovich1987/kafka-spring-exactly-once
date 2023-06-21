package com.dimasco.sample.kafkaspringexactlyonce.repository;

import com.dimasco.sample.kafkaspringexactlyonce.processing.model.DummyMessage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DummyMessageRepository extends JpaRepository<DummyMessage, Long> {}
