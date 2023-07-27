package com.example.example_dto.controller;

import com.example.example_dto.dto.ExampleDTO;
import com.example.example_dto.service.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping("/example")
public class ExampleController {
    @Autowired
    ExampleService exampleService;

    @PostMapping("")
    public ResponseEntity<ExampleDTO> create(@RequestBody ExampleDTO dto) {
        ExampleDTO exampleDTO = exampleService.create(dto);
        return ResponseEntity.ok(exampleDTO);
    }

    @GetMapping("{id}")
    public ResponseEntity<ExampleDTO> getDetail(@PathVariable Long id) {
        ExampleDTO exampleDTO = exampleService.getDetails(id).get();
        return ResponseEntity.ok(exampleDTO);
    }

    @PutMapping("")
    public ResponseEntity<ExampleDTO> update(@RequestBody ExampleDTO dto) {
        ExampleDTO exampleDTO = exampleService.update(dto);
        return ResponseEntity.ok(exampleDTO);
    }
}
