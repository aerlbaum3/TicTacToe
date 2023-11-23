import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TicTacToeTest {

	@Test
	public void testGetTurn() {
        TicTacToeGame game = new TicTacToeGame();
        assertEquals(1, game.getTurn());
    }
//	public void testDisplayWinner() {
//        TicTacToeGame game = new TicTacToeGame();
//        assertEquals("X won.", game.displayWinner("X", true));
//    }
}


