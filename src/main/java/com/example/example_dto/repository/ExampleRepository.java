package com.example.example_dto.repository;

import com.example.example_dto.model.ExampleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExampleRepository extends JpaRepository<ExampleEntity, Long> {
}
