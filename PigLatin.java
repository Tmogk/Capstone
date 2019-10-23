package co.grandcircus;

import java.util.Scanner;

public class PigLatin {

	// Author: Tyler Mogk

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);
		System.out.println("Welcome to the Pig Latin Translator!");
		System.out.println("Enter a line to be translated: ");

		String cont = "yes";

		while (cont.contentEquals("yes")) {
			String userWord = scnr.next();
			userWord = userWord.toLowerCase();

			if (userWord.startsWith("a")) {
				StringBuffer pigWord = new StringBuffer(userWord);
				pigWord.append("way");
				System.out.println(pigWord);
			} else if (userWord.startsWith("e")) {
				StringBuffer pigWord = new StringBuffer(userWord);
				pigWord.append("way");
				System.out.println(pigWord);
			} else if (userWord.startsWith("i")) {
				StringBuffer pigWord = new StringBuffer(userWord);
				pigWord.append("way");
				System.out.println(pigWord);
			} else if (userWord.startsWith("o")) {
				StringBuffer pigWord = new StringBuffer(userWord);
				pigWord.append("way");
				System.out.println(pigWord);
			} else if (userWord.startsWith("u")) {
				StringBuffer pigWord = new StringBuffer(userWord);
				pigWord.append("way");
				System.out.println(pigWord);
			} else {

				String omitFirstLetter = userWord.substring(1);
				char beginningChar = userWord.charAt(0);
				System.out.println(omitFirstLetter + beginningChar + "ay");
				break;
			}
			System.out.println("Translate another line? (yes/no)");
			userWord = scnr.next();
			cont = scnr.next();
			System.out.println("Goodbye!");
		}

		scnr.close();

	}

	private static char charAt(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static Object split(String userWord) {
		// TODO Auto-generated method stub
		return null;
	}

}
