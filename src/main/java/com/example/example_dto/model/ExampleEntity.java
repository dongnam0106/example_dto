package com.example.example_dto.model;

import com.example.example_dto.dto.ExampleDTO;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "example")
public class ExampleEntity {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;

    public void toEntity(ExampleDTO dto) {
        this.id = dto.getId();
        this.name = dto.getName();
        this.description = dto.getDescription();
    }
}
