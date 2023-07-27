package com.example.example_dto.mapper;

import com.example.example_dto.dto.ExampleDTO;
import com.example.example_dto.model.ExampleEntity;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper(componentModel = "Spring")
@Component
public interface ExampleMapper {
    ExampleEntity toEntity(ExampleDTO dto);

    ExampleDTO toDto(ExampleEntity entity);

    List<ExampleEntity> toEntity(List<ExampleDTO> dtoList);

    List<ExampleDTO> toDto(List<ExampleEntity> entityList);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateFromDTO(ExampleDTO dto, @MappingTarget ExampleEntity entity);
}
