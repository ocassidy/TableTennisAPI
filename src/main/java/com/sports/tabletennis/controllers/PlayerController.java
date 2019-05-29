package com.sports.tabletennis.controllers;

import com.sports.tabletennis.models.PlayerDto;
import com.sports.tabletennis.services.TableTennisServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.HttpStatus.OK;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class PlayerController {
    private final TableTennisServiceImpl tableTennisServiceImpl;

    public PlayerController(TableTennisServiceImpl tableTennisServiceImpl) {
        this.tableTennisServiceImpl = tableTennisServiceImpl;
    }

    @GetMapping(value = "/players", produces = "application/json")
    public ResponseEntity<List<PlayerDto>> getPlayers() {
        return new ResponseEntity<>(tableTennisServiceImpl.getPlayers(), OK);
    }
}
