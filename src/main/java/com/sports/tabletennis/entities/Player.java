package com.sports.tabletennis.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "players", schema="playerdb")
public class Player {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "player_id")
    private Long id;

    @NotNull
    @Column(name = "player_name")
    private String playerName;

    @NotNull
    @Column(name = "player_rank")
    private String rank;
}
