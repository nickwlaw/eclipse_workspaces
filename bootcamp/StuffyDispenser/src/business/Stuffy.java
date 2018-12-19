package business;

import java.util.ArrayList;

import db.StuffyDB;

public class Stuffy {

	/* Instance variables:
	 * id, type, size, and colors are attributes of a Stuffy object
	 * types, sizes, and colors are ArrayLists of default attributes for Stuffy objects for random Stuffy generation.
	 */
	private int id;
	private String type;
	private String size;
	private String color;
	private ArrayList<String> types = new ArrayList<>();
	private ArrayList<String> sizes = new ArrayList <>();
	private ArrayList<String> colors = new ArrayList<>();
	
	// The empty constructor is used by the main method to create Stuffy objects that have block scope and will be assigned attributes after grabbing a stuffy
	public Stuffy() {
	}

	// This constructor is used by the StuffyDB class to generate random Stuffy objects and assign them IDs generated and passed in by the StuffyDB class
	public Stuffy(int id) {
		this.id = id;
		this.stuffyAttributes();
		this.type = types.get((int)(Math.random()*types.size()));
		this.size = sizes.get((int)(Math.random()*sizes.size()));
		this.color = colors.get((int)(Math.random()*colors.size()));
	}
	
	/* This constructor is used by the main application to create a new Stuffy object by getting the next available ID from the StuffyDB class
	 * and passing in user input for other attributes.
	 */
	public Stuffy(StuffyDB sdb, String type, String size, String color) {
		this.id = sdb.getNextID();
		this.type = type;
		this.size = size;
		this.color = color;
	}

	// The getId method is used by the StuffyDB class to check the ID of Stuffy objects that it stores
	public int getId() {
		return id;
	}
	
	// The doesStuffyExist method is used by the StuffyDB class to verify that a Stuffy exists
	public boolean doesStuffyExist(int id) {
		if (id == this.id)
			return true;
		else
			return false;
	}
	
	// the stuffyAttributes method fills the types, sizes, and colors ArrayLists with default data for randomly generating Stuffy objects
	private void stuffyAttributes() {
		types.add("kitty");
		types.add("doggo");
		types.add("turtle");
		types.add("panda");
		types.add("molerat");
		types.add("unicorn");
		types.add("dragon");
		sizes.add("small");
		sizes.add("medium");
		sizes.add("large");
		colors.add("white");
		colors.add("black");
		colors.add("pink");
		colors.add("striped");
		colors.add("polka dot");
		colors.add("blue");
	}
	
	@Override
	public String toString() {
		return size+" "+color+" "+type;
	}
}
