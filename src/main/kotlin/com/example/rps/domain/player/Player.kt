package com.example.rps.domain.player

import com.example.rps.domain.model.Move

interface Player {
    fun makeMove(): Move
}