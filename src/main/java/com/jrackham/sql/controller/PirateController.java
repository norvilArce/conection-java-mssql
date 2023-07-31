package com.jrackham.sql.controller;

import com.jrackham.sql.model.Pirate;
import com.jrackham.sql.service.PirateService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/pirate")
@CrossOrigin(origins = "*")
public class PirateController {

    private final PirateService service;

    public PirateController(PirateService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<Pirate>> pirateList(){
        return new ResponseEntity<List<Pirate>>(service.findAll(), HttpStatus.OK);
    }
}
