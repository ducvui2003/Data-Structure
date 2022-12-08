package exercises;

import java.util.Arrays;

public class CeasarCipherFollowMe {
	private char[] encoder = new char[26];
	private char[] decoder = new char[26];

	public CeasarCipherFollowMe(int rotation) {
		for (int i = 0; i < 26; i++) {
			decoder[i] = (char) ('A' + i); 							// [A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z]
			encoder[i] = (char) ('A' + (i + rotation + 26) % 26); 	// [D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T,
																	// U, V, W, X, Y, Z, A, B, C]
		}
	}

	public static void main(String[] args) {
		CeasarCipherFollowMe test = new CeasarCipherFollowMe(3);
		System.out.println("Encoder: " + Arrays.toString(test.encoder));
		System.out.println("Decoder: " + Arrays.toString(test.decoder));
		String message = "THE EAGLE IS IN PLAY; MEET AT JOE'S.";
		String secret = test.encrypt(message);
		System.out.println("Secret: " + secret);
		System.out.println("Message: " + test.decrypt(secret));
	}

	public String encrypt(String message) {
		char[] arrayMessage = message.toUpperCase().toCharArray();
		for (int i = 0; i < arrayMessage.length; i++) {
			for (int j = 0; j < encoder.length; j++) {
				if (arrayMessage[i] == decoder[j]) {// Compare char in message with char in decoder -> get index char in decoder
					arrayMessage[i] = encoder[j];//  char in message is assigned by char in encoder with index = index char in decoder
					break;
				}
			}
		}
		return new String(arrayMessage);
	}

	public String decrypt(String secret) {
		char[] arraySecret = secret.toUpperCase().toCharArray();
		for (int i = 0; i < arraySecret.length; i++) {
			for (int j = 0; j < decoder.length; j++) {
				if (arraySecret[i] == encoder[j]) {
					arraySecret[i] = decoder[j];
					break;
				}
			}
		}
		return new String(arraySecret);
	}
}