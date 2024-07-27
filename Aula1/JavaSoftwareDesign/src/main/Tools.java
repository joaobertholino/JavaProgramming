package main;

public class Tools {
	public static char optional = 'A';
	public char alternative = 'Y';

	public static char printOptional() {
		return Tools.optional;
	}

	public static char printAlternative() {
		char altern = 'L';
		return altern;
	}

	public char printOp() {
		return Tools.optional;
	}

	public static String display(String str) {
		return str;
	}

	public static String display(String str1, double str2) {
		return str1 + " " + str2;
	}


}
