package Expressions_Statements.PlayingCat;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayingCatTest {

    @Test
    void isCatPlaying() {
        assertFalse(PlayingCat.isCatPlaying(true, 10));
        assertFalse(PlayingCat.isCatPlaying(false, 36));
        assertTrue(PlayingCat.isCatPlaying(false, 35));
    }
}