package bridgePattern;public class Caesar implements Cipher {	public String encryptWord(String w, byte k) {		if (w.contains(" ")) {			throw new IllegalArgumentException("No spaces allowed!");		}		String result = new String();		int nkey = k % 26; // normalized key		w = w.toLowerCase(); // to be sure that we have only lower cases		for (int i = 0; i < w.length(); i++) {			char ch = w.charAt(i);			ch = (char) ('a' + (ch - 'a' + nkey) % 26);			result = result + ch;		}		return result;	}	public String decryptWord(String w, byte k) {		if (w.contains(" ")) {			throw new IllegalArgumentException("No spaces allowed!");		}		String result = new String();		int nkey = k % 26; // normalized key		w = w.toLowerCase(); // to be sure that we have only lower cases		for (int i = 0; i < w.length(); i++) {			char ch = w.charAt(i);			ch = (char) ('a' + (ch - 'a' + (26 - nkey)) % 26);			result = result + ch;		}		return result;	}}