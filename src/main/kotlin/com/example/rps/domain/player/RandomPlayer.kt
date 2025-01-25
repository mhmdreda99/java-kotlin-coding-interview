package com.example.rps.domain.player

import com.example.rps.domain.model.Move

class RandomPlayer : Player {
    override fun makeMove(): Move = Move.values().random()
}