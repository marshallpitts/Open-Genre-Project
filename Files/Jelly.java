/*
 * Written by Marshall Pitts
 */
public class Jelly {


	private String name;
	private int calories;
	private String fruitType;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		if (calories >= 50 && calories <= 200) {
			this.calories = calories;
		}
	}

	public String getFruitType() {
		return fruitType;
	}

	public void setFruitType(String fruitType) {
		if (fruitType.equalsIgnoreCase("apple") || fruitType.equalsIgnoreCase("blueberry")
		||	 fruitType.equalsIgnoreCase("grape") || fruitType.equalsIgnoreCase("strawberry")
		|| fruitType.equalsIgnoreCase("tomato")) {
			this.fruitType = fruitType;
		}
	}

	public boolean equals(Jelly second) {
		return (this.name.equalsIgnoreCase(second.name) && this.calories == second.calories && this.fruitType.equalsIgnoreCase(second.fruitType));
	}

	public String toString() {
		return "Jelly\nName: " + name + "\nCalories: " + calories + "\nFruit Type: " + fruitType + "\n";
	
	
		}
	}