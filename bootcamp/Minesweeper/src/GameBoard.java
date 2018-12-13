import java.util.Arrays;

public class GameBoard {

	private String[][] gb;
	private MineField mf;
	private int correctFlags = 0;

	public GameBoard() {
		mf = new MineField();
		gb = new String[10][10];
		for (String[] row : gb)
			Arrays.fill(row, "///");
	}
	
	public boolean flagGameSpace(int x, int y) {
		if (!gb[x][y].equals("-@-") && mf.getMineFieldValue(x, y) == -1)
			correctFlags++;
		if (gb[x][y].equals("-@-") && mf.getMineFieldValue(x, y) == -1)
			correctFlags--;
		if (gb[x][y].equals("-@-"))
			gb[x][y] = "///";
		else if (gb[x][y].equals("///"))
			gb[x][y] = "-@-";

		if (correctFlags == 15) {
			Console.println("");
			Console.println("You found all of the mines!");
			Console.println("You're a minesweeping master.");
			return false;
		}
		return true;
	}

	public boolean checkGameSpace(int x, int y) {
		if (x < 0 || x > 9 || y < 0 || y > 9)
			return true;
		if (gb[x][y].equals("   "))
			return true;
		int gs = mf.getMineFieldValue(x, y);
		
		if (gs == -1) {
			for (int i = 0; i <= 9; i++) {
				for (int j = 0; j <= 9; j++) {
					if (mf.getMineFieldValue(i, j) == -1)
						gb[i][j] = "O~*";
				}
			}
			Console.println("");
			Console.println("Oh no... you detonated a mine!");
			Console.println("Better luck next time.");
			return false;
		}
		
		if (gs == 0) {
			gb[x][y] = "   ";
			if (y + 1 <= 9) {
				if (mf.getMineFieldValue(x, y + 1) != -1)
					checkGameSpace(x, y + 1);
			}
			if (x + 1 <= 9 && y + 1 <= 9) {
				if (mf.getMineFieldValue(x + 1, y + 1) != -1)
					checkGameSpace(x + 1, y + 1);
			}
			if (x + 1 <= 9) {
				if (mf.getMineFieldValue(x + 1, y) != -1)
					checkGameSpace(x + 1, y);
			}
			if (x + 1 <= 9 && y - 1 >= 0) {
				if (mf.getMineFieldValue(x + 1, y - 1) != -1)
					checkGameSpace(x + 1, y - 1);
			}
			if (y - 1 >= 0) {
				if (mf.getMineFieldValue(x, y - 1) != -1)
					checkGameSpace(x, y - 1);
			}
			if (x - 1 >= 0 && y - 1 >= 0) {
				if (mf.getMineFieldValue(x - 1, y - 1) != -1)
					checkGameSpace(x - 1, y - 1);
			}
			if (x - 1 >= 0) {
				if (mf.getMineFieldValue(x - 1, y) != -1)
					checkGameSpace(x - 1, y);
			}
			if (x - 1 >= 0 && y + 1 <= 9) {
				if (mf.getMineFieldValue(x - 1, y + 1) != -1)
					checkGameSpace(x - 1, y + 1);
			}
		}
		if (gs > 0)
			gb[x][y] = " " + gs + " ";
		return true;
	}
	
	@Override
	public String toString() {

		String gameBoardHeader =  "     0   1   2   3   4   5   6   7   8   9  \n";
		String gameBoardDivider = "   +---+---+---+---+---+---+---+---+---+---+\n";
		String gameBoardFormatted = gameBoardHeader + gameBoardDivider;
		for (int row = 0; row <= 9; row++) {
			String gameBoardRow = " " + row + " |";
			for (int column = 0; column <= 9; column++) {
				gameBoardRow += gb[column][row] + "|";
			}
			gameBoardRow += "\n" + gameBoardDivider;
			gameBoardFormatted += gameBoardRow;
		}
		return gameBoardFormatted;

//		String gameBoardRow0 =    " 0 |";
//		for (int i = 0; i <= 9; i++) {
//			gameBoardRow0 += gb[i][0]+"|";
//		}
//		gameBoardRow0 += "\n";
//		String gameBoardRow1 =    " 1 |";
//		for (int i = 0; i <= 9; i++) {
//			gameBoardRow1 += gb[i][1]+"|";
//		}
//		gameBoardRow1 += "\n";
//		String gameBoardRow2 =    " 2 |";
//		for (int i = 0; i <= 9; i++) {
//			gameBoardRow2 += gb[i][2]+"|";
//		}
//		gameBoardRow2 += "\n";
//		String gameBoardRow3 =    " 3 |";
//		for (int i = 0; i <= 9; i++) {
//			gameBoardRow3 += gb[i][3]+"|";
//		}
//		gameBoardRow3 += "\n";
//		String gameBoardRow4 =    " 4 |";
//		for (int i = 0; i <= 9; i++) {
//			gameBoardRow4 += gb[i][4]+"|";
//		}
//		gameBoardRow4 += "\n";
//		String gameBoardRow5 =    " 5 |";
//		for (int i = 0; i <= 9; i++) {
//			gameBoardRow5 += gb[i][5]+"|";
//		}
//		gameBoardRow5 += "\n";
//		String gameBoardRow6 =    " 6 |";
//		for (int i = 0; i <= 9; i++) {
//			gameBoardRow6 += gb[i][6]+"|";
//		}
//		gameBoardRow6 += "\n";
//		String gameBoardRow7 =    " 7 |";
//		for (int i = 0; i <= 9; i++) {
//			gameBoardRow7 += gb[i][7]+"|";
//		}
//		gameBoardRow7 += "\n";
//		String gameBoardRow8 =    " 8 |";
//		for (int i = 0; i <= 9; i++) {
//			gameBoardRow8 += gb[i][8]+"|";
//		}
//		gameBoardRow8 += "\n";
//		String gameBoardRow9 =    " 9 |";
//		for (int i = 0; i <= 9; i++) {
//			gameBoardRow9 += gb[i][9]+"|";
//		}
//		gameBoardRow9 += "\n";

//		String gameBoardFormatted = gameBoardHeader
//								  + gameBoardDivider
//								  + gameBoardRow0
//								  + gameBoardDivider
//								  + gameBoardRow1
//								  + gameBoardDivider
//								  + gameBoardRow2
//								  + gameBoardDivider
//								  + gameBoardRow3
//								  + gameBoardDivider
//								  + gameBoardRow4
//								  + gameBoardDivider
//								  + gameBoardRow5
//								  + gameBoardDivider
//								  + gameBoardRow6
//								  + gameBoardDivider
//								  + gameBoardRow7
//								  + gameBoardDivider
//								  + gameBoardRow8
//								  + gameBoardDivider
//								  + gameBoardRow9
//								  + gameBoardDivider;
//		return gameBoardFormatted;

	}
}
