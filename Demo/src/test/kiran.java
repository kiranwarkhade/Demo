package test;

import java.util.Arrays;

public class kiran {

	class Solution {

		private static class PanagramDetector {
			private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

			/**
			 * Finds the letters of the alphabet not included in the input string
			 *
			 * @param sentence a string to examine
			 * @return a string made up of the missing letters of the alphabet in sorted
			 *         order
			 */
			public String findMissingLetters(String sentence) {
				boolean[] letterPresent = new boolean[26];
				String lowerCaseSentence = sentence.toLowerCase();

				for (int i = 0; i < lowerCaseSentence.length(); i++) {
					char c = lowerCaseSentence.charAt(i);
					if (c >= 'a' && c <= 'z') {
						int index = c - 'a';
						letterPresent[index] = true;
					}
				}

				StringBuilder missingLetters = new StringBuilder();
				for (int i = 0; i < 26; i++) {
					if (!letterPresent[i]) {
						missingLetters.append((char) ('a' + i));
					}
				}

				return missingLetters.toString();
			}
		}

		public static void main(String[] args) {
			PanagramDetector pd = new PanagramDetector();
			boolean success = true;

			success = success && "".equals(pd.findMissingLetters("The quick brown fox jumps over the lazy dog"));
			success = success && "bfgjkvz"
					.equals(pd.findMissingLetters("The slow purple oryx meanders past the quiescent canine"));
			success = success && "cdfjklmopqruvxyz".equals(pd.findMissingLetters("We hates Bagginses!"));
			success = success && "abcdefghijklmnopqrstuvwxyz".equals(pd.findMissingLetters(""));

			if (success) {
				System.out.println("All tests passed.");
			} else {
				System.out.println("At least one of your tests failed.");
			}
		}
	}

}
