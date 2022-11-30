/*
 * Written by Marshall Pitts
 */
public class PBJSandwich {

		private bread topSlice;
		private PeanutButter peanutButter;
		private Jelly jelly;
		private bread bottomSlice;

		public bread getTopSlice() {
		return topSlice;
		}

		public void setTopSlice(bread topSlice) {
		this.topSlice = topSlice;
		}

		public PeanutButter getPeanutButter() {
		return peanutButter;
		}

		public void setPeanutButter(PeanutButter peanutButter) {
		this.peanutButter = peanutButter;
		}

		public Jelly getJelly() {
		return jelly;
		}

		public void setJelly(Jelly jelly) {
		this.jelly = jelly;
		}

		public bread getBottomSlice() {
		return bottomSlice;
		}

		public void setBottomSlice(bread bottomSlice) {
		this.bottomSlice = bottomSlice;
		}

			public boolean equals(PBJSandwich second) {
			 return (this.topSlice.equals(second.topSlice) && this.peanutButter.equals(second.peanutButter)&& this.jelly.equals(second.jelly) && bottomSlice.equals(second.bottomSlice));
			}

		public String toString() {
		return "PBJSandwich\nTop Slice:\n" + topSlice + "Peanut Butter:\n" + peanutButter + "Jelly:\n" + jelly
						+ "Bottom Slice:\n" + bottomSlice + "\n";
			}
		}
