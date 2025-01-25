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
        val playerA = mockk<Player>()
        val playerB = mockk<Player>()
        every { playerA.makeMove() } returns Move.ROCK
        every { playerB.makeMove() } returns Move.PAPER

        val game = Game(playerA, playerB)
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
    // More test cases
    @Test
    fun `test paper beats rock`() {
        val playerA = mockk<Player>()
        val playerB = mockk<Player>()
        every { playerA.makeMove() } returns Move.PAPER
        every { playerB.makeMove() } returns Move.ROCK

        val game = Game(playerA, playerB)
        val result = game.play(1)
        assertEquals(GameResult(1, 0, 0), result)
    }
    // Add for Rock VS Scissors
    @Test
    fun `test rock beats scissors`() {
        val playerA = mockk<Player>()
        val playerB = mockk<Player>()
        every { playerA.makeMove() } returns Move.ROCK
        every { playerB.makeMove() } returns Move.SCISSORS

        val game = Game(playerA, playerB)
        val result = game.play(1)
        assertEquals(GameResult(1, 0, 0), result)
    }
    // Add for Scissors VS Paper
    @Test
    fun `test scissors beats paper`() {
        val playerA = mockk<Player>()
        val playerB = mockk<Player>()
        every { playerA.makeMove() } returns Move.SCISSORS
        every { playerB.makeMove() } returns Move.PAPER

        val game = Game(playerA, playerB)
        val result = game.play(1)
        assertEquals(GameResult(1, 0, 0), result)
    }
}