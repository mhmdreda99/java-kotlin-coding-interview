package com.example.rps.domain.player

import com.example.rps.domain.model.Move

class RockPlayer : Player {
    override fun makeMove(): Move = Move.ROCK
}
