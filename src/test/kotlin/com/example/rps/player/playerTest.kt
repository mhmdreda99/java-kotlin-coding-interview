/**
 * Unit tests for the Player classes.
 */
package com.example.rps.domain.player

import com.example.rps.domain.model.Move
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
import kotlin.test.assertTrue

class PlayerTest {
    @Test
    fun `test rock player always returns rock`() {
        val player = RockPlayer()
        repeat(100) {
            assertEquals(Move.ROCK, player.makeMove())
        }
    }

    @Test
    fun `test random player returns different moves`() {
        val player = RandomPlayer()
        val moves = mutableSetOf<Move>()
        repeat(100) {
            moves.add(player.makeMove())
        }
        assertTrue(moves.size > 1)
    }
}