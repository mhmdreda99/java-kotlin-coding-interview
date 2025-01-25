/**
 * Service class to manage the game between two players.
 *
 * @property playerA The first player.
 * @property playerB The second player.
 * @constructor Creates a GameService with the specified players.
 */
package com.example.rps.application.service

import com.example.rps.application.game.Game
import com.example.rps.application.game.GameResult
import com.example.rps.domain.player.Player

class GameService(private val playerA: Player, private val playerB: Player) {
    private val game = Game(playerA, playerB)

    fun playGame(rounds: Int): GameResult = game.play(rounds)
}