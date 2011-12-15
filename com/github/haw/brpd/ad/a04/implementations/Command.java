package com.github.haw.brpd.ad.a04.implementations;

import com.github.haw.brpd.ad.a04.interfaces.Enviroment;

public abstract class Command implements com.github.haw.brpd.ad.a04.interfaces.Command {

	
	private final String symbol;

	public Command(String symbol) {
		this.symbol = symbol;
	}

	@Override
	public abstract void exec(Enviroment env);

	@Override
	public String symbol() {
		return this.symbol;
	}
}
