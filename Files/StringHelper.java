/*
 * Written by Marshall Pitts
 */
public class StringHelper {
	
	private static int countChar(String s, char match) {
		int rc = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == match) {
				rc++;
			}
		}
		return rc;
	}
	
	private static boolean isAVowel(char c) {
		boolean rc;
		switch (c) {
		case 'A':
		case 'a':
		case 'E':
		case 'e':
		case 'I':
		case 'i':
		case 'U':
		case 'u':
			rc = true;
			break;
			default:
				rc = false;
		}
		return rc;
	}
	
	public static boolean hasAllUniqueCharacters(String s) {
		boolean rc = false;
		if (s != null) {
			int totalCount = 0;
			for (int i = 0; i < s.length(); i++) {
				totalCount += countChar(s, s.charAt(i));
			}
			rc = totalCount == s.length();
		}
		return rc;
	}
	public static String meshSprings(String s1, String s2) {
		String rc = "";
		if (s1 != null && s2 != null) {
			int maxLength = s1.length();
			if (s2.length() > s1.length()) {
				maxLength = s2.length();
			}
			
			for (int i = 0; i < maxLength; i++) {
				if (i < s1.length()) {
					rc += s1.charAt(i);
				}
				if (i < s2.length()) {
					rc += s2.charAt(i);
				}
			}
		}
		return rc;
	}
	
	public static String replaceVowelsWith0odle(String s) {
		String rc = "";
		if (s != null) {
			for (int i = 0; i < s.length(); i++) {
				if (isAVowel(s.charAt(i))) {
					rc += "oodle";
				} else {
					rc += s.charAt(i);
				}
			}
			
			
		}
		
		return rc;
	}
	public static double weight(String s ) {
		double rc = 0;
		for (int i = 0; i < s.length(); i++) {
			if (isAVowel(s.charAt(i))) {
				rc += 2.5;
			} else {
				rc += 3.4;
			}
		}
		
	return rc;
	}
}
 
		


