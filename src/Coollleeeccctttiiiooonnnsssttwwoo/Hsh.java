package Coollleeeccctttiiiooonnnsssttwwoo;

import java.util.HashMap;

public class Hsh {

	public static void main(String[] args) {
		HashMap<Integer, String> hashMapOne = new HashMap<>();

		HashMap<Integer, String>  hashMapTwo = new HashMap<>();

		hashMapOne.put(3, "three");
		hashMapOne.put(4, "four");
		hashMapOne.put(5, "five");

		hashMapTwo.put(7, "seven");
		hashMapTwo.put(8, "eight");
		hashMapTwo.put(9, "Nine");

		System.out.println("The Mappings of the HashMap hashMapOne are : "+ hashMapOne);

		System.out.println("The Mapping of the HashMap hashMapTwo are : "+ hashMapTwo);
	}
	}


