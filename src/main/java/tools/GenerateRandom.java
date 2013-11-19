package tools;

import java.util.Random;

public class GenerateRandom {

	public static String generateRandomString() {

		StringBuffer buffer = new StringBuffer();
		String characters = "";

		characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";	

		int charactersLength = characters.length();

		for (int i = 0; i < 5; i++) {
			double index = Math.random() * charactersLength;
			buffer.append(characters.charAt((int) index));
		}
		return buffer.toString();
	}

	public static String generate_random_email() {
		Random random = new Random();
		int f = random.nextInt(2000 - 1000 + 1) + 1000;
		String emailAdd="user" + f + "@evozon.com";
		return emailAdd;
	}

}
