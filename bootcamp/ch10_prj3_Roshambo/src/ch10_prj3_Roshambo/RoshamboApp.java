package ch10_prj3_Roshambo;

public class RoshamboApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Roshambo Game!\n");
		String name = Console.getString("Enter your name: ");
		Player1 player = new Player1(name);
		boolean cont = true;
		while (cont == true) {
			String opponentName = Console.getString("Would you like to play Bart or Lisa? (b/l): ");
			if (opponentName.equalsIgnoreCase("b")) {
				Bart b = new Bart();
				String choice = Console.getString("rock, paper, or scissors? (r,p,s): ");
				if (choice.equalsIgnoreCase("r")) {
					player.setChoice(Roshambo.ROCK);
					b.setChoice(b.generateRoshambo());
					System.out.println(player.getName() + ": " + player.getChoice());
					System.out.println(b.getName() + ": " + b.getChoice());
					if (player.getChoice() == b.getChoice())
						System.out.println("Draw!");
					if (b.getChoice() == Roshambo.SCISSORS)
						System.out.println("You win!");
					if (b.getChoice() == Roshambo.PAPER)
						System.out.println("You lose!");

				} else if (choice.equalsIgnoreCase("p")) {
					player.setChoice(Roshambo.PAPER);
					b.setChoice(b.generateRoshambo());
					System.out.println(player.getName() + ": " + player.getChoice());
					System.out.println(b.getName() + ": " + b.getChoice());
					if (player.getChoice() == b.getChoice())
						System.out.println("Draw!");
					if (b.getChoice() == Roshambo.ROCK)
						System.out.println("You win!");
					if (b.getChoice() == Roshambo.SCISSORS)
						System.out.println("You lose!");

				} else if (choice.equalsIgnoreCase("s")) {
					player.setChoice(Roshambo.SCISSORS);
					b.setChoice(b.generateRoshambo());
					System.out.println(player.getName() + ": " + player.getChoice());
					System.out.println(b.getName() + ": " + b.getChoice());
					if (player.getChoice() == b.getChoice())
						System.out.println("Draw!");
					if (b.getChoice() == Roshambo.PAPER)
						System.out.println("You win!");
					if (b.getChoice() == Roshambo.ROCK)
						System.out.println("You lose!");

				} else
					System.out.println("You must play rock, paper, or scissors");
				
				
			} else if (opponentName.equalsIgnoreCase("l")) {
				Lisa l = new Lisa();
				String choice = Console.getString("rock, paper, or scissors? (r,p,s): ");
				if (choice.equalsIgnoreCase("r")) {
					player.setChoice(Roshambo.ROCK);
					l.setChoice(l.generateRoshambo());
					System.out.println(player.getName() + ": " + player.getChoice());
					System.out.println(l.getName() + ": " + l.getChoice());
					if (player.getChoice() == l.getChoice())
						System.out.println("Draw!");
					if (l.getChoice() == Roshambo.SCISSORS)
						System.out.println("You win!");
					if (l.getChoice() == Roshambo.PAPER)
						System.out.println("You lose!");

				} else if (choice.equalsIgnoreCase("p")) {
					player.setChoice(Roshambo.PAPER);
					l.setChoice(l.generateRoshambo());
					System.out.println(player.getName() + ": " + player.getChoice());
					System.out.println(l.getName() + ": " + l.getChoice());
					if (l.getChoice() == Roshambo.ROCK)
						System.out.println("You win!");
					if (l.getChoice() == Roshambo.SCISSORS)
						System.out.println("You lose!");

				} else if (choice.equalsIgnoreCase("s")) {
					player.setChoice(Roshambo.SCISSORS);
					l.setChoice(l.generateRoshambo());
					System.out.println(player.getName() + ": " + player.getChoice());
					System.out.println(l.getName() + ": " + l.getChoice());
					if (l.getChoice() == Roshambo.PAPER)
						System.out.println("You win!");
					if (l.getChoice() == Roshambo.ROCK)
						System.out.println("You lose!");

				} else
					System.out.println("You must play rock, paper, or scissors");
				

			} else
				System.out.println("You must choose Bart or Lisa.");
			
			cont = Console.askToContinue();
		}
	}

}
