package com.nim.examples;

public class StringSubstringExample {

	public static void main(String[] args) {
		String str = "www.subtringexamples.com";
		System.out.println("Last 4 char String: " + str.substring(str.length() - 4));
		System.out.println("First 4 char String: " + str.substring(0, 4));
		System.out.println("website name: " + str.substring(4, 20));
	}
}
