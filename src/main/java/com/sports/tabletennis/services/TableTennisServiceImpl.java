package com.sports.tabletennis.services;

import com.sports.tabletennis.mappers.PlayerMapper;
import com.sports.tabletennis.models.PlayerDto;
import com.sports.tabletennis.repositories.PlayerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TableTennisServiceImpl implements TableTennisService {
    private final PlayerRepository playerRepository;
    private final PlayerMapper playerMapper;

    public TableTennisServiceImpl(PlayerRepository playerRepository, PlayerMapper playerMapper) {
        this.playerRepository = playerRepository;
        this.playerMapper = playerMapper;
    }

    public List<PlayerDto> getPlayers() {
        return playerRepository
                .findAll()
                .stream()
                .map(playerMapper::playerToPlayerDto)
                .collect(Collectors.toList());
    }
}
