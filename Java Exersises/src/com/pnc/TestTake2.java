package com.pnc;

public class TestTake2 {

	public static void main(String[] args) {

		char[] message = { 'c', 'a', 'k', 'e', ' ', 'p', 'o', 'u', 'n', 'd', ' ', 's', 't', 'e', 'a', 'l' };

		//reverseWords(message);
		System.out.println(reverseWords(message));

	}

	public static String reverseWords(char[] message) {
		String strMessage = String.valueOf(message); // message char[] to String
		String newMessage = " ";
		String[] arrOfStr = strMessage.split(" "); // split the message into string array

		for (int i = arrOfStr.length - 1; i >= 0; i--) { // reverse message
			newMessage += arrOfStr[i] + " ";

		}
		newMessage = newMessage.trim();
		return newMessage;

	}

}
