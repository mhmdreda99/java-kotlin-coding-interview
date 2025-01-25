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
