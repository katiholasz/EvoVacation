package tools;

public class GenerateRandomUserName {
		
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
	
}
