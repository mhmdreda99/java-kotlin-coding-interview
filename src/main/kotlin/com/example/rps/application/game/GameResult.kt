/**
 * Data class representing the result of a Rock-Paper-Scissors game.
 *
 * @property playerAWins The number of games won by Player A.
 * @property playerBWins The number of games won by Player B.
 * @property draws The number of games that ended in a draw.
 */
package com.example.rps.application.game

data class GameResult(
    val playerAWins: Int,
    val playerBWins: Int,
    val draws: Int
) {
    override fun toString(): String {
        val total = playerAWins + playerBWins + draws
        return """
            Player A wins $playerAWins of $total games
            Player B wins $playerBWins of $total games
            Draws: $draws of $total games
        """.trimIndent()
    }
}
