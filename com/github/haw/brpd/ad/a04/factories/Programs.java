package com.github.haw.brpd.ad.a04.factories;

import com.github.haw.brpd.ad.a04.interfaces.Command;
import com.github.haw.brpd.ad.a04.interfaces.Program;

public class Programs {
	private static final Program NOT_A_PROGRAMM = new Program() {
		public void exec() {
		}
		@Override
		public void add(Command command) {
			throw new IllegalAccessError();
		}
	}; 
	
	public static Program create() {
		return new com.github.haw.brpd.ad.a04.implementations.Program();
	}

	public static Program nap() {
		return NOT_A_PROGRAMM; 
	}
}
