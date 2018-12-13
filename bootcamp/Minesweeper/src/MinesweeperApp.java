
public class MinesweeperApp {

	public static void main(String[] args) {
		Console.println("Welcome to Minesweeper!\n");
		Console.println("The goal is to find all of the mines on the map and flag them for safety.");
		Console.println("Dig at a space by choosing a column and a row.\n");
		Console.println("If you see a number... LOOK OUT!!");
		Console.println("There are that many mines surrounding this space.\n");
		Console.println("Flag a space by entering \"10\" for the column and choosing a column and row to flag.");
		Console.println("Keep digging until you uncover enough of the map to find all of the mines...");
		Console.println("... or you detonate a mine.\n");
		Console.println("Let's play!\n");
		boolean cont = true;
		while (cont == true) {
			GameBoard gb = new GameBoard();
			Console.println(gb);
			boolean isPlaying = true;
			while (isPlaying == true) {
				int x = Console.getInt("Choose column: ", 0, 10);
				if (x == 10) {
					Console.println("");
					int x2 = Console.getInt("Choose column to flag: ", 0, 9);
					int y2 = Console.getInt("Choose row to flag:    ", 0, 9);
					isPlaying = gb.flagGameSpace(x2, y2);
				} else {
					int y = Console.getInt("Choose row:    ", 0, 9);
					isPlaying = gb.checkGameSpace(x, y);
				}
				Console.println("");
				Console.println(gb);
				Console.println("");
			}
			cont = Console.askToContinue();
		}
		Console.println("");
		Console.println("Goodbye!");
	}

}
