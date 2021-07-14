package com;

import java.util.*;
import java.io.*;

public class JBitField1 {

	public static void main(String[] args) throws IOException {

		System.out.println("Enter Value1:");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String value1 = reader.readLine();
		System.out.println("Enter Value2:");
		String value2 = reader.readLine();
		checkSameCharacters(value1, value2);
	}

	public static void checkSameCharacters(String str1, String str2) {
		int finder = 0;

		for (byte i = 0; i < str1.length(); ++i) {
			finder |= (1 <<  str1.charAt(i) - 'a');
		}
		
		for (byte i = 0; i < str2.length(); i++) {
 			if ((finder & (1 <<  str2.charAt(i) - 'a')) > 0) {
				System.out.println("Common Character: " + str2.charAt(i));
			}

		}

	}

}