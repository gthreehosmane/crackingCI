package arrays_strings;

public class StringContainsUniqueChars {

	//Program to find if a string contains all unique characters
	public static void main(String[] args) {
		String s = "tejja";
		System.out.println(containsUnique(s));

	}
	public static boolean containsUnique(String s) {
		boolean result = true;
		int[] count = new int[26];
		for(char c:s.toCharArray()) {
			count[c-'a']++;
		}
		for(int i=0;i<count.length;i++) {
			if(count[i]>1)
			{   result = false;
				break;
			}
		}
		return result;
		/* follow up 
		 * time complexity of the solution is O(n) and space is O(1) since we are using an array of fixed length;
		 * if you are not allowed to use extra DS you could use 2 for loops with
		 * O(n2) complexity
		 * 
		 * if you are allowed to modify the input string, sort the array and check if adjacent chars are same
		 */
		
	}

}
