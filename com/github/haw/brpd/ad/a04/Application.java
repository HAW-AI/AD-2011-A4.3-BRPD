package com.github.haw.brpd.ad.a04;

import static com.github.haw.brpd.ad.a04.Programm.*;

public class Application {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] input = new String[] {"W+W+WCPC","W--CP+++C"};
		for (String e : input) {
			exec(programm(e));
		}
	}
}
