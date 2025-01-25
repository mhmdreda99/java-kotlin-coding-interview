package com.example.rps
import com.example.rps.application.service.GameService
import com.example.rps.domain.player.RandomPlayer
import com.example.rps.domain.player.RockPlayer

fun main() {
    val gameService = GameService(RandomPlayer(), RockPlayer())
    val result = gameService.playGame(100)
    println(result)
}