package com.sports.tabletennis.services;

import com.sports.tabletennis.repositories.PlayerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ContextConfiguration
@SpringBootTest
public class TableTennisIT {
    @Autowired
    TableTennisServiceImpl tableTennisServiceImpl;

    @Autowired
    PlayerRepository playerRepository;

    @Test
    void getPlayersSuccess() {
        assertEquals(2, playerRepository.count());
    }
}
