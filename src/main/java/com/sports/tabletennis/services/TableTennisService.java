package com.sports.tabletennis.services;

import com.sports.tabletennis.entities.Player;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TableTennisService {
    List<Player> getPlayers();
}
