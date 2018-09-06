package Utililities;

public class MyClass {

	public String getLongestWordAndCount(String sentence) {

		int length = 0;
		String longestWord = null;
		if (sentence != null) {

			if (sentence != "") {
				String[] words = sentence.split(" ");
				for (String word : words) {
					if (length < word.length()) {
						length = word.length();
						longestWord = word;
					}
				}
			}else  {
				return "You can not pass empty sentence.";
			}
		return longestWord + " " + length;
		}else {
			return "You can not pass null value.";
		}
	}

}
