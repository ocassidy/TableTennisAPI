package com.sports.tabletennis.services;

import com.sports.tabletennis.models.PlayerDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TableTennisService {
    List<PlayerDto> getPlayers();
}
