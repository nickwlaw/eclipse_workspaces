
public class MakeChocolateApp {

	public static void main(String[] args) {

		System.out.println("Let's make some chocolate!\n");
		String rules = "Here's the rules:\n" + "- One small chocolate bar weighs 1 kilo.\n"
				+ "- One BIG chocolate bar weighs 5 kilos.\n"
				+ "- I'm going to give you orders for kilos of chocolate from 1 to 20,\n"
				+ "  and you tell me how many BIG bars and small bars you have on hand.\n"
				+ "- I'll help you to fill the orders using the fewest number of chocolate bars possible.\n\n"
				+ "Sound good? Let's play!\n\n";
		System.out.println(rules);
		boolean cont = true;
		while (cont == true) {
			int order = getOrder();
			System.out.println("You have an order for " + order + " kilos of chocolate.\n");
			int smallBars = Console.getInt("How many small chocolate bars do you have? ");
			int bigBars = Console.getInt("How many BIG chocolate bars do you have? ");
			System.out.println();
			int result = makeChocolate(smallBars, bigBars, order);
			if (result == -1)
				System.out.println("You do not have enough chocolate to fill this order");
			if (result >= 0)
				System.out.println("You need " + result + " small bars of chocolate to fill this order.\n");
			cont = Console.askToContinue();
		}
		System.out.println("Goodbye!");
	}

	private static int getOrder() {
		int o = (int) (Math.random() * 100 / 5);
		return o;
	}

	private static int makeChocolate(int sb, int bb, int goal) {
		int a = 0;
		int i = goal - (bb * 5);
		if (i <= 0) return a;
		if (i > 0) {
			i -= sb;
			if (i <= 0) {
				a = sb + i;
				return a;
			} else {
				a = -1;
				return a;
			}
		}
		return a;
	}
}
