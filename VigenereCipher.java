public class VigenereCipher {

    public static String encrypt(String text, String key){
        String EMessage = "";
        key = key.toUpperCase();
        text = text.toUpperCase();

        for (int i = 0, j = 0; i < text.length(); i++) {
			char letter = text.charAt(i);
            if (letter < 'A' || letter > 'Z') continue;
            EMessage += (char)(((letter - 65) + (key.charAt(j)-65)) % 26 + 65);
            j = ++j % key.length();
		}
		return EMessage; 
    }

    public static String decrypt(String text, String key){
        String DMessage = "";
        key = key.toUpperCase();
        text = text.toUpperCase();

        for (int i = 0, j = 0; i < text.length(); i++) {
			char letter = text.charAt(i);
            if (letter < 'A' || letter > 'Z') continue;
            DMessage += (char)(((letter - 65) - (key.charAt(j)-65) + 26) % 26 + 65);
            j = ++j % key.length();
		}
		return DMessage; 
    }
}