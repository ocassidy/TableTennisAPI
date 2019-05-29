package com.sports.tabletennis.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PlayerDto {
    @Id
    private Long id;

    @NotNull
    private String playerName;

    @NotNull
    private String rank;
}
