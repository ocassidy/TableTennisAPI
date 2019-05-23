package com.sports.tabletennis.services;

import com.sports.tabletennis.entities.Player;
import com.sports.tabletennis.repositories.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TableTennisServiceImpl implements TableTennisService{
    @Autowired
    private PlayerRepository playerRepository;

    public List<Player> getPlayers(){
        return playerRepository.findAll();
    }
}
