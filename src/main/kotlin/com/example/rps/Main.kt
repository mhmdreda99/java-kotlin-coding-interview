/**
 * The main entry point of the Rock-Paper-Scissors application.
 * 
 * This function initializes the game service with two players: a random player and a rock player.
 * It then plays 100 rounds of the game and prints the result.
 */
package com.example.rps
import com.example.rps.application.service.GameService
import com.example.rps.domain.player.RandomPlayer
import com.example.rps.domain.player.RockPlayer

fun main() {
    val gameService = GameService(RandomPlayer(), RockPlayer())
    val result = gameService.playGame(100)
    println(result)
}