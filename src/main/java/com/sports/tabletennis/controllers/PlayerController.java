package com.sports.tabletennis.controllers;

import com.sports.tabletennis.entities.Player;
import com.sports.tabletennis.services.TableTennisServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PlayerController {
    @Autowired
    private TableTennisServiceImpl tableTennisServiceImpl;

    @GetMapping(value = "/players", produces = "application/json")
    public List<Player> getPlayers() {
        return tableTennisServiceImpl.getPlayers();
    }
}
