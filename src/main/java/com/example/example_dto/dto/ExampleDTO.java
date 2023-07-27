package com.example.example_dto.dto;

import com.example.example_dto.model.ExampleEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExampleDTO {
    private Long id;
    private String name;
    private String description;

    public void toDto(ExampleEntity entity) {
        this.id = entity.getId();
        this.name = entity.getName();
        this.description = entity.getDescription();
    }
}
