package com.example.example_dto.service;

import com.example.example_dto.dto.ExampleDTO;
import com.example.example_dto.mapper.ExampleMapper;
import com.example.example_dto.model.ExampleEntity;
import com.example.example_dto.repository.ExampleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExampleService {
    @Autowired
    private ExampleRepository repository;
    @Autowired
    private ExampleMapper mapper;

    public ExampleDTO create(ExampleDTO dto) {
        /**
         * Using Mapstruct
         */
//        ExampleEntity exampleEntity = mapper.toEntity(dto);
        /**
         * Don't use Mapstruct
         */
        ExampleEntity exampleEntity = new ExampleEntity();
        exampleEntity.toEntity(dto);
        repository.save(exampleEntity);
        return dto;
    }

    public ExampleDTO update(ExampleDTO dto) {
        ExampleEntity exampleEntity = repository.findById(dto.getId()).get();
        /**
         * Using Mapstruct
         */
//        mapper.updateFromDTO(dto, exampleEntity);
//        mapper.toDto(exampleEntity);
        /**
         * Don't use Mapstruct
         */
        exampleEntity.toEntity(dto);
        repository.save(exampleEntity);
        return dto;
    }

    public Optional<ExampleDTO> getDetails(Long id) {
        return Optional.ofNullable(mapper.toDto(repository.findById(id).get()));
    }

}
