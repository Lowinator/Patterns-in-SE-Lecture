package bridgePattern;

import java.util.StringTokenizer;

public class EnterpriseEncryption extends Encryption {

	public EnterpriseEncryption() {
		imp = new Caesar();
	}

	@Override
	public String encrypt(String string, byte key) {
		if (key < 10) {
			System.out.println("Insecure Key! Encryption aborted");
			throw new RuntimeException("Insecure Key! Encryption aborted");
		}
		String result = new String("");
		StringTokenizer words = new StringTokenizer(string);
		while (words.hasMoreTokens()) {
			result = result + " " + imp.encryptWord(words.nextToken(), key);
		}
		return result.toString();
	}

	@Override
	public String decrypt(String string, byte key) {
		if (key < 10) {
			System.out.println("Insecure Key! Decryption aborted");
			throw new RuntimeException("Insecure Key! Encryption aborted");
		}
		String result = new String("");
		StringTokenizer words = new StringTokenizer(string);
		while (words.hasMoreTokens()) {
			result = result + " " + imp.decryptWord(words.nextToken(), key);
		}
		return result.toString();
	}

}
