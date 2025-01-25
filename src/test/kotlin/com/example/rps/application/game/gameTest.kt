package com.example.rps.application.game

import com.example.rps.domain.model.Move
import com.example.rps.domain.player.Player
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
import io.mockk.every
import io.mockk.mockk

class GameTest {
    @Test
    fun `test game result totals equal rounds played`() {
        val game = Game(mockk(), mockk())
        every { game.play(100) } returns GameResult(31, 37, 32)
        val result = game.play(100)
        assertEquals(100, result.playerAWins + result.playerBWins + result.draws)
    }

    @Test
    fun `test rock versus rock results in draw`() {
        val playerA = mockk<Player>()
        val playerB = mockk<Player>()
        every { playerA.makeMove() } returns Move.ROCK
        every { playerB.makeMove() } returns Move.ROCK

        val game = Game(playerA, playerB)
        val result = game.play(1)
        assertEquals(GameResult(0, 0, 1), result)
    }
}