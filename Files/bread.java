/*
 * Written by Marshall Pitts
 */
public class bread {

	
		private String name;
		private int calories;
		private String type;

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
		if (calories >= 50 && calories <= 250)
		this.calories = calories;
		}

		public String getType() {
		return type;
		}

		public void setType(String type) {
		if (type.equalsIgnoreCase("honey wheat") || type.equalsIgnoreCase("white")
		|| type.equalsIgnoreCase("whole grain") || type.equalsIgnoreCase("whole wheat")) {
		this.type = type;
		}
			}

		public boolean equals(bread second) {
			return (this.name.equalsIgnoreCase(second.name) && this.type.equalsIgnoreCase(second.type) && this.calories == second.calories);
			}

		public String toString() {
			return "Bread\nName: " + name + "\nCalories: " + calories + "\nType: " + type + "\n";
			}
		}

