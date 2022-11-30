/*
 * Written by Marshall Pitts
 */
public class PeanutButter {

		private String name;
		private int calories;
		private boolean isCrunchy;

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
		if (calories >= 100 && calories <= 300) {
		this.calories = calories;
		}
		}

		public boolean isCrunchy() {
		return isCrunchy;
		}

		public void setCrunchy(boolean isCrunchy) {
		this.isCrunchy = isCrunchy;
		}

		public boolean equals(PeanutButter second) {
			 return (this.name.equalsIgnoreCase(second.name) && this.calories == second.calories && this.isCrunchy == second.isCrunchy);
		    
			}

			public String toString() {
				return "PeanutButter\nName: " + name + "\nCalories: " + calories + "\nIs Crunchy:" + isCrunchy + "\n";
			}
		}
	
