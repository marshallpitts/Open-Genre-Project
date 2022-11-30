/*
 * Written by Marshall Pitts
 */
public class StringHelperMain  {

	public static void main(String[] args) {

		System.out.println("Welcome to the String Helper Tester");
		System.out.println("Testing Has All Unique Characters with \"facetiously\"");
		System.out.println(StringHelper.hasAllUniqueCharacters("facetiously"));
		
		System.out.println("Testing Has All Unique Characters with \"banana\"");
		System.out.println(StringHelper.hasAllUniqueCharacters("banana"));
		
		System.out.println("Testing Mesh Strings with \"harp\" and \"fiddle\"");
		System.out.println(StringHelper.meshSprings("harp", "fiddle"));
		
		System.out.println("Testing Mesh Strings with \"granola\" and \"bug\"");
		System.out.println(StringHelper.meshSprings("granola", "bug"));
		
		System.out.println("Testing Replcae Vowel with Oodle with \"burrito\"");
		System.out.println(StringHelper.replaceVowelsWith0odle("burrito"));
		
		System.out.println("Testing Replcae Vowel with Oodle with \"spoon\"");
		System.out.println(StringHelper.replaceVowelsWith0odle("spoon"));
		
		System.out.println("Testing Weight with \"heavy\"");
		System.out.println(StringHelper.weight("heavy"));
		
		System.out.println("Testing Weight with \"light\"");
		System.out.println(StringHelper.weight("light"));
		
		
		
	}

}
