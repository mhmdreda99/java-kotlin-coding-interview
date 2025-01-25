package com.example.rps.application.game

import com.example.rps.domain.model.Move
import com.example.rps.domain.model.Result
import com.example.rps.domain.player.Player

class Game(private val playerA: Player, private val playerB: Player) {
    fun play(rounds: Int): GameResult {
        var playerAWins = 0
        var playerBWins = 0
        var draws = 0

        repeat(rounds) {
            when (evaluateRound(playerA.makeMove(), playerB.makeMove())) {
                Result.WIN -> playerAWins++
                Result.LOSE -> playerBWins++
                Result.DRAW -> draws++
            }
        }

        return GameResult(playerAWins, playerBWins, draws)
    }

    private fun evaluateRound(moveA: Move, moveB: Move): Result = when {
        moveA == moveB -> Result.DRAW
        (moveA == Move.ROCK && moveB == Move.SCISSORS) ||
                (moveA == Move.PAPER && moveB == Move.ROCK) ||
                (moveA == Move.SCISSORS && moveB == Move.PAPER) -> Result.WIN
        else -> Result.LOSE
    }
}