package com.sports.tabletennis.mappers;

import com.sports.tabletennis.entities.Player;
import com.sports.tabletennis.models.PlayerDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PlayerMapper {
    PlayerDto playerToPlayerDto(Player player);

    Player playerDtoToPlayer(PlayerDto playerDto);
}
