package bridgePattern;

import java.util.StringTokenizer;

public class PersonalEncryption extends Encryption {

	public PersonalEncryption() {
		imp = new Transpose();
	}

	@Override
	public String encrypt(String string, byte key) {
		String result = new String("");
		StringTokenizer words = new StringTokenizer(string);
		while (words.hasMoreTokens()) {
			result = result + " " + imp.encryptWord(words.nextToken(), key);
		}
		return result.toString();
	}

	@Override
	public String decrypt(String string, byte key) {
		String result = new String("");
		StringTokenizer words = new StringTokenizer(string);
		while (words.hasMoreTokens()) {
			result = result + " " + imp.decryptWord(words.nextToken(), key);
		}
		return result.toString();
	}

}
