package com.hr.hrwork.controllers;

import com.hr.hrwork.repositories.WorkerRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping(value = "/workers")
@RequiredArgsConstructor
public class WorkerController {

    private final WorkerRepository repository;
    private final Environment env;

    @GetMapping
    public ResponseEntity<List<com.hr.hrwork.entities.Worker>> findAll() {
        List<com.hr.hrwork.entities.Worker> list = repository.findAll();
        return ResponseEntity.ok(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<com.hr.hrwork.entities.Worker> findById( @PathVariable int id) {

        log.info("PORT = " + env.getProperty("local.server.port"));

        com.hr.hrwork.entities.Worker obj = repository.findById(id).get();
        return ResponseEntity.ok(obj);
    }
}
