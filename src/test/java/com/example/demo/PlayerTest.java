package com.example.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {
    private Player testPlayer;

    @BeforeEach
    void setUp() {
        testPlayer = new Player("Tester");
    }

    @Test
    void getPlayerName() {
        assertEquals("Tester",testPlayer.getPlayerName());
    }

    @Test
    void makePlayerNullName() {
        assertThrows(IllegalArgumentException.class, () -> new Player(null));
    }

    @Test
    void makePlayerEmptyName() {
        assertThrows(IllegalArgumentException.class, () -> new Player(""));
    }

    @Test
    void getPlayerMoveNull() {
        assertNull(testPlayer.getPlayerMove());
    }

    @Test
    void getPlayerMove() {
        assertNull(testPlayer.getPlayerMove());
    }

    @Test
    void setPlayerMove() {
        testPlayer.setPlayerMove(" rOck ");
        assertEquals(testPlayer.getPlayerMove(),Move.ROCK);
    }

    @Test
    void playerHasNotMadeMove() {
        assertFalse(testPlayer.playerHasMadeMove());
    }

    @Test
    void playerHasMadeMove() {
        testPlayer.setPlayerMove("paper");
        assertTrue(testPlayer.playerHasMadeMove());
    }
}